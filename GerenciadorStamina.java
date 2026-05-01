/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenciadorstamina;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class GerenciadorStamina {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Qual e o valor da stamina?");
        int stamina = scanner.nextInt();
        int custo;
        int i = 0;
        
        while (stamina > 0) {
            System.out.println("Qual vai ser o custo para esta acao?");
            custo = scanner.nextInt();
            
            if (custo > stamina) {
                System.out.println("Acao impossivel");
            } else {
                stamina = stamina - custo;
                i++;
            }
        }
    }
}
