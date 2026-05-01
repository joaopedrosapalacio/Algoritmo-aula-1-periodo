/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafiofinal;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class DesafioFinal {

    public static void main(String[] args) {
        //Aluno João Pedro Sapalácio
        Scanner scanner = new Scanner(System.in);
        int [][] matriz = {
            {1,6,5,3,0},
            {2,4,9,8,2},
            {3,5,4,3,4},
            {1,2,3,4,5},
            {6,7,8,9,0},
        };

        int soma = 0;
        
        System.out.println("Informe uma linha(0 a 4)");
        int linha = scanner.nextInt();
        
        System.out.println("Informe uma coluna (0 a 4)");
        int coluna = scanner.nextInt();
        
        System.out.println("O numero na linha e coluna escolhida foi: " + matriz[linha][coluna]);
        
        if (linha > 0) {
            soma = soma + matriz[linha - 1][coluna];
        }

        if (linha < 4) {
            soma = soma + matriz[linha + 1][coluna];
        }

        if (coluna > 0) {
            soma = soma + matriz[linha][coluna - 1];
        }

        if (coluna < 4) {
            soma = soma + matriz[linha][coluna + 1];
        }

        System.out.println("A soma dos vizinhos e: " + soma);
    }
}
