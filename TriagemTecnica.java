/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.triagemtecnica;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class TriagemTecnica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Voce domina alguma liguagem base");
        boolean linguagem = scanner.nextBoolean();
        System.out.println("Quantos anos de experiencia voce tem?");
        int anos = scanner.nextInt();
        
        if (linguagem == true && anos > 5){
            System.out.println("Entrevista");
        } else if (linguagem == true && anos <= 5) {
            System.out.println("Nivel pleno");
        } else {
            System.out.println("Reprovado");
        }
    }
}
