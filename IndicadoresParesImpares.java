/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.indicadoresparesimpares;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class IndicadoresParesImpares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz [][] = new int [4][3];
        int i;
        int j;
        int par = 0;
        int impar = 0;
        System.out.println("Preencha a matriz");
        
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {
                matriz[i][j] = scanner.nextInt();
                
                if (matriz[i][j] % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }
        }
        System.out.println("Existe : " + par + " numeros pares");
        System.out.println("Existe : " + impar + " numeros impares");
    }
}
