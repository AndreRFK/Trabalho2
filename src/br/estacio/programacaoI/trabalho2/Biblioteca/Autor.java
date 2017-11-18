/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacaoI.trabalho2.Biblioteca;

/**
 *
 * @author andre
 */
public class Autor {

    private String nome;
    private String email;
    private String genero;

    public Autor() {
    }

    public Autor(String name, String eml, String gender) {
        nome = name;
        email = eml;
        genero = gender;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
