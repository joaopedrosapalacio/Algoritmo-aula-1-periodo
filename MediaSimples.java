/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediasimples;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class MediaSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero ");
        int num1 = scanner.nextInt();
        System.out.println("Digite outro numero");
        int num2 = scanner.nextInt();
        double note = 2;
        double media = (num1 + num2)/2;
        System.out.println("Sua media aritmetica e igual: " + media);
    }
}
