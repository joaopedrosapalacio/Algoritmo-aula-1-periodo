/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ocupacaopatio;

import java.util.Scanner;

/**
 *
 * @author Joao Pedro
 */
public class OcupacaoPatio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int vaga = 0;
        String placa;
        
        do {
            System.out.println("Registre sua placa(Digite FIM para sair)");
            placa = scanner.nextLine();
            
            if (!placa.equals("FIM")) {
                vaga++;
            }
        } while (vaga < 50 && !placa.equals ("FIM"));
        System.out.println("Total de vagas ocupadas e de: " + vaga);
    }
}
