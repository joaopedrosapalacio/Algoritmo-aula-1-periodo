/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.antecessorsucessor;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AntecessorSucessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("digite um numero ");
        int numero = scanner.nextInt();
        double antecessor = 1;
        double resultado = numero - antecessor;
        
        System.out.println("digite um numero ");
        int num2 = scanner.nextInt();
        double sucessor = 1;
        double resultado2 = num2 + sucessor;
        
        System.out.println("Seu antecessor e igual: " + resultado + " e seu sucessor e igual: " + resultado2);
        
    }
}
