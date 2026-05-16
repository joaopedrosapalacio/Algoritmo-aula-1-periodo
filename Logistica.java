/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.logistica;

/**
 *
 * @author Joao Pedro Sapalacio
 */
public class Logistica {

    public static void main(String[] args) {
        int vetor[] = {3,9,7,1,2,6,5,8,2};
        int n = 9;
        boolean ordem = true;
        int i = 0;
        
        while (i < n - 1 && ordem){
            ordem = false;
            
            for (int j = 0; j < n - i - 1; j++){
                if (vetor[j] > vetor[j + 1]){
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    
                    ordem = true;
                }
            }
            i++;
        }
        System.out.println("Pacotes ordenados");
        for (i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
    }
}
