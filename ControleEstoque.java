/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controleestoque;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ControleEstoque {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int matriz [][] = new int [2][4];
        int i;
        int j;
        System.out.println("Digite a quantidade de cada item no estoque");
        for (i = 0; i < matriz.length; i++){
            for (j = 0; j < matriz.length; j++) {
                matriz[i][j] = scanner.nextInt();
                
            }
        }
        for (i = 0; i < matriz.length; i++){
            for (j = 0; j < matriz.length; j++){
                
                if (matriz[i][j] == 0){
                    System.out.println("Sem item no produto " + i + " " + j);
                }
            }
        }
    }
}
