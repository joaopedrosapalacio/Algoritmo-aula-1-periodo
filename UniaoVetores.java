/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uniaovetores;

/**
 *
 * @author Aluno
 */
public class UniaoVetores {

    public static void main(String[] args) {
        //Aluno João Pedro Sapalácio
        int[] vetorA = {1,2,3};
        int[] vetorB = {4,5,6};
        int vetorC[] = new int[6];
        int i;
        
        for (i = 3; i < vetorC.length; i--) {
            vetorC[i] = vetorA[i];
        } for (i = 3; i < vetorC.length; i--) {
            vetorC[i] = vetorB[i];
        } for (i = 0; i < vetorC.length; i++){
            System.out.println(vetorC[i]);
        }    
    }
}
