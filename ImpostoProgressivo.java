/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.impostoprogressivo;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ImpostoProgressivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 10;
        double num2 = 20;
        double num3 = 30;
        
        System.out.println("Qual e o seu rendimento utilizador? ");
        int rendimento = scanner.nextInt();
        
        if (rendimento < 10000) {
            System.out.println("Sem imposto para pagar");
        } else if (rendimento < 20000) {
            double imposto1 = rendimento * (num1 / 100);
            System.out.println("Seu valor pra pagar de impostoe de R$ " + imposto1);
        } else if (rendimento < 50000) {
            double imposto2 = rendimento * (num2 / 100);
            System.out.println("Seu valor pra pagar de impostoe de R$ " + imposto2);
        } else {
            double imposto3 = rendimento * (num3 / 100);
            System.out.println("Seu valor pra pagar de impostoe de R$ " + imposto3);
        }
    }
}
