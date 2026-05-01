/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testecarga;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class TesteCarga {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int codigo;
        int falha = 0;
        
        for (i = 1; i <= 100; i++){
            System.out.println("Coloque o codigo de requisicao");
            codigo = scanner.nextInt();
            
            if (codigo > 95) {
                falha++;
            }
        }
        System.out.println("O total de falhas e de: " + falha);
    }
}
