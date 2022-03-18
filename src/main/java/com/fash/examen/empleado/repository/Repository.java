package com.fash.examen.empleado.repository;

import com.fash.examen.empleado.entity.Empleado;

import java.util.Arrays;
import java.util.List;

public class Repository {

    public static List<Empleado> getAllEmpleados(){

        Empleado e1 = new Empleado("Alberto", "Sanchez");
        Empleado e2 = new Empleado("Maria", "Bravo");
        Empleado e3 = new Empleado("Carlos", "Garcia");
        Empleado e4 = new Empleado("Mario");
        Empleado e5 = new Empleado("Blanca", "Moreno");
        Empleado e6 = new Empleado("Marco de Jesus");


        List<Empleado> empleados = Arrays.asList(e1,e2,e3,e4,e5,e6);
        return empleados;
    }
}
