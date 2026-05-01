/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agendasemanal;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class AgendaSemanal {

    public static void main(String[] args) {
        //Aluno João Pedro Sapalácio
        Scanner scanner = new Scanner (System.in);
        String [][] matriz = new String[3][3];
        int i;
        int j;
        int linha;
        int coluna;
        
        System.out.println("Coloque suas tarefas aqui");
        for (i = 0; i < matriz.length; i++){
            for (j = 0; j < matriz.length; j++){
                matriz[i][j] = scanner.nextLine();
            }
        }
        System.out.println("Qual posicao voce quer alterar?");
        System.out.println("Linha(0 a 2)");
        linha = scanner.nextInt();
        
        System.out.println("Coluna (0 a 2)");
        coluna = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Coloque a sua nova tarefa");
        matriz[linha][coluna] = scanner.nextLine();
        
        for (i = 0; i < matriz.length; i++){
            for (j = 0; j < matriz.length; j++){
                System.out.println(matriz[i][j]);
            }
        }
    }
}
