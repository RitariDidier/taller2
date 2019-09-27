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

/**
 *
 * @author Didier
 */
public class VendedorDao {

     private Conexion con;
     
    public VendedorDao() {
          con = new Conexion();
          
    }
    public ArrayList <Vendedor> getVendedores (){
        ArrayList <Vendedor> vendedores = new ArrayList<>();
        Vendedor v;
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
                v = new Vendedor(nombreBD, ApellidoBD, rutBD,idBD);
                vendedores.add(v);
            }
            return vendedores;
        }catch(Exception e){
            System.out.println("Error al obtener Vendedor");
            e.printStackTrace();
            return null;
        } 
    
    }
    public Vendedor getVendedor(String vendedor){
    
        Vendedor v;
        Connection accesoBD = con.getConexion();
        String sql="SELECT * FROM vendedor WHERE user='"+vendedor+"'";
        try{
            Statement st = accesoBD.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            if( rs.first() ) {
                String nombreBD = rs.getString("nombre");
                String ApellidoBD = rs.getString("apellido");
                String rutBD = rs.getString("rut");
                v = new Vendedor(nombreBD, ApellidoBD, rutBD);
                
                return v;
            }else {
                
                return null;
            }
        }catch(Exception e){
            System.out.println("Error al obtener Vendedor");
            e.printStackTrace();
            return null;
        } 
    }
}
