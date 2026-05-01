/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bonusretencao;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class BonusRetencao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Qual e o tempo que voce esta na empresa?");
        int tempo = scanner.nextInt();
        
        System.out.println("Qual e o seu salario?");
        double salario = scanner.nextInt();
        
        if (tempo > 5) {
            double bonus1 = salario * 0.20;
            double total1 = salario + bonus1;
            System.out.println("Voce ganhou 20% de bonus");
            System.out.println("Seu novo salario e de: " + total1);
        } else if (tempo >= 2) {
            double bonus2 = salario * 0.20;
            double total2 = salario + bonus2;
            System.out.println("Voce ganhou 10% de bonus");
            System.out.println("Seu novo salario e de: " + total2);
        } else {
            System.out.println("Voce nao obteve um bonus ainda!");
        }
    }
}
