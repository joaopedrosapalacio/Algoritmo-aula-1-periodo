/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dashboardecommerce;

/**
 *
 * @author Joao Pedro Sapalacio
 */
public class DashboardEcommerce {

    public static void main(String[] args) {
        int vetor[] = {15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        int i;
        int j;
        int n = 15;
        
        for (i = 0; i < n - 1; i++) {
            int min_idx = i;
            
            for (j = i + 1; j < n; j++){
                if (vetor[j] < vetor[min_idx]){
                    min_idx = j;
                }
            }
            if (min_idx != i) {
                int temp = vetor[min_idx];
                vetor[min_idx] = vetor[i];
                vetor[i] = temp;
            }
        }
        for (i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
    }
}
// A variavel "temp" armazena o menor valor do vetor e coloca ele na primeira posicao