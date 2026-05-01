/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sinalnumerico;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class SinalNumerico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Me informe um numero inteiro");
        int numero = scanner.nextInt();
        
        if (numero > 0){
            System.out.println("Seu numero e positivo");
        } else if (numero < 0){
            System.out.println("Seu numero e negativo");
        } else {
            System.out.println("Seu numero e 0");
        }
    }
}
