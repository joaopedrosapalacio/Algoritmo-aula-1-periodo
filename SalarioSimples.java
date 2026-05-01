/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salariosimples;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class SalarioSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto voce ganha por hora? ");
        int ganho = scanner.nextInt();
        
        System.out.println("Quantas horas voce trabalhou? ");
        int hora = scanner.nextInt();
        
        int soma = ganho * hora;
        
        System.out.println("Seu salario final e de: " + soma);
    }
}
