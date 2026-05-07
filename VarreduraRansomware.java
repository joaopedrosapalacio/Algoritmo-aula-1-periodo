/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package varreduraransomware;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class VarreduraRansomware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz [][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };
        int i;
        int j;
        int id;
        
        System.out.println("Digite um id");
        id = scanner.nextInt();
        for (i = 0; i < matriz.length; i++){
            for (j = 0; j < matriz.length; j++){
                if (id == matriz[i][j]){
                    System.out.println("Id encontrado na linha: " + i + " e na coluna: " + j);
                } else {
                    System.out.println("Setor limpo");
                }
            }
        }
    }
    
}
