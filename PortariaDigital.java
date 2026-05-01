/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.portariadigital;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class PortariaDigital {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Qual e a temperatura?");
        double temp = scanner.nextInt();
        
        System.out.println("Tem a digital (use true ou false)");
        boolean digital = scanner.nextBoolean();
        
        System.out.println("Voce possue o cartao mestre? (use true ou false)");
        boolean cartaoMestre = scanner.nextBoolean();
        
        if ((temp < 37.5 && digital == true) || cartaoMestre == true) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }
    }
}
