package ejercicio2;
 
 
public class ProductoCongelado extends Producto{

	private float tempCongelacion;
	
	// The `public ProductoCongelado() { super(); }` constructor in the `ProductoCongelado` class is a
	// no-argument constructor that calls the constructor of the superclass `Producto` using `super()`.
	// This means that when an instance of `ProductoCongelado` is created without any arguments, it will
	// call the superclass constructor to initialize any fields or perform any necessary setup defined in
	// the superclass `Producto`.
	public ProductoCongelado() {
		super();
	}
	
	// The `public ProductoCongelado(String fechaCaducidad, int numLote, float tempCongelacion)`
	// constructor in the `ProductoCongelado` class is a parameterized constructor that takes three
	// arguments: `fechaCaducidad`, `numLote`, and `tempCongelacion`.
	public ProductoCongelado(String fechaCaducidad, int numLote, float tempCongelacion) {
		super(fechaCaducidad, numLote);
		this.tempCongelacion = tempCongelacion;
	}

	/**
	 * The function returns the value of the "tempCongelacion" attribute as a float.
	 * 
	 * @return The method `getTempCongelacion` is returning the value of the `tempCongelacion` attribute,
	 * which is a float representing the freezing temperature.
	 */
	public float getTempCongelacion() {
		return this.tempCongelacion;
	}

	/**
	 * This Java function sets the temperature of freezing for an object.
	 * 
	 * @param tempCongelacion The parameter `tempCongelacion` represents the temperature at which a
	 * substance freezes or solidifies.
	 */
	public void setTempCongelacion(float tempCongelacion) {
		this.tempCongelacion = tempCongelacion;
	}

	@Override
	// The `public String toString()` method in the `ProductoCongelado` class is overriding the
	// `toString()` method inherited from the superclass `Object`.
	public String toString() {
		StringBuilder mensaje = new StringBuilder();
		mensaje.append("*************************\n");
		mensaje.append("* Producto Congelado.\n");
		mensaje.append(String.format("* Temperatura de Congelacion Recomendada : %.2f °C.\n", this.getTempCongelacion()));
		mensaje.append(super.toString());
		
		return mensaje.toString();
	}

	@Override
	// The `public boolean equals(Object obj)` method in the `ProductoCongelado` class is overriding the
	// `equals` method inherited from the superclass `Object`. This method is used to compare two objects
	// for equality.
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductoCongelado other = (ProductoCongelado) obj;
		if (Float.floatToIntBits(tempCongelacion) != Float.floatToIntBits(other.tempCongelacion))
			return false;
		return true;
	}
}
