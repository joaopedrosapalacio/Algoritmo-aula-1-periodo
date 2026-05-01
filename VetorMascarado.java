/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetormascarado;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class VetorMascarado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor[] = new int [8];
        int i;
        
        for (i = 0; i < vetor.length;i++) {
        System.out.println("Digite os numeros");
        vetor[i] = scanner.nextInt();
        
        if (vetor[i] < 0) {
            vetor[i] = 0;
        } else {
            vetor[i] = 1;
        }
        } for (i = 0; i < vetor.length;i++){
        System.out.println("Seu novo valor " + vetor[i]);
        }
    }
}
