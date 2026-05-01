/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaamigos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ListaAmigos {

    public static void main(String[] args) {
        //Aluno João Pedro Sapalácio
        Scanner scanner = new Scanner (System.in);
        String nome[] = new String[5];
        int i;
        System.out.println("Digite um nome para sua lista");
        for (i = 0; i < nome.length; i++) {
            nome[i] = scanner.nextLine();
        } for (i = 0; i < nome.length; i++) {
            System.out.println((i + 1) + "-" + nome[i]);
        }
    }
}
