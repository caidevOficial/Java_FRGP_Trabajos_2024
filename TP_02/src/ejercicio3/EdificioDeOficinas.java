package ejercicio3;

public class EdificioDeOficinas implements EdificioInterfaz {

	  private double superficie;
	    private int numOficinas;

	    public EdificioDeOficinas(double superficie, int numOficinas) {
	        this.superficie = superficie;
	        this.numOficinas = numOficinas;
	    }

	    public int getNumOficinas() {
	        return numOficinas;
	    }

	    @Override
	    public double getSuperficieEdificio() {
	        return superficie;
	    }
}
