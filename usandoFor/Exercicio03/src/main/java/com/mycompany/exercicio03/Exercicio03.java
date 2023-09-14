/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio03;

import java.util.Scanner;

/**
 *
 * @author Zommer
 */
public class Exercicio03 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("escreva 10 valores inteiros: ");
        int valorPositivo = 0;
        int valorNegativo = 0;
        int valor5A50 = 0;
        
        for(int i = 0; i < 10; i++){
            int valorInt = s.nextInt();
            if(valorInt > 0 && valorInt < 5 || valorInt > 50){
                valorPositivo += valorInt;
            }else if(valorInt >= 5 && valorInt <= 50){
                valor5A50++;
            }else{
                valorNegativo++;
            }
        }
        System.out.println("a soma dos valores positivos são: " + valorPositivo);
        System.out.println("a quantidade de valores negativos é: " + valorNegativo);
        System.out.println("os valores entre 5 a 50 são: " + valor5A50);
    }
}
