/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numerosamigaveis;

/**
 *
 * @author Joao Pedro
 */
public class NumerosAmigaveis {

    public static void main(String[] args) {

        for (int i = 999; i >= 100; i--) {
            int centena = i / 100;
            int dezena = i / 10 % 10;
            int unidade = i % 10;
            int soma = (centena * centena * centena) + (dezena * dezena * dezena) + (unidade * unidade *unidade);
            
            if (soma == i){
                System.out.println(i);
            }
        }
    }
}
