/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author sara
 */
public class doctor {
    private String Name;
    private String Licencia;
    

    public doctor(String Name, String Licencia) {
        this.Name = Name;
        this.Licencia = Licencia;
    }

    
    
    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Licencia
     */
    public String getLicencia() {
        return Licencia;
    }

    /**
     * @param Licencia the Licencia to set
     */
    public void setLicencia(String Licencia) {
        this.Licencia = Licencia;
    }
    
}
