/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contagemdecrecentecostumizada;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ContagemDecrecenteCostumizada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Onde a bomba comeca?");
        int bomba = scanner.nextInt();
        
        while (bomba != 0) {
            System.out.println(bomba);
            bomba--;
        }
        System.out.println("KABOOM!");
    }
}
