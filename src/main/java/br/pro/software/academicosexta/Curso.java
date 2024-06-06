/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.pro.software.academicosexta;

/**
 *
 * @author andyc
 */
public class Curso {
    private int id;
    private String nome;
    private String link_videoaula;
    private String link_exercicio;

    public Curso(int id, String nome, String link_videoaula, String link_exercicio) {
        this.id = id;
        this.nome = nome;
        this.link_videoaula = link_videoaula;
        this.link_exercicio = link_exercicio; 
    }

    public Curso(String nome, String link_videoaula, String link_exercicio) {
        this.nome = nome;
        this.link_videoaula = link_videoaula;
        this.link_exercicio = link_exercicio;
    }

    Curso(int id, String nome, String link_exercicio){
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getLinkexercicio() {
        return link_exercicio;
    }
    
    public String getLinkvideoaula() {
        return link_videoaula;
    }
    
    public String toString() {
        return nome + ", " + link_videoaula + link_exercicio;
    }
}
