/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediavolatilidade;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class MediaVolatilidade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double vetor[] = new double[7];
        int i;
        
        System.out.println("Digite o preco");
        
        for (i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextDouble();
        }
        double diferenca = vetor[6] - vetor[0];
        System.out.println("A diferenca do primeiro com o ultimo digito e de: " + diferenca);
    }
}
