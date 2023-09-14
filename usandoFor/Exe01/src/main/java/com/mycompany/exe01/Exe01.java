/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe01;

import java.util.Scanner;

/**
 *
 * @author Zommer
 */
public class Exe01 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("escolha a tabuada base entre 1 a 10: ");
        int tabuadaEscolhida = s.nextInt();
        int resultado = 0;
        
        if(tabuadaEscolhida >= 1 && tabuadaEscolhida <= 10){
            for(int i = 0; i <= 10; i++){
            resultado = tabuadaEscolhida * i;
            //System.out.println("Tabuada do: " + tabuadaEscolhida);
            System.out.println(i + " x " + tabuadaEscolhida + " = " + resultado );
            //System.out.println(resultado);
            
        }
        }else{
                System.out.println("tabuada não existente");
                }
        
        
        
    }
}
