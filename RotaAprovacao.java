/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rotaaprovacao;

/**
 *
 * @author Aluno
 */
public class RotaAprovacao {

    public static void main(String[] args) {
        int matriz[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        int i;
        int j;
        int soma = 0;
        
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {
                if (i == j) {
                    soma += matriz[i][j];
                }
            }
        }
        System.out.println("A soma da diagonal principal e: " + soma);
    }
}
