/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author MikeMacuil
 */
public class escuelamodel {
    private ArrayList<String> listaNombres;
    public escuelamodel() {
        this.listaNombres = new ArrayList<>();
      
    }
    public void agregarNombre(String array[]){
        for(String elemento: array)
            this.listaNombres.add(elemento);
    }

    public ArrayList<String> getListaNombres() {
        return listaNombres;
    }

    public String getNombres(int posicion) {
        return listaNombres.get(posicion);
    }
    
    public void eliminarNodo(int posicion){
        this.listaNombres.remove(posicion);
    } 
    
     public void eliminarNodo(String nombre){
        this.listaNombres.remove(nombre);
    } 
}
