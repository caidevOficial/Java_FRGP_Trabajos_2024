package ejercicio2;

import java.util.ArrayList;

public class MainEjercicio2 {

    /**
     * @param args
     */

    public static void main(String[] args) {
        ArrayList<Producto> Productos = new ArrayList<Producto>(3);
        
        // Agrego producto fresco
        Productos.add(new ProductoFresco("23/03/2024", 1505, "15/12/2023", "Argentina"));

        // Agrego producto Refrigerado
        Productos.add(new ProductoRefrigerado("10/04/2024", 2006, "018412764-4"));

        // Agrego producto Congelado
        Productos.add(new ProductoCongelado("17/10/2024", 1234, -17));

        for (Producto item : Productos) {
            System.out.println(item.toString());
        }
    }
}