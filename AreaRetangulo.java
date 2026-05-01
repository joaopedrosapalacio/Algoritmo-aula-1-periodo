/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arearetangulo;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class AreaRetangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Coloque o valor da altura ");
        int altura = scanner.nextInt();
        
        System.out.println("Coloque o valor da base ");
        int base = scanner.nextInt();
        
        int multiplicacao = altura * base;
       
        System.out.println("A area do seu terreno e: " + multiplicacao);
        
    }
}
