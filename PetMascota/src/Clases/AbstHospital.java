/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author sara
 */
public abstract class AbstHospital {
    private String data;
    
    public abstract String getTipoPaciente(); 
    public abstract String getCirugia(); 
    
    public String getInformacionHospital(){
    return "La informacion es: " + this.getData();
    
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }
}
