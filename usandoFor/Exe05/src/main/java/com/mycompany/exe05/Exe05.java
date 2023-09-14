/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe05;

import java.util.Scanner;

/**
 *
 * @author Zommer
 */
public class Exe05 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("digite 5 valores inteiros: ");
        int numerosInt = 0;
        
        for(int i = 0; i < 5; i++){
            int numeroDigitado = s.nextInt();
            if(numeroDigitado % 2 == 0){
                numerosInt++;
            }
        }
        System.out.println(numerosInt + " numeros dos que digitou, são numeros inteiros");
    }
}
