/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orientacaolidar;

/**
 *
 * @author Aluno
 */
public class OrientacaoLidar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        int i;
        int j;
        int rotacionada[][] = new int [3][3];
        
        for (i = 0; i < matriz.length; i++){
            for (j = 0; j < matriz.length; j++){
                rotacionada[j][2 - i] = matriz[i][j];
            }
        }
        for (i = 0; i < matriz.length; i++){
            for (j = 0; j < matriz.length; j++){
                System.out.print(rotacionada[i][j] + " ");
            }
            System.out.println();
        }
    }
}
