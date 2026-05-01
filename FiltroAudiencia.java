/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.filtroaudiencia;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class FiltroAudiencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double vetor[] = new double[10];
        double vetor2[] = new double[10];
        int i;
        
        System.out.println("Qual foi o tempo assistido?");
        
        for (i = 0; i < vetor.length; i++) {
        vetor[i] = scanner.nextDouble();
        
        if (vetor[i] > 30) {
            vetor2[i] = vetor[i];
        }
        }
        for (i = 0; i < vetor2.length; i++){
            System.out.println(vetor2[i]);
        }
    }
}
