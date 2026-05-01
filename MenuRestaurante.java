/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.menurestaurante;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class MenuRestaurante {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("1- Hamburguer");
        System.out.println("2- Pizza");
        System.out.println("3- Salada");        
        System.out.println("Qual vai ser o seu pedido?");
        int pedido = scanner.nextInt();
        
        if (pedido == 1) {
            System.out.println("Sua escolha foi o hamburguer");
            System.out.println("Seu preco e de R$ 40");
        } else if (pedido == 2) {
            System.out.println("Seu pedido foi a pizza");
            System.out.println("Seu valor e de R$ 50");
        } else if (pedido == 3) {
            System.out.println("Seu pedido foi a salada");
            System.out.println("Seu valor e de R$ 20");
        } else {
            System.out.println("ERRO: informe um numero valido");
        }
    }
}
