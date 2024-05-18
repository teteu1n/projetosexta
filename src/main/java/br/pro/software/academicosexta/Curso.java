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
    private String tipo;

    public Curso(int id, String nome, String tipo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
    }

    public Curso(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }
    
    public String toString() {
        return nome + ", " + tipo;
    }
}
