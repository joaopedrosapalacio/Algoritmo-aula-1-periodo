/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package normalizacaosatelite;

/**
 *
 * @author Aluno
 */
public class NormalizacaoSatelite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz [][] = {
            {20,30,60,70},
            {100,230,255,99},
            {38,23,74,30},
            {45,64,9,200},
            {39,43,80,180},
        };
        int i;
        int j;
        
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] < 50){
                    matriz[i][j] = 0;
                }
            }
        }
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}
