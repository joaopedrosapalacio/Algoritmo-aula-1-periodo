/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.validacaodesconto;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class ValidacaoDesconto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quanto que foi a sua compra?");
        double compra = scanner.nextDouble();
        
        System.out.println("Voce e cliente VIP?");
        boolean vip = scanner.nextBoolean();
        
        System.out.println("Seu item esta em liquidacao?");
        boolean liquidacao = scanner.nextBoolean();
        
        if (liquidacao == true) {
            System.out.println("Desconto nao aplicado. Item em liquidacao");
        } else if (compra > 200 || vip == true) {
            System.out.println("Voce ganhou um desconto de 15%");
        } else {
            System.out.println("Desconto nao aplicado");
        }
    }
}
