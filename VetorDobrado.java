/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetordobrado;

/**
 *
 * @author Aluno
 */
public class VetorDobrado {

    public static void main(String[] args) {
        //Aluno João Pedro Sapalácio
        int numero1[] = new int [5];
        int[] numero2 = {1,2,3,4,5};
        int i;
        
        for (i = 0; i < numero1.length; i++) {
            numero1[i] = numero2[i] * 2;
        } for (i = 0; i < numero1.length; i++) {
            System.out.println(numero1[i]);
        }
    }
}
