/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.distribuicaocarga;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class DistribuicaoCarga {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int frete1 = 500;
        int frete2 = 300;

        System.out.println("Sua carga vai para fora do pais?");
        boolean pais = scanner.nextBoolean();
        System.out.println("Quanto pesa a carga? ");
        int carga = scanner.nextInt();
        System.out.println("Quanto custou carga?");
        int custo = scanner.nextInt();
        
        if (pais == false && carga > 50) {
            int preco = custo + frete1;
            System.out.println("Seu preço final e de R$ " + preco);
        } else if (pais == false && carga <= 50) {
            int preco = custo + frete2;
            System.out.println("Seu preço final e de R$ " + preco);
        } else if (pais == true) {
            System.out.println("Sem frente! Seu preço e de R$ " + custo);
        }
    }
}
