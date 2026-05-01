/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sequenciagranizo;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class SequenciaGranizo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite um numero");
        int numero = scanner.nextInt();
        int passos = 0;
        
        for (;numero > 1; passos++) {
            if (numero % 2 == 0){
                numero = numero / 2;
            } else {
                numero = numero * 3 + 1;
            }
            System.out.println(numero);
        }
        System.out.println("Numero de passos " + passos);
    }
}
