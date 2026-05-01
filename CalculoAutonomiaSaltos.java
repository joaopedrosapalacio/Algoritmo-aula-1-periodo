/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculoautonomiasaltos;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class CalculoAutonomiaSaltos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor");
        int k = scanner.nextInt();
        int vetor[] = new int[k];
        System.out.println("Digite os valores do vetor:");
        int i;
        int saltos;
        int posicao;
        int melhorPosicao;
        int maiorAlcance;
        int alcance;
        
        for (i = 0; i < k; i++) {
            vetor[i] = scanner.nextInt();
            }
        posicao = 0;
        saltos = 0;
        boolean chegou = true;
        
        while (posicao < k - 1 && chegou) {
            if (vetor[posicao] == 0) {
                chegou = false;
            }
            melhorPosicao = posicao;
            maiorAlcance = -1;
            
            for (i = 1; i <= vetor[posicao] && posicao + i < k; i++) {
                alcance = posicao + i + vetor[posicao + i];
                
                if (alcance > maiorAlcance) {
                    maiorAlcance = alcance;
                    melhorPosicao = posicao + i;
                }
            }
            posicao = melhorPosicao;
            saltos++;
        } if (chegou) {
        System.out.println("Parabens voce chegou ao final, quantidade de saltos e: " + saltos);
        } else {
            System.out.println("Nao e possivel chegar ao final");
        }
    }
}
