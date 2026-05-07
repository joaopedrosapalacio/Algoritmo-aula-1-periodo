/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package termostatodatacenter;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class TermostatoDatacenter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int matriz [][] = new int [3][3];
        int i;
        int j;
        int media;
        int soma = 0;
        
        System.out.println("Coloque a temperatura do datacenter");
        
        for (i = 0; i < matriz.length; i++){
            for (j = 0; j < matriz.length; j++){
                matriz[i][j] = scanner.nextInt();
                soma+= matriz[i][j];
            }
        }
        media = soma / 9;
        System.out.println("A temperatura media do datacenter e: " + media);
    }
    
}
