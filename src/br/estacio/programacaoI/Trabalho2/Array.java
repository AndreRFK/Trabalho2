/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacaoI.Trabalho2;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner guardar = new Scanner(System.in);

        int a = 10;
        int v[] = new int[a];
        int i;

        for (i = 0; i < a; i++) {
            System.out.printf("Digite %2do. valor de %d: ", (i + 1), a);
            v[i] = guardar.nextInt();
        }
        int soma = 0;
        for (i = 0; i < a; i++) {
            soma = soma + v[i];
        }
        System.out.printf("Soma = %d", soma);
    }
}
