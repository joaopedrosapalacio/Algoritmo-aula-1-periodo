/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package migracaobancodados;

/**
 *
 * @author Aluno
 */
public class MigracaoBancoDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz [][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };
        int vetor1[] = new int [4];
        int vetor2[] = new int [4];
        int i;
        int j;
        
        for (i = 0; i < matriz.length; i++){
            for (j = 0; j < matriz.length; j++){
                if (j == 0){
                    vetor1[i] = matriz[i][j];
                } else if (j == 3){
                    vetor2[i] = matriz[i][j];
                }
            }
        }
        for (i = 0; i < matriz.length; i++){
            for (j = 0; j < matriz.length; j++){
                if (j == 0){
                    matriz [i][j] = vetor2[i];
                } else if (j == 3){
                    matriz[i][j] = vetor1[i];
                }
            }
        }
        for (i = 0; i < matriz.length; i ++){
            for (j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
