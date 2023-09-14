/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe07;

import java.util.Scanner;

/**
 *
 * @author Zommer
 */
public class Exe07 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalValores = 20;
        int contadorNegativos = 0;
        int contadorPositivos = 0;

        for (int i = 0; i < totalValores; i++) {
            System.out.print("Digite o valor #" + (i + 1) + ": ");
            int valor = scanner.nextInt();

            if (valor < 0) {
                contadorNegativos++;
            } else if (valor > 0) {
                contadorPositivos++;
            }
        }

        double percentualNegativos = (double) contadorNegativos / totalValores * 100;
        double percentualPositivos = (double) contadorPositivos / totalValores * 100;

        System.out.println("Percentual de valores negativos: " + percentualNegativos + "%");
        System.out.println("Percentual de valores positivos: " + percentualPositivos + "%");

        scanner.close();
    }
}
