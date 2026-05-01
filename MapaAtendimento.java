/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mapaatendimento;

/**
 *
 * @author Aluno
 */
public class MapaAtendimento {

    public static void main(String[] args) {
        // Aluno João Pedro Sapalácio
        int [][] matriz = {
            {1,2,3},
            {4,5,6},
            {7,8,9},   
        };
        int i;
        int j;
        int soma = 0;
        int media;
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {
                soma += matriz[i][j];
            }
        }
        media = soma / 9;
        System.out.println("A soma da matriz e: " + soma);
        System.out.println("A media da matriz e: " + media);
    }
}
