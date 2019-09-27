/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Didier
 */
public class Vendedor {
    
    private String nombre;
    private String apellido;
    private String rut;
    private int id;

    public Vendedor(String nombre, String apellido, String rut, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.id = id;
    }

    public Vendedor(String nombre, String apellido, String rut) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.getNombre()+" "+getApellido();
    }
    
    
}
