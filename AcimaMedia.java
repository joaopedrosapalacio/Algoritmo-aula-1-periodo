/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.acimamedia;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AcimaMedia {

    public static void main(String[] args) {
        //Aluno João Pedro Sapalácio
        Scanner scanner = new Scanner (System.in);
        double nota[] = new double[5];
        double soma = 0;
        double media;
        int i;
        
        for (i = 0; i < nota.length; i++) {
            System.out.println("Digita a sua nota");
            nota[i] = scanner.nextDouble();
            soma += nota[i];
            
        }
        media = soma / 5;
        System.out.println(media);
        
        for (i = 0; i < nota.length; i++) {
            if (nota[i] >= media){
                System.out.println(nota[i]);
            }
        }
    }
}
