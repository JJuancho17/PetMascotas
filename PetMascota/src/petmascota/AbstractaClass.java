/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petmascota;

import Clases.clsVeterinaria;
import Clases.doctor;

/**
 *
 * @author sara
 */
public class AbstractaClass {
    public static void main(String[] args) {
        
        //Instancia de veterinaria y de doctor
        doctor doctor = new doctor("Mario Fernandez", "L12345");
        clsVeterinaria veterinaria = new clsVeterinaria("Veterinaria los Jirasoles", "031 258 369" , "Calle 65 N  26-10" , doctor);
        
        veterinaria.setData(veterinaria.getName() + " - " + veterinaria.getDireccion());
        
        String Dato = veterinaria.getInformacionHospital();
        String Tipo = veterinaria.getTipoPaciente();
        String Cirugia = veterinaria.getCirugia();
        
        System.out.println("dato: " + Dato);
        System.out.println("tipo: " + Tipo);
        System.out.println("Cirugia: " + Cirugia);
        
    }
}
