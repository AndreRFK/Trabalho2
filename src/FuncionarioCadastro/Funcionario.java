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
public class Funcionario extends Pessoa {

    private int NumeroCad;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(int numCad, double sal) {
        NumeroCad = numCad;
        salario = sal;
    }

    public int getNumeroCad() {
        return NumeroCad;
    }

    public void setNumeroCad(int NumeroCad) {
        this.NumeroCad = NumeroCad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
