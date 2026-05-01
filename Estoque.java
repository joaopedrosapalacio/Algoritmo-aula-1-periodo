/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estoque;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Estoque {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantidade de produto na loja");
        int quantidade = scanner.nextInt();
        if (quantidade < 5){
            System.out.println("Aviso: necessario repor stock");
        } else {
            System.out.println("estoque adequado");
        }
    }
}
