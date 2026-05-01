/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.triagemcacheprioridade;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class TriagemCachePrioridade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numero[] = new int[10];
        int i;
        int esquerda = 0;
        int direita = numero.length - 1;
        int temp;
        System.out.println("Digite os numeros");
        
        for (i = 0; i < numero.length; i++) {
            numero[i] = scanner.nextInt();
        } while (esquerda < direita) {
            if (numero[esquerda] % 2 == 0) {
                esquerda++;
            } else if (numero[direita] % 2 != 0) {
                direita--;
            } else {
                temp = numero[esquerda];
                numero[esquerda] = numero[direita];
                numero[direita] = temp;
                
                esquerda++;
                direita--;
            }
        }
        System.out.println("Numeros organizados");
        for (i = 0; i < numero.length; i++) {
            System.out.println(numero[i] + " ");
        }
    }
}
