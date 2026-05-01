/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.identificacaopadroesatipicos;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class IdentificacaoPadroesAtipicos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int vetor[] = new int[20];
        int contagem[] = new int[20];
        int i;
        int j;
        int contador = 0;
        System.out.println("Preencha o vetor com os IDs");
        
        for (i = 0; i < vetor.length; i++){
            vetor[i] = scanner.nextInt();
            
        } for (i = 0; i < vetor.length; i++) {
            for (j = 0; j < vetor.length; j++) {
                contador = 0;
                if (vetor[i] == vetor[j]) {
                    contador++;
                }
            }
            if (contagem[i] > 3) {
                contagem[i] = 0;
            } else {
                contagem[i] = contador;
            }
        }
        for (i = 0; i < vetor.length; i++) {
            System.out.println("ID: " + vetor[i] + " " + contagem[i]);
        }
    }
}
