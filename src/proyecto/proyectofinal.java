package proyecto;
import java.util.Scanner;
/**
 *
 * @author Jorge Latorre
 */

public class proyectofinal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ingreso de datos del proyecto
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = input.nextLine();

        System.out.print("Ingrese la primera compra: ");
        double compra1 = input.nextDouble();

        System.out.print("Ingrese la segunda compra: ");
        double compra2 = input.nextDouble();

        System.out.print("Ingrese la tercera compra: ");
        double compra3 = input.nextDouble();

        // Procesamiento del proyecto
        double totalCompras = compra1 + compra2 + compra3;
        double promedioCompras = totalCompras / 3;

        // Resultados finales
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Nombre del cliente     Sr./Sra. : " + nombre);
        System.out.println("Total de compras        : " + totalCompras);
        System.out.println("Promedio de compras     : " + promedioCompras);
    }
    
}
