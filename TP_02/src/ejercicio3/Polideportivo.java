package ejercicio3;

public class Polideportivo implements EdificioInterfaz, InstalacionDeportivaInterfaz {
	
	 private String nombre;
	    private double superficie;

	    public Polideportivo(String nombre, double superficie) {
	        this.nombre = nombre;
	        this.superficie = superficie;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    @Override
	    public int getTipoDeInstalacion() {
	        return 0; 
	    }

	    @Override
	    public double getSuperficieEdificio() {
	        return superficie;
	    }
}
