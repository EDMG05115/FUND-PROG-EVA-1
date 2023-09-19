/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_tipos_datos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_11_TIPOS_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte califa;
        Scanner input = new Scanner(System.in);
        califa = 127;
        //califa = 200;
        //califa = -128;
        //califa = -200;
        //califa = 127 + 1;
        /*System.out.println("Sumar valor: ");
        byte capturota = input.nextByte();
        System.out.println(capturota + califa);
        System.out.println(capturota + califa);
        System.out.println(capturota + califa);*/
        int valor;
        valor = Integer.MAX_VALUE;
        System.out.println(valor + 1);
        valor = Integer.MIN_VALUE;
        System.out.println(valor);
        
        //----
        char caracter = 'A';
        System.out.println(caracter);
        System.out.println(caracter + 0);     
    }
    
}
