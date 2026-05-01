/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adivinhenumero;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AdivinheNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int segredo = 42;
        int numero = 1;
        
        while (numero != segredo) {
            System.out.println("Digite um numero");
            numero = scanner.nextInt();
            
            if (numero > 42) {
                System.out.println("O numero e menor");
            } else if (numero < 42) {
                System.out.println("O numero e maior");
            }
        }
        System.out.println("Parabens! Voce acertou o numero");
    }
}
