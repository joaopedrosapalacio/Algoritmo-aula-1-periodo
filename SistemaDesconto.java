/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemadesconto;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class SistemaDesconto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual e o valor de sua compra? ");
        int compra = scanner.nextInt();
        if (compra > 500){
            double num = 0.20;
            double desconto = compra * num;
            double preco = compra - desconto;
            System.out.println("Seu preco com desconto de 20 porcento e de: " + preco);
        } else if (compra > 200){
            double num = 0.10;
            double desconto = compra * num;
            double preco = compra - desconto;
            System.out.println("Seu preco com desconto de 10 porcento e de: " + preco);
        } else {
            System.out.println("Sua compra nao tem desconto" + compra);
        }
    }
}
