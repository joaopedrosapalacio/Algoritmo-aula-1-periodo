/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Me informe sua altura");
        double altura = scanner.nextDouble();
        
        System.out.println("Coloque seu peso");
        double peso = scanner.nextDouble();
        
        double imc = peso / (altura * altura);
        System.out.println("Seu IMC e: " + imc);
        
        if(imc >= 25){
            System.out.println("Voce esta acima do peso");
        } else {
            System.out.println("Seu peso esta normal");
        }
    }
}
