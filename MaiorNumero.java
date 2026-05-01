/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maiornumero;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class MaiorNumero {

    public static void main(String[] args) {
        //Aluno João Pedro Sapalácio
        Scanner scanner = new Scanner (System.in);
        int numero[] = new int[5];
        int i;
        int maior;
        
        for (i = 0; i < numero.length; i++){
            System.out.println("digite um numero");
            numero[i] = scanner.nextInt(); 
        }
        maior = numero[0];
        
        for (i = 1; i < 5; i++) {
            if (numero[i] > maior) {
                maior = numero[i];
            }
        }
        System.out.println(maior);
    }
}
