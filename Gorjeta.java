/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gorjeta;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class Gorjeta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual e o valor da sua conta? ");
        int valor = scanner.nextInt();
        
        double gorjeta = 0.10;
        double total = valor * gorjeta;
        System.out.println("Seu valor total e de: " + total);
    }
}
