/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.detecaoanomaliaspico;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class DetecaoAnomaliasPico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int vetor[] = new int[5];
        int i;
        int esquerda;
        int direita;
        
        System.out.println("Digite os valores");
        
        for (i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        } for (i = 0; i < vetor.length; i++) {
            if (i == 0) {
                esquerda = vetor[vetor.length - 1];
            } else {
                esquerda = vetor[i - 1];
            } 
            if (i == 4) {
                direita = vetor[0];
            } else {
                direita = vetor[i + 1];
            }
            if (vetor[i] > esquerda && vetor[i] > direita) {
                System.out.println("Os picos sao: " + i + " e o valor dele e: " + vetor[i]);
            }
        }
    }
}
