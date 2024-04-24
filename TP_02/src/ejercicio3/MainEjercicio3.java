

package ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;

public class MainEjercicio3 {

	public static void main(String[] args) {
        ArrayList<EdificioInterfaz> edificios = new ArrayList<>();

        edificios.add(new Polideportivo("Polideportivo Ricardo Rojas", 1000.0));
        edificios.add(new Polideportivo("Polideportivo Manuel Belgrano", 1500.0));
        edificios.add(new Polideportivo("Polideportivo Tigre", 2200.0));
        edificios.add(new EdificioDeOficinas(500.0, 10));
        edificios.add(new EdificioDeOficinas(800.0, 15));

        Iterator<EdificioInterfaz> iterator = edificios.iterator();
        while (iterator.hasNext()) {
        	EdificioInterfaz edificio = iterator.next();
            if (edificio instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) edificio;
                System.out.println("Nombre: " + polideportivo.getNombre());
            } else if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas edificioOficinas = (EdificioDeOficinas) edificio;
                System.out.println("Cantidad de oficinas: " + edificioOficinas.getNumOficinas());
            }
            System.out.println("Superficie: " + edificio.getSuperficieEdificio());
            System.out.println(); 
        }
	}
}
