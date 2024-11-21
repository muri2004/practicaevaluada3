/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaevaluada3;

/**
 *
 * @author smuri
 */
public class Practicaevaluada3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Productos[] productos = new Productos[3];

        productos[0] = new Productos("Arroz");
        productos[1] = new Productos("Leche");
        productos[2] = new Productos("Pan");

        for (Productos producto : productos) {
            System.out.println("Ingrese las ventas para " + producto.getNombre() + " (Lunes a Domingo):");
            int[] ventas = new int[7];
            for (int i = 0; i < 7; i++) {
                ventas[i] = scanner.nextInt();
            }
            productos.setVentas(ventas);
        }
        Ventas ventas = new Ventas(productos);
        Ventas.mostrarVentas();
        Ventas.mostrarTotalVentas();

        scanner.close();
    }
}



