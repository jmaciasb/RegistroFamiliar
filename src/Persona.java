/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmaciasb
 */
public class Persona {
    private String parentesco;
    private String sexo;
    private int edad;
    private int nId;
    private String nombre;
    private String apellido;

    public Persona() {
    }

    
    public Persona(String sexo, int edad, int nId, String nombre,String parentesco) {
        this.sexo = sexo;
        this.edad = edad;
        this.nId = nId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.parentesco = parentesco;
    }

    
}
