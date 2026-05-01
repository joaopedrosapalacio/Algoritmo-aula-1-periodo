/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.validacaoespelhoinverso;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class ValidacaoEspelhoInverso {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int vetor[] = new int[12];
        int espelho;
        int i;
        int erros = 0;
        
        for (i = 0; i < vetor.length; i++) {
            System.out.println("Digite a sequencia de dados numericos");
            vetor[i] = scanner.nextInt();
        } for (i = 0; i < 6; i++) {
            espelho = 11 - i;
            
            if (vetor[i] != 2 * espelho) {
                erros++;
            } else {
                
            }
        }
        System.out.println("Sua sequencia de dados tem um total de " + erros + " erros");
    }
}
