/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somatorio;

/**
 *
 * @author Aluno
 */
public class Somatorio {

    public static void main(String[] args) {
        int somaTotal = 0;
        
        for (int i = 1; i <= 10; i++){
            somaTotal += i;
            System.out.println(i);
        }
        System.out.println(somaTotal);
    }
}
