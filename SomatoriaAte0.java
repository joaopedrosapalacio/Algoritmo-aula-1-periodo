/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somatoriaate0;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class SomatoriaAte0 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numero = 1;
        int i = 1;
        int soma = 0;
        
        while (numero != 0) {
            System.out.println("Digite um numero");
            numero = scanner.nextInt();
            soma += numero;
            i++;
        }
        System.out.println(soma);
    }
}
