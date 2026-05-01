/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.problemadejosephus;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class ProblemaDeJosephus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite um numero");
        int numero = scanner.nextInt();
        int i = 1;
        
        while (i * 2 <= numero) {
            i *=2;
            System.out.println(i);
        }
        System.out.println("Unico numero restante e " + i);
    }
}
