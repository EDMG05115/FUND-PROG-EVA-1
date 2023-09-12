/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_area_triangulo;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_8_AREA_TRIANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double base; //double --> tipo de dato para números con parte decimal
        double altura;
        double area;
        Scanner escaner = new Scanner(System.in);
        System.out.println("Ingrese la base del triángulo: ");
        base = escaner.nextInt();
        System.out.println("Ingrese la altura del triángulo: ");
        altura = escaner.nextInt();
        area = (base * altura)/2;
        System.out.println("El área del triángulo es: " + area + " u");
    }
}