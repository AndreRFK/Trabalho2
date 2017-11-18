/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacaoI.Ex1.Ex2.Ex3;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Matriz {

    public static void main(String args[]) {
        Scanner t = new Scanner(System.in);
        int a[][];
        a = new int[2][2];
        int b[][];
        b = new int[2][2];
        int c[][];
        c = new int[2][2];
        for (int i = 0; i < 2; i++) {
            System.out.println();
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o elemento " + i + " " + j + " da matriz a: ");
                a[i][j] = t.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            System.out.println();
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o elemento " + i + " " + j + " da matriz b: ");
                b[i][j] = t.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("");
            for (int j = 0; j < b.length; j++) {
                for (int x = 0; x < a[i][j]; x++) {
                    c[i][j] = a[i][x] * b[x][j];
                    System.out.print(c[i][j]);
                    System.out.print(" ");
                }
            }
            break;
        }
        System.out.println();
        System.out.println();
    }
}
