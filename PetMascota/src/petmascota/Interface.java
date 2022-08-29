/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petmascota;

import Clases.clsGato;
import Clases.clsPerro;

/**
 *
 * @author sara
 */
public class Interface {
    public static void main(String[] args) {
        //Instancias de las clases hijas
        clsPerro Perro = new clsPerro("criollo",false,"001","Toby",2018,"cafe","Sano");

        clsGato Gato = new clsGato("Angora", "002", "Michin", 2019, "Blanco", "Enfermo");
        
        System.out.println(Perro.getAnimalTipo());
        System.out.println("" + Gato.getAnimalTipo());
        
        System.out.println(Perro.getNumeroHuesos());
        System.out.println("" + Gato.getNumeroHuesos());
    }
}
