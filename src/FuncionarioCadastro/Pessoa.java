/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionarioCadastro;

/**
 *
 * @author andre
 */
public class Pessoa {

    private String nome;
    private int idade;
    private String CPF;

    public Pessoa() {
    }

    public Pessoa(String name, int id, String cpf) {
        nome = name;
        idade = id;
        CPF = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
