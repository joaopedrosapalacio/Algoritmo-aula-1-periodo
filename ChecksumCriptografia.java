/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package checksumcriptografia;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ChecksumCriptografia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz [][] = new int [4][4];
        int vetor[] = new int[4];
        int i;
        int j;
        
        System.out.println("Coloque os dados para o protocolo de seguranca");
        for (i = 0; i < matriz.length; i++){
            for (j = 0; j < matriz.length; j++){
                matriz[i][j] = scanner.nextInt();
                if (i == 0 && j == 3){
                    vetor[i] = matriz[i][j];
                } else if (i == 1 && j == 2){
                    vetor[i] = matriz[i][j];
                } else if (i == 2 && j == 1){
                    vetor[i] = matriz[i][j];
                } else if (i == 3 && j == 0){
                    vetor[i] = matriz[i][j];
                }
            }
        }
        for (i = 0; i < vetor.length; i++){
            System.out.println(vetor[i] + "\t");
        }
    }
    
}
