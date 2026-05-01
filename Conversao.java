/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversao;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class Conversao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Digite um numero");
        int numero = scanner.nextInt();
        String resultado = "";
        
        if (numero == 0){
            resultado = "0";
        }
        for (int i = numero; i > 0; i/=2) {
            int digito = i % 2;
            resultado = resultado + digito;
        }
        System.out.print("Seu numero binario e " + resultado);
    }
}
