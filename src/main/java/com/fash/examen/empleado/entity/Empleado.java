package com.fash.examen.empleado.entity;

import java.util.HashMap;
import java.util.Map;

public class Empleado extends Persona implements OperacionesRH{

    private String nombre;
    private String apellido;

    public Empleado(String nombre) {
        this(nombre, "X");
    }

    public Empleado(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public void imprimirNombre() {
        System.out.println("Empleado: " + this.nombre + " " + this.apellido);
    }


    @Override
    public Map<String, String> detalleEmpleado() {
        Map<String, String> detalle = new HashMap<>();
        detalle.put("Nombre",this.nombre);
        detalle.put("Apellido", this.apellido);
        detalle.put("Empresa", EMPRESA);

        return detalle;
    }
}
