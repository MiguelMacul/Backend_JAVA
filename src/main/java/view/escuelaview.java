/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.escuelacontroller;
import java.util.ArrayList;
import java.util.Map;


/**
 *
 * @author MikeMacuil
 */
public class escuelaview {
    
    private escuelacontroller controller;
    
    public escuelacontroller getController() {
        return controller;
    }

    public void setController(escuelacontroller controller) {
        this.controller = controller;
    }
    
    public escuelaview() {
         
    }
    
    public void mostrarSaludo(){
        System.out.println(this.controller.obtenerSaludo("asdas", 10));
    }
    
    public void mostrarArrayNombres(ArrayList<String> listaNombres){
        System.out.println(listaNombres);
    }
    
     public void mostrarNombres(String Nombre){
        System.out.println(Nombre);
    }
     
    public void mostrarNombreForeach(ArrayList<String> listaNombres){
        for(String elemento: listaNombres)
            System.out.println(elemento);
    }
    
     public void mostrarNombreForeachInLine(ArrayList<String> listaNombres){
        listaNombres.forEach(elemento -> System.out.println("Nombre sin for:"+elemento));
    }
}
