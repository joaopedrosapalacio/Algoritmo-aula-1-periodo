/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aprovacaoescolar;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AprovacaoEscolar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Coloque sua nota");
        int nota = scanner.nextInt();
        
        if (nota >= 7.0){
            System.out.println("Aluno aprovado");
        }
        else {
            System.out.println("Aluno reprovado");
        }
    }
}
