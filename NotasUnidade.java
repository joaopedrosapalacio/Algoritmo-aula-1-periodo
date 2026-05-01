/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notasunidade;

/**
 *
 * @author Aluno
 */
public class NotasUnidade {

    public static void main(String[] args) {
        double matriz [][] = {
            {6,7,8},
            {4,5,3},
            {0,1,2},
        };
        int i;
        int j;
        int somaLinha;
        int media;
        for (i = 0; i < matriz.length; i++){
            somaLinha = 0;
            for (j = 0; j < matriz.length; j++){
                somaLinha += matriz[i][j];
            }
            media = somaLinha / 3;
            System.out.println("A media do " + i + " e igual: " + media);
        }
    }
}
