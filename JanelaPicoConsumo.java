/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.janelapicoconsumo;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class JanelaPicoConsumo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite o tamanho para o vetor");
        int k = scanner.nextInt();
        int vetor[] = new int[k];
        int inicio;
        int fim;
        int s;
        int i;
        int soma;
        int menor;
        int tamanho;
        System.out.println("Digite o valor");
        
        for (i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }
        System.out.println("Digite um valor pra S");
        s = scanner.nextInt();
        
        inicio = 0;
        soma = 0;
        menor = 100000;
        
        for (fim = 0; fim < vetor.length; fim++) {
            soma += vetor[fim];
            
            while (soma >= s) {
                tamanho = fim - inicio + 1;
                
                if (tamanho < menor) {
                    menor = tamanho;
                }
                soma -= vetor[inicio];
                inicio++;
            }
        }
        
        if (menor == 100000) {
            System.out.println("Nao existe subvetor");
        } else {
            System.out.println("Menor tamanho: " + menor);
        }
    }
}
