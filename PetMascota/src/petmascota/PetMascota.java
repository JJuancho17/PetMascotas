/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package petmascota;

import Clases.*;
import java.util.Date;

/**
 *
 * @author SENA
 */
public class PetMascota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        clsPerro Dog1 = new clsPerro("criollo",false,"001","Princesa",2018,"cafe","Sano");

        clsGato Cat2 = new clsGato("Angora", "002", "Michin", 2019, "Blanco", "Enfermo");

        Date fecha_actual = new Date();
        int anioActual = fecha_actual.getYear();

        int edadPet1 = anioActual - Dog1.getBorn_year();
        int edadPet2 = anioActual - Cat2.getBorn_year();

        if(edadPet1 > edadPet2){
            System.out.println("La mascota "+ Dog1.getName()+ " es mayor que la mascota "+ Cat2.getName());            
        }else{
            if(edadPet2 > edadPet1) {
                System.out.println("La mascota "+ Cat2.getName()+ " es mayor que la mascota "+ Dog1.getName());    
            }else{
                System.out.println("La mascota "+ Dog1.getName()+ " tiene la misma edad que la mascota "+ Cat2.getName());    
            }
        }

    Dog1.Eat();

    Cat2.Eat();
    Cat2.Move();
    Cat2.Sound(); 
    
    Dog1.WalkAround();
    Cat2.AutoAseo ();

    }
    
}
