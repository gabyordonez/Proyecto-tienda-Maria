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
public class Proveedor {
    String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    int telefono; 

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

  

    public Proveedor (String nombre, int telefono)
            {
                this.nombre= nombre;
                this.telefono= telefono;
            }
}

