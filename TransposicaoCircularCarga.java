/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transposicaocircularcarga;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class TransposicaoCircularCarga {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int[] tarefa = {1,2,3,4,5,6,7,8,9,10};
        int ultimo;
        int i;
        int j;
        System.out.println("Quantas vezes voce quer que rode?");
        int k = scanner.nextInt();
        
        for (j = 0; j < k; j++) {
            ultimo = tarefa[9];
            
            for (i = 9; i > 0; i--) {
                tarefa[i] = tarefa[i - 1];
            }
            tarefa[0] = ultimo;
        }
        for (i = 0; i < 10; i++) {
            System.out.println(tarefa[i] + " ");
        }
    }
}
