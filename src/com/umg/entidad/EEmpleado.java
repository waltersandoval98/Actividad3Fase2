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
public class EEmpleado {

    private String codigoEmpleado = "";
    private String puesto = "";

    public EEmpleado() {
    }    
    
    public EEmpleado(String codigoEmpleado, String puesto) {
        this.codigoEmpleado = codigoEmpleado;
        this.puesto = puesto;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

}
