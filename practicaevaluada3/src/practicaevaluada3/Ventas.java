/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaevaluada3;

import java.util.Scanner;

/**
 *
 * @author smuri
 */
public class Ventas {
    private final Productos[] productos;
    public Ventas(Productos[] productos) {
        this.productos = productos;
    }
    public void registrarVentas() {
        Scanner scanner = new Scanner(System.in);
        for (Productos producto : productos) {
            System.out.println("Ingrese las ventas para " + producto.getNombre() + " (Lunes a Domingo):");
            for (int dia = 0; dia < 7; dia++) {
                System.out.print("Ventas del día " + (dia + 1) + ": ");
                int cantidad = scanner.nextInt();
                producto.setVentas(dia, cantidad);
            }
        }
    }
    public void mostrarResultados() {
        System.out.println("Resultados de ventas:");
        for (Productos producto : productos) {
            System.out.println(producto.getNombre() + " • Ventas Totales: " + producto.getTotalVentas());
        }
    }
    public void mostrarProductoConMasVentas() {
        Productos mejorProducto = null;
        for (Productos producto : productos) {
            if (mejorProducto == null || producto.getTotalVentas() > mejorProducto.getTotalVentas()) {
                mejorProducto = producto;
            }
        }
        if (mejorProducto != null) {
            System.out.println("El producto con más ventas es: " + mejorProducto.getNombre() + " con " + mejorProducto.getTotalVentas() + " ventas.");
        }
    }
}
