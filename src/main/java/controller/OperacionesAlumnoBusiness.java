/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author MikeMacuil
 */
public class OperacionesAlumnoBusiness implements IOperacionesAlumno{

    @Override
    public void obtenerNombre(String matricula) {
        System.out.println("Obtener nombre...");
    }

    @Override
    public int obtenerPromedio(String matricula) {
        return 10;
    }

    @Override
    public int obtenerSemestre(String matricula) {
        return 5;
    }

    @Override
    public int numeroInscritos() {
        int i = 0;
        i++;
        return i;
    }
    
}
