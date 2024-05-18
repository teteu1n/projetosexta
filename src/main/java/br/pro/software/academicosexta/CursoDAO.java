/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.pro.software.academicosexta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author andyc
 */
public class CursoDAO {
    
    public Curso[] obterCursos() throws SQLException {
        String sql = "select * from tb_curso;";
        try (Connection conn = ConexaoBD.obterConexao();
                PreparedStatement ps = conn.prepareStatement(sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = ps.executeQuery();) {
                int totalDeCursos = rs.last() ? rs.getRow(): 0;
                Curso[] cursos = new Curso[totalDeCursos];
                rs.beforeFirst();
                int contador = 0;
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nome = rs.getString("nome");
                    String tipo = rs.getString("tipo");
                    cursos[contador++] = new Curso(id, nome, tipo);
                }
                return cursos;
            }
    }
    
    public void criar(Curso curso) throws SQLException {
        String sql = "insert into tb_curso (nome, tipo) values (?, ?);";
        try (Connection conn = ConexaoBD.obterConexao();
                PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, curso.getNome());
            ps.setString(2, curso.getTipo());
            ps.executeQuery();
        }
              
    }
}
