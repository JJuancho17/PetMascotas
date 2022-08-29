/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author sara
 */
public class clsVeterinaria extends AbstHospital {
    private String Name;
    private String Telefono;
    private String Direccion;
    private clsdoctor doctor;

    /**
     *
     * @param Name
     * @param Telefono
     * @param Direccion
     * @param doctor
     */
    public clsVeterinaria(String Name, String Telefono, String Direccion, clsdoctor doctor) {
        this.Name = Name;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.doctor = doctor;
    }

    public clsVeterinaria(String veterinaria_los_Jirasoles, String _258_369, String calle_65_N__2610, doctor doctor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String PetCare (clsPet pet){
        System.out.println("Atendiendo a la mascota " + pet.getName());
        return pet.getHealth_status();
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
     * @return the Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    /**
     * @return the Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @param Direccion the Direccion to set
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    @Override
    public String getTipoPaciente() {
        return "Animal";
    }

    @Override
    public String getCirugia() {
        return "Cirugia animal data";
    }

    private static class clsdoctor {

        public clsdoctor() {
        }
    }

    /**
     * @return the doctor
     */
    public clsdoctor getDoctor() {
        return doctor;
    }

    /**
     * @param doctor the doctor to set
     */
    public void setDoctor(clsdoctor doctor) {
        this.doctor = doctor;
    }
    
}
