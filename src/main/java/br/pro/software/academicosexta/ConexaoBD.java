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
    private static String senha = "root"; // você coloca anima123

    public static Connection obterConexao() throws SQLException {
        String url = String.format(
          "jdbc:mysql://%s:%s/%s",
            host,
            porta,
            db
       );
    return DriverManager.getConnection(url, usuario, senha);
    }
}