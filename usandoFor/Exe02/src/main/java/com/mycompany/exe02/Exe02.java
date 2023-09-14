/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe02;

import java.util.Scanner;

/**
 *
 * @author Zommer
 */
public class Exe02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("escreva 5 valores: ");
        //int valores = s.nextInt();
        int valoresNegativos = 0;
        
        for(int i = 0; i < 5; i++){
          int valores = s.nextInt();
          if(valores < 0){
              valoresNegativos++;
          }
        }
        //System.out.println("");
        System.out.println("a quantidade de valores negativos são: " + valoresNegativos );
    }
}
