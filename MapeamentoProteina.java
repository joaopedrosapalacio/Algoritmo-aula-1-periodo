/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mapeamentoproteina;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class MapeamentoProteina {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double vetor[] = new double[10];
        int i;
        double soma = 0;
        int falha = 0;
        
        for (i = 0; i < vetor.length; i++) {
        System.out.println("Digite os valores do pH");
        vetor[i] = scanner.nextDouble();
        
        soma += vetor[i];
        
        if (vetor[i] >= 6.5 && vetor[i] <= 7.5){
            falha++;
        }
        }
        double media = soma / 10;
        System.out.println("A media do pH e de: " + media);
        System.out.println("A quantidade de pH fora da faixa e de: " + falha);
    }
}
