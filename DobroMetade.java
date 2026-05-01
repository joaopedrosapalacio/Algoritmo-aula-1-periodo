/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dobrometade;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class DobroMetade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num1 = scanner.nextInt();
        double multiplicacao = 2;
        double dobro = num1 * multiplicacao;
        
        System.out.println("Digite um numero");
        int num2 = scanner.nextInt();
        double divisao = 2;
        double metade = num2 / divisao;
        
        System.out.println("Seu dobro e " + dobro + " e sua metade e " + metade);
    }
}
