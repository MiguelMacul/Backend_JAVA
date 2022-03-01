/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.softura.proyectojava;
import controller.escuelacontroller;
import view.escuelaview;
/**
 *
 * @author MikeMacuil
 */
public class Principal {
     public static void main(String[] args) {
         
        // TODO code application logic here
        escuelaview view=new escuelaview();
        escuelacontroller escuela=new escuelacontroller(view); 
        view.setController(escuela);
        escuela.main();
    }


}
