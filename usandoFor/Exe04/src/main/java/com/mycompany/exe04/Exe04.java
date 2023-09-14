/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe04;

import java.util.Scanner;

/**
 *
 * @author Zommer
 */
public class Exe04 {

     public static void main(String[] args) {
        //final int TOTAL_NUMBERS = 5;
        Scanner scanner = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número inteiro positivo: ");
            int number = scanner.nextInt();

            largest = Math.max(largest, number);
            smallest = Math.min(smallest, number);
            sum += number;
        }

        double average = (double) sum / 5;

        System.out.println("Maior valor: " + largest);
        System.out.println("Menor valor: " + smallest);
        System.out.println("Média dos números lidos: " + average);
    }

}
