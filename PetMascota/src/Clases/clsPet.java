/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Interfaces.*;

/**
 *
 * @author Sara 
 */
public class clsPet implements IAnimal, IVertebrado {
    private String code;
    private String name;
    private int born_year;
    private String color;
    private String health_status;
    private clsVeterinaria veterinaria;


    public clsPet(String code, String name, int born_year, String color, String health_status) {
        this.code = code;
        this.name = name;
        this.born_year = born_year;
        this.color = color;
        this.health_status = health_status;
    }

    public void Eat() {
        System.out.println("La mascota "+ this.name+ " esta comiendo");
    }
    public void Move() {
        System.out.println("La mascota "+ this.name+ " esta moviendose");
    }
    public void Sound() {
        System.out.println("La mascota "+ this.name+ " esta realizando un sonido");
    }
   
 
    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the born_year
     */
    public int getBorn_year() {
        return born_year;
    }

    /**
     * @param born_year the born_year to set
     */
    public void setBorn_year(int born_year) {
        this.born_year = born_year;
    }

 

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the health_status
     */
    public String getHealth_status() {
        return health_status;
    }

    /**
     * @param health_status the health_status to set
     */
    public void setHealth_status(String health_status) {
        this.health_status = health_status;
    }

    /**
     * @return the veterinaria
     */
    public clsVeterinaria getVeterinaria() {
        return veterinaria;
    }

    /**
     * @param veterinaria the veterinaria to set
     */
    public void setVeterinaria(clsVeterinaria veterinaria) {
        this.veterinaria = veterinaria;
    }

    @Override
    public String getAnimalTipo() {
        return "domestico";
    }

    @Override
    public int getNumeroHuesos() {
        return 0;
    }
}
