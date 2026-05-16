/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.triagemhospitalar;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro Sapalacio
 */
public class TriagemHospitalar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor [] = new int [10];
        int i;
        int n = 10;
        
        System.out.println("Coloque os pacientes de acordo com o nivel de gravidade");
        System.out.println("Menor = muito grave, Maior = menos grave");
        for (i = 0; i < vetor.length; i++){
            vetor[i] = scanner.nextInt();
        }
        
        for (i = 1; i < n; i++){
            int chave = vetor[i];
            int j = i - 1;
            
            while (j >= 0 && vetor[j] > chave){
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = chave;
        }
        for (i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
    }
}
// A vantagem e que o Bubble sort ele muda apenas uma posiçao ja o insertion sort muda todos e coloca em ordem crescente
