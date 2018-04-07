/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendamaria;

/**
 *
 * @author Compaq
 */
public class Inventario {
    String factura;
    int cantidad; 
    String producto;

    public void setFactura(String factura) {
        this.factura = factura;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getFactura() {
        return factura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getProducto() {
        return producto;
    }

    

    public Inventario (String producto, String factura, int cantidad)
            {
                this.producto=producto;
                this.factura=factura;
                this.cantidad= cantidad;
            }
}


