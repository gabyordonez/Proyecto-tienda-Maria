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
public class Producto {
    String nombre;
    int cantidad;
    double costo;

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getCosto() {
        return costo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    

    public Producto (String nombre, int cantidad, double costo)
            {
                this.nombre= nombre;
                this.cantidad= cantidad;
                this.costo= costo;
            }
}


