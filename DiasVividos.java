/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diasvividos;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class DiasVividos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos anos voce tem? ");
        int idade = scanner.nextInt();
        
        double dia = 365;
        double diasVividos = idade * dia;
        
        System.out.println("Seus dias vividos sao de: " + diasVividos);
        
    }
}
