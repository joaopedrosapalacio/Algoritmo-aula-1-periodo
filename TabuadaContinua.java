/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuadacontinua;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class TabuadaContinua {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int i = 1;
        int numero = 1;
        
        while (i == 1) {
            System.out.println("Digite um numero");
            numero = scanner.nextInt();
            int tabuada = 1;
            
            while (tabuada <= 10){
                System.out.println( (tabuada * numero) );
                tabuada ++;
            }
            System.out.println("Deseja ver outra tabuada? 1- Sim, 0- Nao");
            i = scanner.nextInt();
        }
        
    }
}
