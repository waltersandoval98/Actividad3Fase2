/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.entidad;

/**
 *
 * @author DGUTIERREZ
 */
public class ECliente {

    private String NIT = "";

    public ECliente() {
    }

    public ECliente(String NIT) {
        this.NIT = NIT;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

}
