/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendamaria;

/**
 *
 * @author Gabriela Ordoñez 00361516
 */

public class Factura {
    String nombre;
    int cantidad; 

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Factura (String nombre, int cantidad)
            {
                this.nombre= nombre;
                this.cantidad= cantidad;
            }
}
