/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.filtropositivos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class FiltroPositivos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int numero = 0;
        int i = 0;
        
        while (numero >= 0) {
            System.out.println("Digite um numero");
            numero = scanner.nextInt();
            
            if (numero >= 0) {
                i++;
            }
        }
        System.out.println("Voce digitou " + i + " numeros corretos");
    }
}
