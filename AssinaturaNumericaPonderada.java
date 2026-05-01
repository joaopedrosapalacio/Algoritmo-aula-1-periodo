/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assinaturanumericaponderada;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AssinaturaNumericaPonderada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite um numero inteiro");
        int numero = scanner.nextInt();
        
        while (numero >= 10) {
            int soma = 0;
            int i = 1;
            
        while (numero > 0) {
            int digito = numero % 10;
            soma += (digito * i);
            numero = numero / 10;
            i++;
        }
        numero = soma;
        }
        System.out.println("Sua assinatura e " + numero);
    }
}
