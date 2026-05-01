/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consumorack;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class ConsumoRack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual o custo do kWh?");
        double custo = scanner.nextInt();
        
        System.out.println("Digite a quantidade de racks");
        int racks = scanner.nextInt();
        
        double consumo = (2.4 * 24) * racks;
        
        double total = consumo * custo;
        
        System.out.println("Seu custo total e de: " + total);
    }
}
