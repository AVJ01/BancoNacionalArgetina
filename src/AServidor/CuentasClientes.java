/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AServidor;

import bancon.Clientes;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author AVJ
 */
public class CuentasClientes {
     MySQL conex = new MySQL();
    ResultSet rs,idPConsec,BP;
    private String respuesta;
    PreparedStatement c=null;
    Clientes bjC = new Clientes();
    public ArrayList<Clientes> mostrarClientes()
    {
        ArrayList<Clientes> miLista = new ArrayList<Clientes>();
        Clientes cliente;
        //ResultSet rs;
        try {
           Statement stmConn = conex.getConnection().createStatement();
           rs = stmConn.executeQuery("SELECT * FROM clientes ");

         while (rs.next())
         {
              cliente = new Clientes();
              cliente.setIdC(Integer.parseInt(rs.getString("idclientes")));
              cliente.setNoCuenta(Integer.parseInt(rs.getString("NoCuenta")));
              cliente.setNombre(rs.getString("nombre"));
              cliente.setApellidos(rs.getString("apellidos"));
              cliente.setDinero(Float.parseFloat(rs.getString("dinero")));
              cliente.setMulta(Float.parseFloat(rs.getString("multa")));
              cliente.setDretirado(Float.parseFloat(rs.getString("Dretirado")));
              cliente.setContraseña(rs.getString("contraseña"));
              miLista.add(cliente);
             System.out.println(miLista);
          }
              rs.close();
              stmConn.close();


        } catch (SQLException e) {
         System.out.println(e.getMessage());
         JOptionPane.showMessageDialog(null, "Error al consultar Clientes", "Error",
         JOptionPane.ERROR_MESSAGE);

        }
        return miLista;
        
 }//AQUI TERMINA LA CONSULTA
      
    public String insertar(int NC,String nombre,String apellidos,Float dinero,Float multa,Float Dretirado,String contraseña){ 
        // Insercion de periodista    
        int guardar = 0;

        try{     
            c=conex.getConnection().prepareStatement("INSERT INTO clientes(NoCuenta,nombre,apellidos,dinero,multa,Dretirado,contraseña)"+
                " values(?,?,?,?,?,?,?)");
        
        c.setInt(1, NC);
        c.setString(2, nombre);
        c.setString(3, apellidos);
        c.setFloat(4, dinero);
        c.setFloat(5, multa);
        c.setFloat(6, Dretirado);
        c.setString(7, contraseña);
        
            guardar = c.executeUpdate();
            System.out.print(guardar);
            if (guardar > 0){
                respuesta = "ok";
                System.out.println(" SE INSERTO CLIENTE");
                JOptionPane.showMessageDialog(null,"Cliente agregado");
            }else{
                System.out.println("NO SE INSERTO EL CLIENTE");
            }
        }catch( Exception ex){
            System.out.println("ERROR EN try2");
        }
        return respuesta;
    }
    public void Eliminar(String id){
  
        Connection conexion = null;
        
int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este registro?");
       
        
        if(confirmar==JOptionPane.OK_OPTION){
        
            try {
                
                String sql = "DELETE FROM clientes "
                           + "WHERE NoCuenta=?";
                
                conexion = conex.getConnection();
                PreparedStatement pst = conexion.prepareStatement(sql);
                pst.setString(1, id);
               
                if(pst.executeUpdate() > 0){
                
JOptionPane.showMessageDialog(null, "¡La Cuenta del cliente ha sido eliminada!");
              
                }else{
                
                       JOptionPane.showMessageDialog(null, "El registro no se ha podido eliminar.\n"
                       + "Inténtelo nuevamente.");
              
                }
  
                
            } catch (HeadlessException | SQLException e) {
            
JOptionPane.showMessageDialog(null, "El registro no se ha podido eliminar.\n"
                                             + "Inténtelo nuevamente.\n"+e);
                
            }
        
        }
}
public void Modificar(String NC,String nombre,String apellidos,String dinero,String multa,String Dretirado,String contraseña){

int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea modificar los datos actuales?");


if(confirmar == JOptionPane.YES_OPTION){

    Connection conexion = null;
    
    try {
    
        conexion = conex.getConnection();
        
        String Ssql = "UPDATE clientes SET nombre=?, apellidos=?, dinero=?, multa=?, Dretirado=?, contraseña=?"
                    + "WHERE NoCuenta=?";
        
        PreparedStatement prest = conexion.prepareStatement(Ssql);
        
        prest.setString(1, nombre);
        prest.setString(2, apellidos);
        prest.setString(3, dinero);
        prest.setString(4, multa);
        prest.setString(5, Dretirado);
        prest.setString(6, contraseña);
         prest.setString(7, NC);
        
        
        if(prest.executeUpdate() > 0){
        
            JOptionPane.showMessageDialog(null, "Los datos han sido modificados con éxito", "Operación Exitosa", 
                                          JOptionPane.INFORMATION_MESSAGE);
            
        }else{
        
            JOptionPane.showMessageDialog(null, "No se ha podido realizar la actualización de los datos\n"
                                          + "Inténtelo nuevamente.", "Error en la operación", 
                                          JOptionPane.ERROR_MESSAGE);
        
        }
        
    } catch (SQLException e) {
    
        JOptionPane.showMessageDialog(null, "No se ha podido realizar la actualización de los datos\n"
                                          + "Inténtelo nuevamente.\n"
                                          + "Error: "+e, "Error en la operación", 
                                          JOptionPane.ERROR_MESSAGE);
    
    }
}
}

public void Retiro(String NC,String C,String M,String D){
    int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea hacer el retiro?");


if(confirmar == JOptionPane.YES_OPTION){

    Connection conexion = null;
    
    try {
    
        conexion = conex.getConnection();
        
         String Ssql = "UPDATE clientes SET  dinero=?,multa=?, Dretirado=?"
                    + "WHERE NoCuenta=?";
        
        PreparedStatement pres = conexion.prepareStatement(Ssql);
        
                    pres.setString(1, C);
                    pres.setString(2, M);
                    pres.setString(3, D);
                    pres.setString(4, NC); 
        
        
       if(pres.executeUpdate() > 0){
        
            JOptionPane.showMessageDialog(null, "Retiro con éxito", "", 
                                          JOptionPane.INFORMATION_MESSAGE);
            
        }else{
        
            JOptionPane.showMessageDialog(null, "No se ha podido realizar el retiro\n"
                                          + "", "", 
                                          JOptionPane.ERROR_MESSAGE);
        
        }
        
    } catch (SQLException e) {
    
        JOptionPane.showMessageDialog(null, "No se ha podido realizar la actualización de los datos\n"
                                          + "Inténtelo nuevamente.\n"
                                          + "Error: "+e, "Error en la operación", 
                                          JOptionPane.ERROR_MESSAGE);
    
    }
}
                   
}

}
