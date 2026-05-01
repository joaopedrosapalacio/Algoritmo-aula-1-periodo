/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.temperatura;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Temperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual e a temperatura da sua caldeira?");
        int temperatura = scanner.nextInt();
        
        if (temperatura > 35){
            System.out.println("PERIGO:Sobreaquecimento");
        }
        else {
            System.out.println("Temperatura normal");
        }
    }
}
