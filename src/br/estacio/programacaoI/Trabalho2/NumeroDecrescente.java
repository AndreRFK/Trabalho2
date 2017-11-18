/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacaoI.Trabalho2;

import java.util.Scanner;

public class NumeroDecrescente {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Insira um numero: ");
            array[i] = entrada.nextInt();
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
