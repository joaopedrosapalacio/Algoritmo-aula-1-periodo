/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.valvulapressao;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class ValvulaPressao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Qual e a pressao?");
        int pressao = scanner.nextInt();
        
        if (pressao < 10) {
            System.out.println("Pressao baixa");
        } else if (pressao <= 30) {
            System.out.println("Pressao estavel");
        } else {
            System.out.println("Perigo");
        }
    }
}
