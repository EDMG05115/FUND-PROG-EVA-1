/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_10_inicializacion;

/**
 *
 * @author invitado
 */
public class EVA1_10_INICIALIZACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor = 0; //INICIALIZANDO LA VARIABLE
        System.out.println(valor);
        
        int precio; //declarar
        precio = 100; //inicializar
        
        double salario = 0, precioMayoreo = 100, iva = 10.5, subtotal = 15, total = 100.0; //Tenemos 5 variables, todas, de tipo double

        //CONSTANTES
        //final --> TE PERMITE ASIGNAR UN VALOR SOLO UNA VEZ
        final int conteo;
        conteo = 100;
        System.out.println("conteo");
        //conteo = 2200; *Variable conteo puede que ya halla sido declarada 
        
        final double MI_VALOR_PI = 3.1416; //Las constantes se declaran en mayusculas y con guion bajo
        final String ESCUELA = "Instituto Tecnológico de Chihuahua II";
        final int CALIFA_PASAR = 70;
        
        final                      
                  double              
                DOLOR = 6.66;//Es correcto, pero dificulta la lectura
        
        /*
            Varias líneas de comentarios
            Cuando quieren tirar mucho rollo
            esta es la mejor opción
        */
        
        int x; //COMENTARIO DE UNA SOLA LÍNEA, TODO EN LA LÍNEA ES UN COMENTARIO
        
    }   
}
