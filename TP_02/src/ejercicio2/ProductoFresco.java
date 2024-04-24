package ejercicio2;

public class ProductoFresco extends Producto {

	private String fechaEnvasado;
	private String paisOrigen;
	
	public ProductoFresco() {
		super();
	}
	
	public ProductoFresco(String fechaCaducidad, int numLote, String fechaEnvasado, String paisOrigen) {
		super(fechaCaducidad, numLote);
		
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}
	
	/**
	 * The function `setFechaEnvasado` sets the value of the `fechaEnvasado` variable in a Java class.
	 * 
	 * @param fechaEnvasado The `setFechaEnvasado` method is a setter method used to assign a value to the
	 * `fechaEnvasado` attribute of an object. The parameter `fechaEnvasado` is the value that will be
	 * assigned to the `fechaEnvasado` attribute.
	 */
	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}
	
	/**
	 * This Java function sets the country of origin for an object.
	 * 
	 * @param paisOrigen The `setPaisOrigen` method is a setter method used to assign a value to the
	 * `paisOrigen` instance variable in a Java class. The `paisOrigen` parameter is the value that will
	 * be assigned to the `paisOrigen` instance variable when this method is called
	 */
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	/**
	 * The function `getFechaEnvasado` returns the value of the `fechaEnvasado` attribute in a Java class.
	 * 
	 * @return The method `getFechaEnvasado` is returning the value of the `fechaEnvasado` attribute.
	 */
	public String getFechaEnvasado() {
		return this.fechaEnvasado;
	}

	/**
	 * The function `getPaisOrigen()` returns the value of the `paisOrigen` attribute.
	 * 
	 * @return The method `getPaisOrigen` is returning the value of the instance variable `paisOrigen`.
	 */
	public String getPaisOrigen() {
		return this.paisOrigen;
	}

	@Override
	// The `toString()` method in the `ProductoFresco` class is overriding the default `toString()` method
	// inherited from the `Object` class. When an object of the `ProductoFresco` class is printed or
	// converted to a string, this method is called to return a string representation of the object.
	public String toString() {
		StringBuilder mensaje = new StringBuilder();
		
		mensaje.append("*************************\n");
		mensaje.append("* Producto Fresco.\n");
		mensaje.append(String.format("* Fecha de Envasado: %s .\n", this.getFechaEnvasado()));
		mensaje.append(String.format("* Pais de Origen: %s .\n", this.getPaisOrigen()));
		mensaje.append(super.toString());

		return mensaje.toString();
	}

	@Override
	// The `equals(Object obj)` method in the `ProductoFresco` class is overriding the default `equals`
	// method inherited from the `Object` class. This method is used to compare two objects for equality.
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductoFresco other = (ProductoFresco) obj;
		if (fechaEnvasado == null) {
			if (other.fechaEnvasado != null)
				return false;
		} else if (!fechaEnvasado.equals(other.fechaEnvasado))
			return false;
		if (paisOrigen == null) {
			if (other.paisOrigen != null)
				return false;
		} else if (!paisOrigen.equals(other.paisOrigen))
			return false;
		return true;
	}

}
