/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transpostarelatorio;

/**
 *
 * @author Joao Pedro
 */
public class TranspostaRelatorio {

    public static void main(String[] args) {
        //Aluno João Pedro Sapalácio
        int [][] matriz = {
            {1,2,3},
            {4,5,6},
        };
        int i;
        int j;
        for (j = 0; j < 3; j++){
            for (i = 0; i < 2; i++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
