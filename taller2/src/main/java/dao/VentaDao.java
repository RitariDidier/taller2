/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Vendedor;
import modelo.Venta;

/**
 *
 * @author Didier
 */
public class VentaDao {

    private  Conexion con;
    public VentaDao() {
         con = new Conexion();
    }
    
    public void agregarVenta (Venta v){
        Connection accesoBD=con.getConexion();
        
        try{
            String sql="INSERT INTO venta (sucursal,monto,fecha,id_vendedor)"
                        + "VALUES ('"+v.getSucursal()+"',"+v.getMonto()+",'"+v.getFecha()+"',"+v.getId_vendedor()+")";
                        
            System.out.println(sql);
            Statement st=accesoBD.createStatement();
            st.executeUpdate(sql);
            
        }catch(Exception e){
            System.out.println("Error al insertar la cuenta");
            e.printStackTrace();
        }
        
    }
    
    public ArrayList <Venta> getVentas(){
        ArrayList <Venta> ventas = new ArrayList<>();
        Venta v;
        Connection accesoBD = con.getConexion();
        String sql="SELECT * FROM vendedor ";
        try{
            Statement st = accesoBD.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while( rs.next()) {
                String nombreBD = rs.getString("nombre");
                String ApellidoBD = rs.getString("apellido");
                String rutBD = rs.getString("rut");
                int idBD = rs.getInt("id_vendedor");
                
                v = new Venta(sql, idBD, rutBD, idBD, idBD);
                ventas.add(v);
            }
            return ventas;
        }catch(Exception e){
            System.out.println("Error al obtener Vendedor");
            e.printStackTrace();
            return null;
        } 
    }
    
}
