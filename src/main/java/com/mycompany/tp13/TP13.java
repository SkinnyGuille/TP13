
package com.mycompany.tp13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.text.html.HTML.Tag.SELECT;


public class TP13 {

    public static void main(String[] args) {
        try{
       Class.forName("org.mariadb.jdbc.Driver");
        System.out.println("cargo");
        //conexion de base de datos
       Connection conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/universidadulp", "root","");
            System.out.println("conectado con exito");
//       String sql ="INSERT INTO alumno( dni, apellido, nombre, fechaNacimiento, estado)"
//               + " VALUES (1234,'Rodriguez','Lautaro','2001/05/12',true),(321,'Rosales','Gustavo','1992/01/12',true),(456,'Rosales','Guillermo','2002/06/05',true)";
//       PreparedStatement ps = conexion.prepareStatement(sql);
//       int registro = ps.executeUpdate();
//            System.out.println(registro);
            
//            String sql1 ="INSERT INTO materia( nombre, año, estado)"
//                    + "VALUES ('Calculo',1,true),('igles',1,true),('ingdesofware',2,true),('web',1,true)";
//       PreparedStatement ps1 = conexion.prepareStatement(sql1);
//       int materias =ps1.executeUpdate();
//            System.out.println(materias);
            
//            
//            String sql2 ="INSERT INTO inscripcion( nota, idAlumno, idMateria)"
//                    + " VALUES (7,3,4)";
//       PreparedStatement ps1 = conexion.prepareStatement(sql2);
//       int inscripcion =ps1.executeUpdate();
//            System.out.println(inscripcion);
//          String sql3 = "SELECT alumno.nombre, inscripcion.nota FROM alumno JOIN inscripcion ON (alumno.idalumno = inscripcion.idalumno) WHERE nota >= 8";
//PreparedStatement ps1 = conexion.prepareStatement(sql3);
//ResultSet resultado = ps1.executeQuery();
//
//while (resultado.next()) {
//    String nombre = resultado.getString("nombre");
//    int nota = resultado.getInt("nota");
//    System.out.println("Nombre: " + nombre + ", Nota: " + nota);
//}
//
//System.out.println("Consulta completada");

String sql4 = "DELETE FROM inscripcion WHERE  idalumno= 1 AND idmateria=1";
 PreparedStatement ps1 = conexion.prepareStatement(sql4);
       int inscripcion =ps1.executeUpdate();
        System.out.println(inscripcion);
 
       
            
            
            
    }catch (ClassNotFoundException cnf){
        JOptionPane.showMessageDialog(null,"error" + cnf.getMessage());
        
    }   catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"error en conexion"+ ex.getMessage());
        }
    
    }
}
