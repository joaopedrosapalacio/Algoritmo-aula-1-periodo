/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clubevantagem;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class ClubeVantagem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Qual e o valor de sua compra?");
        double valor = scanner.nextInt();
        
        if (valor > 500) {
            double desconto1 = valor * 0.10;
            double total1 = valor - desconto1;
            System.out.println("Voce ganhou 10% de desconto");
            System.out.println("Seu valor total a paga e de: " + total1);
        } else {
            double desconto2 = valor * 0.05;
            double total2 = valor - desconto2;
            System.out.println("Voce ganhou 5% de desconto");
            System.out.println("Seu valor total a paga e de: " + total2);
        }
    }
}
