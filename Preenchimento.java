/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.preenchimento;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Preenchimento {

    public static void main(String[] args) {
        //Aluno João Pedro Sapalácio
        Scanner scanner = new Scanner (System.in);
        int[] numero = new int[5];
        int i;
        
        for (i = 0; i < numero.length; i++) {
            System.out.println("Digite um numero");
            numero[i] = scanner.nextInt();
        }
        for (i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
        }
    }
}
