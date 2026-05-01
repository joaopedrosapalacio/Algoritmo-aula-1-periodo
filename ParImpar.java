/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parimpar;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ParImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Coloque um numero");
        int numero = scanner.nextInt();
        if (numero % 2 == 0){
            System.out.println("Seu numero e par");
        } else {
            System.out.println("Seu numero e impar");
        }
    }
}
