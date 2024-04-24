package ejercicio2;

public class ProductoRefrigerado extends Producto{

	private String codOrgSupAlimentaria;
	
	public ProductoRefrigerado() {
		super();
	}
	
	public ProductoRefrigerado(String fechaCaducidad, int numLote, String codOrgSupAlimentaria) {
		super(fechaCaducidad, numLote);
		
		this.codOrgSupAlimentaria = codOrgSupAlimentaria;
	}

	/**
	 * The function `getCodOrgSupAlimentaria` returns the value of the `codOrgSupAlimentaria` attribute.
	 * 
	 * @return The method `getCodOrgSupAlimentaria` is returning the value of the variable
	 * `codOrgSupAlimentaria`.
	 */
	public String getCodOrgSupAlimentaria() {
		return this.codOrgSupAlimentaria;
	}

	/**
	 * The function sets the value of the codOrgSupAlimentaria variable in a Java class.
	 * 
	 * @param codOrgSupAlimentaria The parameter `codOrgSupAlimentaria` is a String type that represents
	 * the code of the supervisory organization for food safety. The `setCodOrgSupAlimentaria` method is
	 * used to set this code in the class where it is defined.
	 */
	public void setCodOrgSupAlimentaria(String codOrgSupAlimentaria) {
		this.codOrgSupAlimentaria = codOrgSupAlimentaria;
	}

	@Override
	// The `toString()` method in the `ProductoRefrigerado` class is overriding the default `toString()`
	// method inherited from the `Object` class.
	public String toString() {
		StringBuilder mensaje = new StringBuilder();
		
		mensaje.append("*************************\n");
		mensaje.append("* Producto Refrigerado.\n");
		mensaje.append(String.format("* Codigo del Organismo de Supervisión Alimentaria: %s \n", this.getCodOrgSupAlimentaria()));
		mensaje.append(super.toString());
		
		return mensaje.toString();
	}

	@Override
	// This `equals` method in the `ProductoRefrigerado` class is used to compare two objects for
	// equality. Here's a breakdown of what it does:
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductoRefrigerado other = (ProductoRefrigerado) obj;
		if (codOrgSupAlimentaria == null) {
			if (other.codOrgSupAlimentaria != null)
				return false;
		} else if (!codOrgSupAlimentaria.equals(other.codOrgSupAlimentaria))
			return false;
		return true;
	}
	
}
