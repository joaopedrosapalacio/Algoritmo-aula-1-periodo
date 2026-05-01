/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soma;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class Soma {

    public static void main(String[] args) {
     int soma;
     Scanner leitor = new Scanner(System.in);  
     System.out.println("Digite um numero: ");
     int num1 = leitor.nextInt();
     System.out.println("Digite outro numero: ");
     int num2 = leitor.nextInt();
   
     soma = num1 + num2;
     
        System.out.println(soma);
    }
}
