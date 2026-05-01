/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetorinvertido;

/**
 *
 * @author Aluno
 */
public class VetorInvertido {

    public static void main(String[] args) {
        //Aluno João Pedro Sapalácio
        int[] numero = {1,2,3,4,5};
        int i;
        
        for (i = numero.length -1; i >= 0; i--) {
            System.out.println(numero[i]);
        }
    }
}
