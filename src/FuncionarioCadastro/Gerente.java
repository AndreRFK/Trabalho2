/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncionarioCadastro;
import java.util.Scanner;


/**
 *
 * @author andre
 */
public class Gerente extends Funcionario {

    private double bonusAnual;

    public Gerente() {
    }

    public Gerente(double bA) {
        bonusAnual = bA;
    }

    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }
}
