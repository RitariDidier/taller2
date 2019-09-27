/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.VendedorDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import modelo.Vendedor;
import vista.InicioV;
import vista.RegistrarVentaV;

/**
 *
 * @author Didier
 */
public class LoginController implements ActionListener {

   private InicioV inicioV;

    public LoginController(InicioV inicioV) {
        this.inicioV = inicioV;
    }

    public InicioV getInicioV() {
        return inicioV;
    }

    public void setInicioV(InicioV inicioV) {
        this.inicioV = inicioV;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (inicioV.getjButton1()== e.getSource()) {
            //Registrar Venta
            VendedorDao vDao = new VendedorDao();
            ArrayList <Vendedor> vendedores =  vDao.getVendedores();
           
            RegistrarVentaV rvv = new RegistrarVentaV(vDao.getVendedores());
            rvv.setVisible(true);
            
            
        }
        if (inicioV.getjButton2()== e.getSource()) {
            //Ver reporte
            
        }
    }
   
   
   
    
    
}
