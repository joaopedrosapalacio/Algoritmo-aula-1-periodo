/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chamadosprioridades;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ChamadosPrioridades {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int matriz[][] = new int [5][5];
        int i;
        int j;
        int chamados = 0;
        System.out.println("Preencha com 0 para nao chamados e 1 para chamados");
        
        for (i = 0; i < matriz.length; i++){
            for (j = 0; j < matriz.length; j++) {
                matriz[i][j] = scanner.nextInt();
                
                if (matriz[i][j] == 1) {
                    chamados++;
                }
            }
        }
        System.out.println("Existe " + chamados + " chamados");
    }
}
