/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contagem;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Contagem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero ate onde voce quer quer o computador conte");
        int numero = scanner.nextInt();
        
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
    }
}
