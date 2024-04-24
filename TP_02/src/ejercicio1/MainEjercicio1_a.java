package ejercicio1;

import java.util.LinkedList;
import java.util.ListIterator;

public class MainEjercicio1_a {

	public static void main(String[] args) {

			Profesor profeA = new Profesor("Ana",22,"Ayudante",5, "111111");
			Profesor profeB = new Profesor("Jose",31,"Profesor",8, "2222222");
			Profesor profeC = new Profesor("Miguel",26,"Ayudante",2, "3333333");
			Profesor profeD = new Profesor("Carlos",52,"Directivo",11, "444444");
			Profesor profeE = new Profesor("Florencia",32,"Profesor",1, "555555");

			LinkedList<Empleado> empleados = new LinkedList<Empleado>();

			empleados.add(profeA);
			empleados.add(profeB);
			empleados.add(profeC);
			empleados.add(profeD);
			empleados.add(profeE);

			ListIterator<Empleado> empleadoIt = empleados.listIterator();
			
			while(empleadoIt.hasNext()) {
				Empleado empleado = empleadoIt.next();
				
				empleadoIt.remove();
				System.out.println(empleado);
			}
	}

}
