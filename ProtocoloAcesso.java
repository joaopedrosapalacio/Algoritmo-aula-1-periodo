/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.protocoloacesso;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class ProtocoloAcesso {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Voce possui o cartao? ");
        boolean cartao = scanner.nextBoolean();
        
        System.out.println("Tem a biometria?");
        boolean biometria = scanner.nextBoolean();
        
        System.out.println("E um administrador?");
        boolean adm = scanner.nextBoolean();
        
        if (cartao == true && biometria == true) {
            System.out.println("Acesso a o nivel A");
        } else if (cartao == true || biometria == true && adm == true) {
            System.out.println("Acesso a o nivel B");
        } else {
            System.out.println("Acesso negado");
        }
    }
}
