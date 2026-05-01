/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fretecargaviva;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class FreteCargaViva {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual foi a distancia percorrida?");
        double distancia = scanner.nextInt();
        
        double transporte = 1200;
        double taxa = distancia * 5;
        double total = transporte + taxa;
        
        System.out.println("Seu total a pagar e de: " + total);
    }
}
