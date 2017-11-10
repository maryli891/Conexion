/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;
//PASO 10 - Necesario para conexion con MySQL
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author LC22
 */
public class ConexionBD 
{
    //PASO 11 - DECLARANDO OBJETOS PARA LA CONEXION
   private static Connection conex;//Objeto tipo Conection
   private static final String DRIVER="com.mysql.jdbc.Driver";
   private static final String USER="root";
   private static final String PASS="";
   private static final String URL="jdbc:mysql://localhost:330/conexion";
   
   // PASO 12 - CONSTRUCTOR DE LA CLASE
   public ConexionBD()
   {
      conex = null;//Inicializar la variable
      //Metodos para manejar excepciones
      try
      {
      Class.forName(DRIVER);
      conex =DriverManager.getConnection(URL, USER, PASS);
          if (conex != null) 
          {
             System.out.println("Conexion Establecida");
          }
      }
      catch(ClassNotFoundException | SQLException event)
      {
      System.out.println("Error en la Conexion");
      }
       
  
  }
  //PASO 13- DEFINICION METODOS PARA CONECTAR Y DESCONECTAR 
   public Connection conectar()
{
return conex;//Retorna el objeto conex
}
   public void desconectar()
   {
     conex=null;
     if(conex==null)
     {
      System.out.println("Conexion Finalizada");
     }
   }
}

