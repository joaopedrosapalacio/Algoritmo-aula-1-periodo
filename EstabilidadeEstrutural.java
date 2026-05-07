/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estabilidadeestrutural;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class EstabilidadeEstrutural {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz[][] = new int [3][3];
        int i;
        int j;
        
        System.out.println("Coloque os valores para a matriz");
        for (i = 0; i < matriz.length; i++){
            for (j = 0; j < matriz.length; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }
        int d1 = matriz[0][0] * matriz[1][1] * matriz[2][2];
        int d2 = matriz[0][1] * matriz[1][2] * matriz[2][0];
        int d3 = matriz[0][2] * matriz[1][0] * matriz[2][1];
        int d4 = matriz[0][2] * matriz[1][1] * matriz[2][0];
        int d5 = matriz[0][0] * matriz[1][2] * matriz[2][1];
        int d6 = matriz[0][1] * matriz[1][0] * matriz[2][2];

        int determinante = (d1 + d2 + d3) - (d4 + d5 + d6);

        if (determinante != 0){
            System.out.println("Esta estavel");
        } else {
            System.out.println("Nao esta estavel");
        }
    }
    
}
