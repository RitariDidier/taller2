/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author Didier
 */
public class Venta {
    
    private String sucursal;
    private int monto;
    private String fecha;
    private int id;
    private int id_vendedor;

    public Venta(String sucursal, int monto, String fecha, int id, int id_vendedor) {
        this.sucursal = sucursal;
        this.monto = monto;
        this.fecha = fecha;
        this.id = id;
        this.id_vendedor = id_vendedor;
    }

    public Venta(String sucursal, int monto, String fecha, int id_vendedor) {
        this.sucursal = sucursal;
        this.monto = monto;
        this.fecha = fecha;
        this.id_vendedor = id_vendedor;
    }
    

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }
    
    
}
