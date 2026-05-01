/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maiorfaturamento;

/**
 *
 * @author Aluno
 */
public class MaiorFaturamento {

    public static void main(String[] args) {
        int matriz[][] = {
            {5,9,8,6},
            {3,4,5,1},
            {3,5,0,9},
        };
        int i;
        int j;
        int maior = 0;
        
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {
                
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        System.out.println("O maior numero e: " + maior);
    }
}
