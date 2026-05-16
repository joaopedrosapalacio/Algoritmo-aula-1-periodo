/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sensoresiot;


/**
 *
 * @author Joao Pedro Sapalacio
 */
public class SensoresIoT {

    public static void main(String[] args) {
        int vetor[] = {1,2,3,4,5,6,7};
        int i;
        int n = 7;
        
        for (i = 0; i < n - 1; i++){
            for (int j = 0; j < n - 1; j++){
                if (vetor[j] < vetor[j + 1]){
                int temp = vetor[j];
                vetor[j] = vetor[j + 1];
                vetor[j + 1] = temp;
                }
            }
        }
        for (i = 0; i < vetor.length; i++){
            System.out.print(vetor[i]);
        }
    }
}
//Ele diminui pois os valores maiores estao no final
