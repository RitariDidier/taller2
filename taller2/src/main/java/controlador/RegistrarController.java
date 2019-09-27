/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.VentaDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Vendedor;
import modelo.Venta;
import vista.RegistrarVentaV;

/**
 *
 * @author Didier
 */
public class RegistrarController implements ActionListener{

    private RegistrarVentaV rvv;
    public RegistrarController(RegistrarVentaV rvv) {
        this.rvv = rvv;
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (rvv.getjButton1()== e.getSource()) {
            Vendedor vdd = (Vendedor) rvv.getVendedorCB().getSelectedItem();
            String sucursal =(String) rvv.getSucursalCB().getSelectedItem();
            int monto = Integer.parseInt(rvv.getMontoTxt().getText());
            String fecha = rvv.getFechaTxt().getText();
            
            Venta v = new Venta(sucursal, monto, fecha, vdd.getId());
            
            VentaDao vDao = new VentaDao();
            vDao.agregarVenta(v);
            
        }
    }
    
}
