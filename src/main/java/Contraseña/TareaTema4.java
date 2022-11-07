/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Contraseña;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author eduardo
 */
public class TareaTema4 {

    public static void main(String[] args) {
        //Opción 1 - Pin 4 dígitos;

//        for (int i = 0; i < 10; i++) {
//            String pin = RandomStringUtils.randomNumeric(4);
//            System.out.println(pin);
//        }
//        
//        System.out.println("--------------------");
//        
//         for (int i = 0; i < 10; i++) {
//            String password = RandomStringUtils.randomAlphanumeric(8);
//            System.out.println(password);
//        }
//         
//         System.out.println("---------------------");
//         
//         //Array de caracteres o de tipo char;
//         char[] conjuntoCaracteres = {'a', 'z', 'b', '$', '&', '1'};
//         int numero = 5; 
//         
//         for (int i = 0; i < 10; i++) {
//            String password2 = RandomStringUtils.random(numero, conjuntoCaracteres);
//            System.out.println(password2);
//        }
//    
//         System.out.println("----------------------");
//         
//        Hace una sucesio nde 15 numeros aleatorios del 0 al 9;
//        System.out.println(RandomStringUtils.randomNumeric(15).toUpperCase());  
        //Opción 1, crear numeros pin de teléfono;
        for (int i = 0; i < 3; i++) {
            String pin = RandomStringUtils.randomNumeric(4);
            System.out.println(pin);
        }

        //Opción 2, crea contraseñas con números y letras aleatorias;
        System.out.println("----------------------------");

        for (int i = 0; i < 5; i++) {
            String password = RandomStringUtils.randomAlphanumeric(i);
            System.out.println(password);
        }
    }

}
