/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estadoagua;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class EstadoAgua {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Me informe a temperatura da agua");
        int agua = scanner.nextInt();
        if (agua <= 0) {
            System.out.println("Solido (gelo)");
        } else if (agua >= 100) {
            System.out.println("Gasoso (vapor)");
        } else {
            System.out.println("Liquido");
        }
    }
}
