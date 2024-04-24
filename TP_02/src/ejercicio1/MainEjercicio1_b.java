package ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class MainEjercicio1_b {

	public static void main(String[] args) {
		TreeSet <Profesor> treeProfesor = new TreeSet<Profesor>();
		
		treeProfesor.add(new Profesor("Juan", 23, "Profesor", 1, "111111"));
		treeProfesor.add(new Profesor("Pedro", 35, "Jefe de cátedra", 10, "222222"));
		treeProfesor.add(new Profesor("Mariana", 52, "Directora", 20, "333333"));
		treeProfesor.add(new Profesor("Osvaldo", 30, "Profesor", 3, "4444444"));
		treeProfesor.add(new Profesor("Malena", 34, "Profesor", 7, "555555"));
		treeProfesor.add(new Profesor("Malena", 34, "Profesor", 7, "6666666"));
		
		Iterator<Profesor> profesorIterator = treeProfesor.iterator();
		
		while(profesorIterator.hasNext()) {
			Profesor profesorAux = profesorIterator.next();
			
			profesorIterator.remove();
			System.out.println(profesorAux);
		}
		
		Profesor profeA = new Profesor("Jose", 33, "Profesor", 10, "32165498");
		Profesor profeB = new Profesor("Jose", 33, "Profesor", 10, "32165498");
		
		if (profeA.equals(profeB))
		{
			System.out.println("Es el mismo profesor");
		}
		else
		{
			System.out.println("No es el mismo profesor");
		}
	}
}
