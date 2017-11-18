/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacaoI.Trabalho2;

public class Ex11 {

    public static void main(String[] args) {
        int Par = 0;
        int Impar = 1;
        int soma = 0;
        int multiplicar = 1;

        while ((Par < 30) && (Impar < 29)) {
            Par = Par + 2;
            soma = soma + Par;
            Impar = Impar + 2;
            multiplicar = multiplicar * Impar;
        }
        System.out.println("A soma dos pares é: " + soma);
        System.out.println("A multiplicação dos ímpares é: " + multiplicar);
    }

}
