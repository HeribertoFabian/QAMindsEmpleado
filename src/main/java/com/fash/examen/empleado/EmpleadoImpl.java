package com.fash.examen.empleado;

import com.fash.examen.empleado.entity.Empleado;
import com.fash.examen.empleado.repository.Repository;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class EmpleadoImpl {

    public static void main(String[] args) {
        List<Empleado> empleados = Repository.getAllEmpleados();

        System.out.println("## Lista de todos los empleados");
        //Imprimir empleados
        Consumer<Empleado> c1 = ((emp -> {
            emp.imprimirNombre();
        }));
        empleados.forEach(e -> c1.accept(e));

        System.out.println("## Lista de empleados sin apellido");
        //Imprimir detalle de empleados que solo tengan X en el apellido
        Predicate<Empleado> p1 = emp -> emp.getApellido().equals("X");
        empleados.forEach(empdet -> {
            if(p1.test(empdet)){
                System.out.println(empdet.detalleEmpleado());
            }

        });


    }
}
