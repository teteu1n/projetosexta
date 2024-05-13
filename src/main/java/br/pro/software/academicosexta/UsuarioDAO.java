/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.pro.software.academicosexta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author andyc
 */
public class UsuarioDAO {
    public boolean existe(Usuario usuario) throws Exception{
        String sql = "SELECT * FROM tb_usuario WHERE nome = ? AND senha = ?";
        try (Connection conn = ConexaoBD.obterConexao();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            try (ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
        }
    }
}
