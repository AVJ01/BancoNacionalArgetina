/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AServidor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author AVJ
 */
public class MySQL {
    ResultSet rs;
    Statement stat;
    public String bd = "bancon";
    public String login = "root";
    public String password = "";
    public String url = "jdbc:mysql://localhost/"+bd;


Connection conn = null;
static MySQL instance =null;

   public MySQL()
   {
      try{
             Class.forName("com.mysql.jdbc.Driver");
             conn = DriverManager.getConnection(url,login,password);
             if (conn!=null)
             {
                //JOptionPane.showMessageDialog(null,"Conexión a base de datos "+bd+" exitosa");
                 System.out.print("conexion...ok");
             }
      }catch(SQLException ex)
      {
         System.out.println(ex);
      }
      catch(ClassNotFoundException e)
      {
         System.out.println(e);
      }
   }

   
    public static MySQL getInstance() throws Exception
    {
        if(instance == null)
        {
            instance = new MySQL();
        }
        return instance;
    }
   // @override
    public void finalize() throws Exception
    {
        if(conn.isClosed())
        {
            conn = null;
            conn.isClosed();
        }
    }
    public Connection getConnection()
    {
        return conn;
    }
}
