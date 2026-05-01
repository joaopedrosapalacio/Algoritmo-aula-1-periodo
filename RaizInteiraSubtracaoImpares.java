/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.raizinteirasubtracaoimpares;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class RaizInteiraSubtracaoImpares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("digite um numero");
        int numero = scanner.nextInt();
        int impar = 1;
        int i = 0;
        while (numero >= impar) {
            numero = numero - impar;
            impar+=2;
            i++;
        }
        System.out.println("Sua raiz e " + i);
    }
}
