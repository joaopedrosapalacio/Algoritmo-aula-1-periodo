/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.turnoestudo;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class TurnoEstudo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Me informe a hora atual");
        int hora = scanner.nextInt();
        
        if (hora < 12){
            System.out.println("Bom dia!");
        } else if (hora < 18){
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }
    }
}
