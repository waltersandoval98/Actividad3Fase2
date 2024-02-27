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
public class EPersona {

    private String nombres = "";
    private String apellidos = "";
    private String direccion = "";
    private String telefono = "";
    private String fechaNacimiento = "";
    private ECliente cliente = new ECliente();
    private EEmpleado empleado = new EEmpleado();

    public EPersona() {
    }

    public EPersona(String nombres, String apellidos, String direccion, String telefono, String fechaNacimiento, ECliente cliente, EEmpleado empleado) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.cliente = cliente;
        this.empleado = empleado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ECliente getCliente() {
        return cliente;
    }

    public void setCliente(ECliente cliente) {
        this.cliente = cliente;
    }

    public EEmpleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(EEmpleado empleado) {
        this.empleado = empleado;
    }

    public void crear() {
        System.out.println("Se ha creado los datos de una nueva persona!!!!");
    }

    public void leer() {
        System.out.println("Se a desplegado los datos de la persona");
    }

    public void actualizar() {
        System.out.println("Se a actualizado correctamente los datos de la persona");
    }

    public void borrar() {
        System.out.println("Se a procedido a eliminar los datos de la persona");
    }

}
