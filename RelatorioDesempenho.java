/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.relatoriodesempenho;

/**
 *
 * @author Joao Pedro
 */
public class RelatorioDesempenho {

    public static void main(String[] args) {
        //Aluno João Pedro Sapalácio
        int [][] matriz = {
            {3,4,5},
            {2,7,6},
            {1,9,5},
            {2,6,5},
        };
        int i;
        int j;
        int maior;
        
        for (i = 0; i < matriz.length; i++) {
            maior = matriz[i][0];
            for (j = 1; j < matriz[i].length; j++){
                if (matriz[i][j] > maior){
                    maior = matriz[i][j];
                }
            }
            System.out.println("A maior pontuacao da " + i + " equipe e " + maior);
        }
    }
}
