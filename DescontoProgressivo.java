/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.descontoprogressivo;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class DescontoProgressivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 20.0;
        double num2 = 10.0;
        double num3 = 5.0;
        
        System.out.println("Me fale o valor total de sua compra");
        int compra = scanner.nextInt();
        
        if (compra >= 1000) {
            double desconto20 = compra * (num1 / 100);
            double valor1 = compra - desconto20;
            System.out.println("O valor do seu desconto e de " + desconto20);
            System.out.println("Seu valor final e de " + valor1);
        } else if (compra >= 500) {
            double desconto10 = compra * (num2 / 100);
            double valor2 = compra - desconto10;
            System.out.println("O valor do seu desconto e de " + desconto10);
            System.out.println("Seu valor final e de " + valor2);            
        } else if (compra >= 100) {
            double desconto5 = compra * (num3 / 100);
            double valor3 = compra - desconto5;
            System.out.println("O valor do seu desconto e de " + desconto5);
            System.out.println("Seu valor final e de " + valor3);            
        } else {
            System.out.println("Sua compra nao tem desconto");
            System.out.println("O valor de sua compra e de " + compra);
        }
    }
}
