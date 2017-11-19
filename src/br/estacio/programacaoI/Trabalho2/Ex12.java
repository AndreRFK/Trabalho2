package br.estacio.programacaoI.Trabalho2;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("informe quantidade de valores ");
        int qt = x.nextInt();
        int a[] = new int[qt];
        int b[] = new int[qt];

        for (int i = 0; i < qt; i++) {
            System.out.println("Informe valor " + (i + 1));
            a[i] = x.nextInt();
        }
        inverte(a, b, qt);
    }

    public static void inverte(int a[], int b[], int qt) {

        int j = qt - 1;
        for (int i = 0; i < qt; i++) {
            b[i] = a[j];
            j -= 1;
        }
        for (int i = 0; i < qt; i++) {
            System.out.println("B[]" + b[i]);
        }
    }
}
