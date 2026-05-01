/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.monitorestabilidadenumerica;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class MonitorEstabilidadeNumerica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int maior = 0;
        int menor = 0;
        int numero;
        int i = 0;
        boolean primeiro = true;
        
        do {
        System.out.println("Digito um numero inteiro");
        numero = scanner.nextInt();
        
        if (primeiro){
            maior = numero;
            menor = numero;
            primeiro = false;
            
        } else if (numero > maior) {
            maior = numero;
        } else if (numero < maior) {
            menor = numero;
        }
        i++;
        } while ((maior - menor) < 50);
        System.out.println("Amplitude final atingida foi de : " + (maior - menor));
        System.out.println("Numeros necessarios para romper : " + i);
    }
}
