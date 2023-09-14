/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe08;

import java.util.Scanner;

/**
 *
 * @author Zommer
 */
public class Exe08 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double mediaAluno1 = 0;
        double mediaAluno2 = 0;
        double mediaAluno3 = 0;
        double mediaAluno4 = 0;
        double mediaAluno5 = 0;
        
        
   for (int aluno = 1; aluno <= 5; aluno++) {
            int notasAluno = 0;
            
            for (int nota = 1; nota <= 4; nota++) {
                System.out.println("Aluno #" + aluno + " - Digite a nota do bimestre #" + nota + ":");
                int notaBimestral = s.nextInt();
                notasAluno += notaBimestral;
            } 
        }
   
   System.out.println("Média do Aluno1: " + mediaAluno1);
   System.out.println("Média do Aluno1: " + mediaAluno2);
   System.out.println("Média do Aluno1: " + mediaAluno3);
   System.out.println("Média do Aluno1: " + mediaAluno4);
   System.out.println("Média do Aluno1: " + mediaAluno5);
   
   //if()
}
}