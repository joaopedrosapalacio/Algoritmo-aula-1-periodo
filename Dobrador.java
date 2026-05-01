/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dobrador;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Dobrador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite um numero");
        int numero = scanner.nextInt();
        
        for (int i = 1; i <=5; i++){
            int total = numero * 2;
            System.out.println(total);
        }
    }
}
