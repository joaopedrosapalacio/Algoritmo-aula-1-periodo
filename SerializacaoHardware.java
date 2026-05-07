/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serializacaohardware;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class SerializacaoHardware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };
        int vetor[] = new int[16];
        int i;
        int j;
        
        for (i = 0; i < matriz.length; i++){
            for (j = 0; j < matriz.length; j++){
                vetor[i * 4 + j] = matriz[i][j];
            }
        }
        System.out.println("Coloque novos valores para o vetor");
        for (i = 0; i < vetor.length; i++){
            vetor[i] = 0;
        } for (i = 0; i < vetor.length; i++){
            vetor[i] = scanner.nextInt();
        } for (i = 0; i < matriz.length; i++){
            for (j = 0; j < matriz.length; j++){
                matriz[i][j] = vetor[i * 4 + j];
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
