/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuadalonga;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class TabuadaLonga {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite um numero");
        int numero = scanner.nextInt();
        
        for (int i = 1; i <= 100; i++) {
            int calculo = numero * i;
            System.out.println(calculo);
        }
    }
}
