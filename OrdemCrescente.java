/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordemcrescente;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class OrdemCrescente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Coloque um numero");
        int num1 = scanner.nextInt();
        
        System.out.println("Coloque outro numero");
        int num2 = scanner.nextInt();
        if (num1 > num2){
            System.out.println("Sua ordem e: " + num2 + " e " + num1);
        } else {
            System.out.println("Sua ordem e: " + num1 + " e " + num2);
    }
    }
}
