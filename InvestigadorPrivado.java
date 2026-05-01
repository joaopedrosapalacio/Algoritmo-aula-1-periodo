/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.investigadorprivado;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class InvestigadorPrivado {

    public static void main(String[] args) {
        //Aluno João Pedro Sapalácio
        Scanner scanner = new Scanner(System.in);
        String[] nome = {"joao", "pedro", "maria", "ana", "jose"};
        int i;
        String analize;
        
        System.out.println("Digite um nome");
        analize = scanner.nextLine();
        for (i = 0; i < nome.length; i++) {
             if (nome[i].equals(analize)){
                 System.out.println("Encontrado");
             } else {
                 System.out.println("Nao encontrado");
             }
        }
        
    }
}
