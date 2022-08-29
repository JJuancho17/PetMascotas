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
public class Polimorfismo {
    public static void main(String[] args) {
        //Instancias de las clases hijas
        clsPerro perro = new clsPerro("criollo",false,"001","Toby",2018,"cafe","Sano");

        clsGato Gato = new clsGato("Angora", "002", "Michin", 2019, "Blanco", "Enfermo");
        
        //Instancia de veterinaria y de doctor
        doctor doctor = new doctor("Mario Fernandez", "L12345");
        clsVeterinaria veterinaria = new clsVeterinaria("Veterinaria los Jirasoles", "031 258 369" , "Calle 65 N  26-10" , doctor);
        
        String CarePerro = veterinaria.PetCare(perro);
        System.out.println("El estado de salud de " + perro.getName() + " es " + CarePerro);
        
        String CareGato = veterinaria.PetCare(Gato);
        System.out.println("El estado de salud de " + Gato.getName() + " es " + CareGato);
           
    }
  
}
