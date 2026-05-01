/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somatoriavetor;


/**
 *
 * @author Aluno
 */
public class SomatoriaVetor {

    public static void main(String[] args) {
        //Aluno João Pedro Sapalácio
        int numero [] = new int[5];
        numero[0] = 10;
        numero[1] = 20;
        numero[2] = 30;
        numero[3] = 40;
        numero[4] = 50;
        int i;
        int soma = 0;
        
        for (i = 0; i < numero.length; i++){
            soma += numero[i];
        }
        System.out.println(soma);
    }
}
