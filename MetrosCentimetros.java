/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metroscentimetros;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class MetrosCentimetros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Coloque uma medida em metros: ");
        int metros = scanner.nextInt();
        double centimetros = 100;
        double resultado = metros * centimetros;
        
        System.out.println("Seu resultado em centimetro e: " + resultado);
        
    }
}
