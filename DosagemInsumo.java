/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dosageminsumo;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class DosagemInsumo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual e o volume do tanque?");
        double volume = scanner.nextInt();
        
        double insumo = 250 / 10;
        double valor = insumo * (volume / 1000);
        
        System.out.println("A quantidade necessaria e de: " + valor + " L");
    }
}
