/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buscandopares;

/**
 *
 * @author Aluno
 */
public class BuscandoPares {

    public static void main(String[] args) {
        //Aluno João Pedro Sapalácio
        int[] numero = {1,2,3,4,5,6,7,8,9,10};
        int i;
        
        for (i = 0; i < numero.length;i++) {
            if (numero[i] % 2 == 0) {
                System.out.println(numero[i]);
            }
        }
    }
}
