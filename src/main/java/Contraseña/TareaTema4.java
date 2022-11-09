/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Contraseña;

import java.util.Scanner;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author eduardo
 */
public class TareaTema4 {

    public static void main(String[] args) {

        String menuPrograma, numPin, contraseña1, contraseña2;

        do {
            menuPrograma = menuPrincipal();
            switch (menuPrograma) {
                case "1" ->
                    numPin = pinAleatorio();
                case "2" ->
                    contraseña1 = contraseñaAleatoria();
                case "3" ->
                    contraseña2 = contraseñaAleatoriaEligiendoDatos();
            }
        } while (!menuPrograma.equalsIgnoreCase("salir"));
    }

    //menu 
    public static String menuPrincipal() {
        String menu = JOptionPane.showInputDialog("""
                                                  1. Pin aleatorio
                                                  2. Contraseña aleatoria
                                                  3. Elegir distancia de la contraseña
                                                         """);
        return menu;
    }

    //Opción 1, crear numeros pin de teléfono;
    public static String pinAleatorio() {
        String pin = "";
        for (int i = 0; i < 1; i++) {
            pin = RandomStringUtils.randomNumeric(4);
            System.out.println("El pin creado es " + pin);
            System.out.println("-------------------");
        }
        return pin;
    }
    //Opción 2, crea contraseñas con números y letras aleatorias;

    public static String contraseñaAleatoria() {
        String password = "";

        for (int i = 0; i < 1; i++) {
            password = RandomStringUtils.randomAlphanumeric(8);
            System.out.println("La contraseña creada es " + password);
            System.out.println("-------------------");
        }
        return password;
    }
    //Opción 3, crear una contraseña con datos elegidos por mi y el usuario tiene que elegir la longitud 

    public static String contraseñaAleatoriaEligiendoDatos() {
        String password2 = "";

        char[] conjuntoCaracteres = {'a', 'z', 'b', '$', '&', '1', 'c', '4', '9', 'D'};

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el numero de caracteres que quiere que tenga tu contraseña: ");

        int numero = teclado.nextInt();

        for (int i = 0; i < 1; i++) {
            password2 = RandomStringUtils.random(numero, conjuntoCaracteres);
            System.out.println("La contraseña avanzada creada es " + password2);
            System.out.println("-------------------");
        }
        return password2;
    }

}
