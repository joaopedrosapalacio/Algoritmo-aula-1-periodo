/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.custodiaativos;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class CustodiaAtivos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double taxa = 0.5;
        
        System.out.println("Digite o valor que vai investir");
        double valor = scanner.nextInt();
        
        double taxaTotal = valor * taxa;
        double valorTotal = valor + taxaTotal;
        System.out.println("Seu valor final liquido e de: " + valorTotal);
        System.out.println("Sua taxa a seu pega e de: " + taxaTotal);
    }
}
