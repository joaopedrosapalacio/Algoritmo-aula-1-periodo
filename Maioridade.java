/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maioridade;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Maioridade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual e a sua idade? ");
        int idade = scanner.nextInt();
        
        if (idade >= 18){
            System.out.println("Pode entrar!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
