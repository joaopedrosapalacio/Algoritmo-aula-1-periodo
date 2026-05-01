/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrizidentidade;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class MatrizIdentidade {

    public static void main(String[] args) {
        //Aluno João Pedro Sapalácio
        int matriz[][] = new int [4][4];
        int i;
        int j;
        
        for (i = 0; i < matriz.length; i++){
            for (j = 0; j < matriz.length; j++){
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        for (i = 0; i < matriz.length; i++){
            for (j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
