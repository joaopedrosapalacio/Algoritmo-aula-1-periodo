/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aumentosalarial;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AumentoSalarial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 15;
        double num2 = 10;
        double num3 = 5;
        
        System.out.println("Qual e o seu salario?");
        int salario = scanner.nextInt();
        
        if (salario < 1000) {
            double aumento1 = salario * (num1 / 100);
            double valor1 = salario + aumento1;
            System.out.println("Seu salario original e de R$ " + salario);
            System.out.println("Seu aumento e de R$ " + aumento1);
            System.out.println("Seu novo salario e de R$ " + valor1);
        } else if (salario < 2000) {
            double aumento2 = salario * (num2 / 100);
            double valor2 = salario + aumento2;
            System.out.println("Seu salario original e de R$ " + salario);
            System.out.println("Seu aumento e de R$ " + aumento2);
            System.out.println("Seu novo salario e de R$ " + valor2);            
        } else {
            double aumento3 = salario * (num3 / 100);
            double valor3 = salario + aumento3;
            System.out.println("Seu salario original e de R$ " + salario);
            System.out.println("Seu aumento e de R$ " + aumento3);
            System.out.println("Seu novo salario e de R$ " + valor3);            
        }
        
    }
}
