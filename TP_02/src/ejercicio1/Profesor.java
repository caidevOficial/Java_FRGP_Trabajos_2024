package ejercicio1;

public class Profesor extends Empleado implements Comparable<Profesor> {

	private String cargo;
	private int antiguedadDocente;
	private String legajo;

	public Profesor() {

		super();

	}

	public Profesor(String nombre,int edad,String cargo,int antiguedadDocente, String legajo) {

		super(nombre,edad);

		this.cargo=cargo;
		this.antiguedadDocente=antiguedadDocente;
		this.legajo = legajo;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public String getCargo() {

		return cargo;
	}

	public void setCargo(String cargo) {

		this.cargo = cargo;
	}

	public int getAntiguedadDocente() {

		return antiguedadDocente;
	}

	public void setAntiguedadDocente(int antiguedadDocente) {

		this.antiguedadDocente = antiguedadDocente;
	}

	@Override
	public String toString() {
		StringBuilder mensaje = new StringBuilder();
		
		mensaje.append("*************************\n");
		mensaje.append("* ID : "+this.getId()+". \n");
		mensaje.append("* Nombre: "+this.getNombre()+".\n");
		mensaje.append("* Edad : "+this.getEdad()+". \n");
		mensaje.append("* Cargo : "+this.getCargo()+". \n");
		mensaje.append("* Antigüedad Docente: "+this.getAntiguedadDocente()+". \n");
		mensaje.append("*************************\n");

		return mensaje.toString();
	}

	@Override
	public int compareTo(Profesor o) {
		if(this.cargo == o.cargo || 
			this.antiguedadDocente == o.antiguedadDocente || 
			this.getNombre().equals(o.getNombre()) || 
			this.getEdad() == o.getEdad() || 
			this.legajo == o.legajo) {
			return 0;
		}
		
		return 1;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
			if (!super.equals(obj) || getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		if (antiguedadDocente != other.antiguedadDocente)
			return false;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		if (legajo == null) {
			if (other.legajo != null)
				return false;
		} else if (!legajo.equals(other.legajo))
			return false;
		return true;
	}

	

}
