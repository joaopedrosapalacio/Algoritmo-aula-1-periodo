/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculovendas;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class CalculoVendas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Volume de vendas?");
        int volume = scanner.nextInt();
        
        System.out.println("Quantidade de vendas?");
        int qnt = scanner.nextInt();
        
        if (volume > 100000 && qnt >= 0) {
            System.out.println("Voce ganhou 10% de bonus");
        } else if (volume >= 50000 && qnt > 10) {
            System.out.println("Voce ganhou 5% de bonus");
        } else if (volume >= 50000 && qnt <= 10) {
            System.out.println("Voce ganhou 2% de bonus");
        } else {
            System.out.println("Voce nao ganhou o bonus");
        }
    }
}
