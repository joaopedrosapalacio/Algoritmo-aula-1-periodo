/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.validadornotas;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ValidadorNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int nota = 1;
        
        do {
            System.out.println("Digite uma nota");
            nota = scanner.nextInt();
        } while (nota < 0 || nota > 10);
            System.out.println("Nota valida");
    }
}
