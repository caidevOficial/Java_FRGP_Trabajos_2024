package ejercicio1;

public class Empleado {

	private final int id;
	private String nombre;
	private int edad;
	
	
	//ATRIBUTO DE CLASE 
	static int cont = 0;
	static int baseID = 1000;
	
	
	//CONSTRUCTORES
	/**
	 * Constructor of the Employee class, initializes the object with "Sin Nombre" as a name
	 * and 99 as an age.
	 */
	public Empleado(){
		this.nombre = "sin nombre";
		this.edad = 99;
		
		this.id = baseID + cont;
		cont++;
	}
	
	/**
	 * Constructor of the class Employee with two parameters.
	 * @param Nombre The employee name.
	 * @param Edad The employee age, should be an integer.
	 */
	public Empleado(String nombre, int edad){
		this.setNombre(nombre);
		this.setEdad(edad);
		this.id = baseID + cont;
		cont++;
	}
	
	// GETTERS AND SETTERS
	
	/**
	 * This Java function returns the value of the id attribute.
	 * 
	 * @return The method `getId()` is returning the value of the `id` variable.
	 */
	public int getId() {
		return id;
	}

	/**
	 * The function `getNombre()` returns the value of the `nombre` variable as a String.
	 * 
	 * @return The method `getNombre()` is returning the value of the variable `nombre`, which is likely a
	 * String representing a name.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Gets the employee age.
	 * @return The employee age as an integer.
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Sets the employee name.
	 * @param nombre The employee name as a string.
	 */
	public void setNombre(String nombre) {
		if(!nombre.isEmpty()) {
			this.nombre = nombre;
		}
	}
	
	/**
	 * Sets the employee age.
	 * @param edad The age of the employee, as an integer.
	 */
	public void setEdad(int edad) {
		if(edad > 0) {
			this.edad = edad;
		}
	}
	
	
	/**
	 * Gets a message that indicates the next available ID for the employee.
	 */
	public static void devuelveProximoID() {
		String mensaje = String.format("El proximo ID sera: %s", (baseID + cont));
		System.out.println(mensaje);
	}
	
	
	/**
	 * Creates a string with the entire info of the object attributes.
	 * @return The message with the info of the object attributes as a string.
	 */
	public String toString() {
		StringBuilder mensaje = new StringBuilder();
		mensaje.append("*************************\n");
		mensaje.append("* Nombre: "+this.nombre+".\n");
		mensaje.append("* Edad  : "+this.edad+", \n");
		mensaje.append("* Legajo: "+this.id+". \n");
		mensaje.append("*************************\n");
		
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
		Empleado other = (Empleado) obj;
		if (edad != other.edad)
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
}
