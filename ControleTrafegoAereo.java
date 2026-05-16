/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controletrafegoaereo;

/**
 *
 * @author Joao Pedro Sapalacio
 */
public class ControleTrafegoAereo {

    public static void main(String[] args) {
        int vetor[] = {2,7,5,1,9,3,2,8,1,0};
        int vetor2[] = {3,6,5,1,8,4,2,9,0,5};
        
        int i;
        int j;
        int n = 10;
        
        for (i = 0; i < n - 1; i++){
            for (j = 0; j < n - i - 1; j++){
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    
                    int temp2 = vetor2[j];
                    vetor2[j] = vetor2[j + 1];
                    vetor2[j + 1] = temp2;
                }
            }
        }
        System.out.println("Vetores trocados");
        System.out.println("vetor 1");
        for (i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        } 
        System.out.println ("vetor2");
        for (i = 0; i < vetor.length; i++){
            System.out.print(vetor2[i] + " ");
        }
    }
}
// Ele falha pois ele apaga as informaçoes do primeiro vetor e copia o valor do segundo vetor e coloca no primeiro tendo os dois vetores com os mesmos valores
