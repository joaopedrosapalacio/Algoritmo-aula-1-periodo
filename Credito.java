/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.credito;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Credito {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Qual e a sua idade?");
        int idade = scanner.nextInt();
        
        System.out.println("Qual e a sua renda?");
        int renda = scanner.nextInt();
        
        System.out.println("Voce tem um fiador?");
        boolean fiador = scanner.nextBoolean();
        if (idade >= 21 && renda > 3000) {
            System.out.println("Seu credito foi aprovado");
        } else if (idade < 21 || renda <= 3000 || fiador == true) {
            System.out.println("Voce podera ser aprovado");
        } else {
            System.out.println("Credito negado");
        }
    }
}
