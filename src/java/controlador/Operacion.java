/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Ricardo Burgos
 */
@ManagedBean
@RequestScoped
public class Operacion {
    
    private String saludo = "hola sis16 desde managedBeans ñandú";

    /**
     * Get the value of saludo
     *
     * @return the value of saludo
     */
    public String getSaludo() {
        return saludo;
    }

    /**
     * Set the value of saludo
     *
     * @param saludo new value of saludo
     */
    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }


    /**
     * Creates a new instance of Operacion
     */
    public Operacion() {
    }
    
}
