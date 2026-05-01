/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.validador;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Validador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Coloque um numero inteiro");
        int num1 = scanner.nextInt();
        
        System.out.println("Coloque outro numero inteiro");
        int num2 = scanner.nextInt();
        
        if(num2 == 0){
            System.out.println("Erro: impossivel dividir por zero");
        } else {
            double divisao = num1 / num2;
            System.out.println("Seu valor e: " + divisao);
        }
    }
}
