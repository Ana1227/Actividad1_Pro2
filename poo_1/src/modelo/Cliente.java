/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JTextField;

/**
 *
 * @author Ana Patzan
 */
public class Cliente extends Persona{
    
    private String nit;

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    @Override
    public void agregar (){
    
    System.out.println("Nit: "+ getNit());
    System.out.println("Nombres: "+ this.getNombres());
    System.out.println("Apellidos: "+ this.getApellidos());
    System.out.println("Dirección: "+ this.getDireccion());
    System.out.println("Telefono: "+ this.getTelefono());
    System.out.println("Fecha de Nacimiento: "+ this.getFecha_nacimiento());
    
    
    
    
}

    public void setNit(JTextField txt_nit) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
