/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe06;

import java.util.Scanner;

/**
 *
 * @author Zommer
 */
public class Exe06 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int fatorial = 1;
        System.out.println("escreva um numero inteiro: ");
        int numero = s.nextInt();
        
        for(int i = 2; i <= numero; i++){
            fatorial *= i;
        }
        System.out.println( "O fatorial de " + numero + " é igual a " + fatorial );

    }
}
