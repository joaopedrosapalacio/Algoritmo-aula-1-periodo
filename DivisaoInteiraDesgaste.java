/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.divisaointeiradesgaste;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class DivisaoInteiraDesgaste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um dividendo");
        int dividendo = scanner.nextInt();
        
        System.out.println("Digite um divisor");
        int divisor = scanner.nextInt();
        
        int i = 0;
        
        while (dividendo >= divisor){
            dividendo = dividendo - divisor;
            i++;
        }
        System.out.println("Seu quociente e igual a " + i);
        System.out.println("Seu resto e igual a " + dividendo);
    }
}
