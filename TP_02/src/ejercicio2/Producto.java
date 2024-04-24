package ejercicio2;

public class Producto {
	
	private String fechaCaducidad;
	private int numLote;
	
	public Producto() 
	{
		
	}
	
	public Producto(String fechaCaducidad, int numLote) {
		this.fechaCaducidad = fechaCaducidad;
		this.numLote = numLote;
	}

	public void setNumLote(int numLote) {
		this.numLote = numLote;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public int getNumLote() {
		return numLote;
	}

	@Override
	public String toString() {
		StringBuilder mensaje = new StringBuilder();
		
		mensaje.append("* Fecha de Caducidad : " + this.getFechaCaducidad() + ". \n");
		mensaje.append("* Numero de Lote : " + this.getNumLote() + ". \n");
		
		return mensaje.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (fechaCaducidad == null) {
			if (other.fechaCaducidad != null)
				return false;
		} else if (!fechaCaducidad.equals(other.fechaCaducidad))
			return false;
		if (numLote != other.numLote)
			return false;
		return true;
	}
	
}
