/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petmascota;

import Clases.*;
/**
 *
 * @author sara
 */
public class polimorfismo2 {
    public static void main(String[] args) {
        clsPerro Perro = new clsPerro("criollo",false,"001","Toby",2018,"cafe","Sano");

        clsGato Gato = new clsGato("Angora", "002", "Michin", 2019, "Blanco", "Enfermo");
        
        Perro.Sound();
        Gato.Sound();
        
    }
}
