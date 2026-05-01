/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ecopalavras;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class EcoPalavras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite uma palavra");
        String palavra = scanner.nextLine();
        
        for (int i = 1; i <=10; i++){
            System.out.println(palavra);
        }
    }
}
