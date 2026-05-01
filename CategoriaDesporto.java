/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.categoriadesporto;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class CategoriaDesporto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual e a sua idade nadador?");
        int idade = scanner.nextInt();
        
        if (idade < 10) {
            System.out.println("Infantil");
        } else if (idade < 15) {
            System.out.println("Juvenil");
        } else if (idade < 18) {
            System.out.println("Junior");
        } else {
            System.out.println("Senior");
        }
    }
}
