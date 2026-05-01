/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inversordigito;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class InversorDigito {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int inverso = 0;        
        
        System.out.println("Digite um numero inteiro");
        int numero = scanner.nextInt();
        
        for (int i = numero; i != 0; i /=10) {
            int digito = i %10;
            inverso = (inverso * 10) + digito;
        }
        System.out.println(inverso);
    }
}
