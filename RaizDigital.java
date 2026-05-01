/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.raizdigital;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class RaizDigital {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite um numero");
        int numero = scanner.nextInt();
        
        int soma = 0;
        
        for (int i = numero; i >= 0; i /=10) {
            int digito = i %10;
            soma = soma + digito;
        }
        System.out.println(soma);
    }
}
