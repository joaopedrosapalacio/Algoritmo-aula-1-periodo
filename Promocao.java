/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.promocao;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Promocao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual e o valor da sua compra?");
        int valor = scanner.nextInt();
        if (valor > 200){
            double num = 0.10;
            double desconto = valor * num;
            double precoFinal = valor - desconto;
            System.out.println("Seu valor com desconto e de:" + precoFinal);
        } else {
            System.out.println("preco original");
        }
    }
    
}
