/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adivinhar;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Adivinhar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int segredo = 7;
        System.out.println("Chute um numero de 1 a 10");
        int numero = scanner.nextInt();
        if (numero == segredo){
            System.out.println("Parabens, ganhou");
        } else {
            System.out.println("Errou, tente novamente");
        }
    }
}
