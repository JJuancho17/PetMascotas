/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author sara
 */
public class clsGato extends clsPet {
    private String breed;

    public clsGato(String breed, String code, String name, int born_year, String color, String health_status) {
        super(code, name, born_year, color, health_status);
        this.breed = breed;
    }
    
    
    public void AutoAseo(){
    System.out.println("El gato " + super.getName() + " se esta limpiando");
    }
    
    @Override
    public void Sound (){
    System.out.println("El gato " + super.getName() + " hace miauuu");
    }
    
    @Override
    public int getNumeroHuesos (){
        return 230;
    }
    
    @Override
    public String getAnimalTipo (){
        return "Gato";
    }

    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }
        
  
}
