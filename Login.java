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
public class Login {
    String usuario;
    String contrasena; 

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    

    public Login (String usuario, String contrasena)
            {
                this.usuario= usuario;
                this.contrasena= contrasena;
            }
}


