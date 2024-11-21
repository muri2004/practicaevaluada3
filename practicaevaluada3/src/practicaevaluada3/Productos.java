/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaevaluada3;

/**
 *
 * @author smuri
 */
public class Productos {
      private final String nombre;
      private final int[] ventas;
    public Productos(String nombre) {
        this.nombre = nombre;
        this.ventas = new int[7];  
    }
    public String getNombre() {
        return nombre;
    }
    public void setVentas(int dia, int cantidad) {
        if (dia >= 0 dia < 7) {
            this.ventas[dia] = cantidad;
        }
    }
    public int getTotalVentas() {
        int total = 0;
        for (int venta : ventas) {
            total += venta;
        }
        return total;
    }
    public int[] getVentas() {
        return ventas;
}
}

