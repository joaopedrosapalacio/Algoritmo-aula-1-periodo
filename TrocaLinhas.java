/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trocalinhas;

/**
 *
 * @author Aluno
 */
public class TrocaLinhas {

    public static void main(String[] args) {
        int matriz[][] = {
            {1,2,3},
            {4,5,6},
        };
        int matriz2;
        int i;
        int j;
        
        for (i = 0; i < matriz.length; i++) {
            matriz2 = matriz[0][i];
            matriz[0][i] = matriz[1][i];
            matriz[1][i] = matriz2;
        }
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
            }
        }
    }
}
