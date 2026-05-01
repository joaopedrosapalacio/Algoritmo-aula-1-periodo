/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversaobinariamanualreversa;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class ConversaoBinariaManualReversa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero binario");
        int binario = scanner.nextInt();
        int digito = 0;
        int potencia = 1;
        int decimal = 0;
        
        while (binario > 0) {
            digito = binario % 10;
            
            if (digito == 1) {
                decimal = decimal + potencia;
            }
            potencia = potencia * 2;
            binario = binario / 10;
        }
        System.out.println(decimal);
    }
}
