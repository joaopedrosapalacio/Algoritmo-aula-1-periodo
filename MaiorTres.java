/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maiortres;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class MaiorTres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num1 = scanner.nextInt();
        System.out.println("Digite um numero diferente");
        int num2 = scanner.nextInt();
        System.out.println("Digite um numero diferente novamente");
        int num3 = scanner.nextInt();
        int maior;
        if (num1 > num2 == num1 > num3){
            maior = num1;
        } else if (num2 > num3){
            maior = num2;
        } else {
            maior = num3;
        }
        System.out.println("Seu numero maior e " + maior);
    }
}
