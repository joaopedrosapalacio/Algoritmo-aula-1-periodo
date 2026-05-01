/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.relogiobinario;

/**
 *
 * @author Joao Pedro
 */
public class RelogioBinario {

    public static void main(String[] args) {
        for (int i = 23; i >= 0; i--) {
            int digito = i % 10;
            int divisao = i / 10;
            int resultado = digito + divisao;
        for (int j = 59; j >= 0; j--) {
            int digito2 = j % 10;
            int divisao2 = j / 10;
            int resultado2 = digito2 + divisao2;
            
            if (resultado == resultado2) {
                System.out.println(resultado + " " + resultado);
            }
        } 
        }
    }
}
