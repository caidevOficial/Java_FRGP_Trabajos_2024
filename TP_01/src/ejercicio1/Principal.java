
package ejercicio1;

import java.util.LinkedList;

public class Principal {

	public static void main(String[] args) {

		LinkedList<Empleado> empleados = new LinkedList<Empleado>();
		int limiteEmpleados = 5;
		
		for (int i = 0; i < limiteEmpleados; i++) {
			if (empleados.isEmpty()) {
				empleados.add(new Empleado());
			} else {
				empleados.add(new Empleado(String.format("Empleado_%s",i + 1), (int)(22 * i / 2 + 20)));
			}
		}

		for ( Empleado e: empleados) {
			System.out.println(e);
		}
		
		Empleado.devuelveProximoID();
	}
}
