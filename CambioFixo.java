/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cambiofixo;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class CambioFixo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos reais voce tem em maos? ");
        int reais = scanner.nextInt();
        
        double dolar = 5;
        double total = reais / dolar;
        
        System.out.println("Seu dinheiro em dolar e igual a: " + total);
    }
}
