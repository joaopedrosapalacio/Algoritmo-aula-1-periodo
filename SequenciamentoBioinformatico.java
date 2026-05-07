/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sequenciamentobioinformatico;

/**
 *
 * @author Aluno
 */
public class SequenciamentoBioinformatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz [][] = {
            {12,13,14},
            {15,16,17},
            {18,19,20},
        };
        int i;
        int j;
        
        for (i = 0; i < matriz.length; i++){
            for (j = 0; j < matriz.length; j++){
                if (matriz[i][j] == matriz[j][i]){
                    System.out.println("simetricas");
                } else {
                    System.out.println("nao e simetrica");
                }
            }
        }
    }
    
}
