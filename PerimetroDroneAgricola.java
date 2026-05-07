/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perimetrodroneagricola;

/**
 *
 * @author Aluno
 */
public class PerimetroDroneAgricola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz [][] = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25},
        };
        int i;
        int j;
        int soma = 0;
        
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++){
                if (i == 4 || j == 4 || i == 0 || j == 0){
                    soma += matriz[i][j];
                }
            }
        }
        System.out.println("A soma das bordas e igual: " + soma);
    }
}
