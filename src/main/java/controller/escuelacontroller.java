/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import model.Alumno;
import model.Persona;
import model.escuelamodel;
import view.escuelaview;

/**
 *
 * @author MikeMacuil
 */
public class escuelacontroller {
   
    private escuelaview view;
    private escuelamodel model;

    public escuelacontroller() {
        
    }

    
    public escuelacontroller(escuelaview view) {
        this.view = view;
        this.model=new escuelamodel();
    }
    
    
    public String obtenerSaludo (String curp, int edad){
     IFuncionalOperacionesGenerales oga = new IFuncionalOperacionesGenerales() {
             @Override
             public String saludarA(String curp, int edad) {
                 //System.out.println("Hola alumno:"+curp);
                 String curpRegreso = curp+"-";
                 curpRegreso = curpRegreso + "+";
                 return "hola alumno: "+curpRegreso;
             }
         };
         
         String saludo = oga.saludarA(curp,edad);
         return saludo;
    }
    
    public void main (){
        System.out.println("Hola mundo");
        this.view.mostrarSaludo();
        Alumno nuevoAlumno = new Alumno();
        nuevoAlumno.setNombre("MikeMacuil");
         
         IFuncionalOperacionesGenerales ogd = (curp,edad) -> {
                 String curpRegreso = curp+"-";
                 curpRegreso = curpRegreso + "+"+edad;
                 return "hola docente: "+curpRegreso;
         };
         
         String saludoD = ogd.saludarA("FML",20);
         System.out.println(saludoD);
         
         /*
         System.out.println("GENERICOS");
         
         Funciones<String,String> f1 = new Funciones<>("MikeMacuil");
         f1.junta(" MONTIEL");
         
         
         Funciones<Integer,Integer> f2 = new Funciones<>(1);
         f2.junta(6);
         
         Funciones<Integer,String> f3 = new Funciones<>(1);
         f3.junta(" hola");
         */
         
         System.out.println("COLECCIONES");
         HashSet<String> lista = new HashSet();
         lista.add("Juan");
         lista.add("Adrian");
         lista.add("Juan");
                 
         
         System.out.println(lista);
         
         Set<Persona> listaPersona = new HashSet<>();
         Persona per1 = new Persona();
         per1.setNombre("Juan");
         per1.setCurp("JuanCURP");
         
         
         Persona per2 = new Persona();
         per2.setNombre("Adrian");
         per2.setCurp("AdrianCURP");
         
         
         Persona per3 = new Persona();
         per3.setNombre("Juan");
         per3.setCurp("JuanCURP");
         
         
         listaPersona.add(per1);
         listaPersona.add(per2);
         listaPersona.add(per3);
         
         System.out.println(per1.hashCode());
         System.out.println(per2.hashCode());
         System.out.println(per3.hashCode());
         
         
         System.out.println(listaPersona);

  
         this.model.agregarNombre( new String[] {"hola", "Maria", "Adrian", "Sonia", "Gabriel", "Adrian", "Adrian", null});
         ArrayList<String> listaNombres = new ArrayList<>();
         /*listaNombres.add("");
         listaNombres.add("");
         listaNombres.add("");
         listaNombres.add("");
         listaNombres.add("");
         listaNombres.add("");
         listaNombres.add("Adrian");
         listaNombres.add(null);*/
         this.view.mostrarArrayNombres(this.model.getListaNombres());  
         
         //System.out.println(listaNombres);
         
         this.view.mostrarNombres(this.model.getNombres(1));
         
         this.model.eliminarNodo("Adrian");
         this.model.eliminarNodo(1);
         this.view.mostrarArrayNombres(this.model.getListaNombres());  
        // System.out.println(listaNombres);
         
        /* for(String temp:listaNombres){
             System.out.println("Nombre con for: "+temp);
         }*/
         this.view.mostrarNombreForeach(this.model.getListaNombres());
         //listaNombres.forEach(t -> System.out.println("Nombre sin for:"+t));
         this.view.mostrarNombreForeachInLine(this.model.getListaNombres());

         
         Map<String, Integer> treeMap = new TreeMap<>();
         treeMap.put("Maria",2);
         treeMap.put("Jose",5);
         treeMap.put("Armando",4);
         treeMap.put("Maria",4);
         System.out.println(treeMap);
         /*
         Persona per1 = new Persona();
         per1.setNombre("Juan");
         per1.setCurp("JuanCURP");
         
         
         Persona per2 = new Persona();
         per2.setNombre("Adrian");
         per2.setCurp("AdrianCURP");
         
         
         Persona per3 = new Persona();
         per3.setNombre("Juan");
         per3.setCurp("JuanCURP");
         
         
         TreeMap<Persona, Integer> treeMapPersonas = new TreeMap<>();
         treeMapPersonas.put(per1,2);
         treeMapPersonas.put(per2,5);
         treeMapPersonas.put(per3,4);
         System.out.println(treeMapPersonas);
         

*/
         ArrayDeque<String> deque = new ArrayDeque<>();
         deque.add("elemento1");
         deque.add("elemento2");
         deque.add("elemento3");
         deque.add("elemento4");
         deque.add("elemento5");
         
         System.out.println(deque);
         
         deque.pop();
         System.out.println(deque);
         
         deque.push("elemento7");
         deque.remove();
         System.out.println(deque);
    }
}
