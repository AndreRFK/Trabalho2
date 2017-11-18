/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacaoI.Trabalho2;

import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {
        Scanner entrada;
        int num1;
        int num2;

        entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = entrada.nextInt();

        if (num1 > num2) {
            System.out.println("O numero" + num1 + "e maior");
        } else {
            if (num2 > num1) {
                System.out.println("O numero" + num2 + "e maior");
            } else {
                System.out.println("Os numero digitados sao os mesmos");
            }
        }
    }
}
