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
public interface IOperacionesAlumno {
    
    public void obtenerNombre(String matricula);
    
    public int obtenerPromedio(String matricula);
    
    public int obtenerSemestre(String matricula);
    
    public int numeroInscritos();
    
}
