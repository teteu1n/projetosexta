/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.pro.software.academicosexta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author andyc
 */
public class ConexaoBD {
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "academico";
    private static String usuario = "root";
    private static String senha = "1234"; // você coloca anima123

    /*public static Connection obterConexao() throws SQLException {
        String url = String.format(
          "jdbc:mysql://%s:%s/%s",
            host,
            porta,
            db
       );
        return DriverManager.getConnection(url, usuario, senha);
    }*/
    public static Connection obterConexao (){
        try {
            Connection c = DriverManager.getConnection(
            "jdbc:mysql://" + host + ":" + porta + "/" + db + "?user=" + usuario + 
            "&password=" + senha + 
            "&useTimezone=true&serverTimezone=America/Sao_Paulo");
            return c;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}