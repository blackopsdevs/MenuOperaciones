/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.menudatospersonales.main;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Santiago
 */
public class MenuDatosPersonales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        Scanner cadena = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        double num1, num2, resultado;
        String nombre;

        while (!salir) {
            System.out.println("******************************");
            System.out.println("      Menu de opciones        ");
            System.out.println("******************************");
            System.out.println("*   Selecciona una opcion:   *");
            System.out.println("*   1. Datos personales 1    *");
            System.out.println("*   2. Sumar 2               *");
            System.out.println("*   3. Restar 3              *");
            System.out.println("*   4. Dividir 4             *");
            System.out.println("*   5. Multiplicar 5         *");
            System.out.println("*   6. Salir                 *");
            System.out.println("******************************");
            System.out.println("******************************");
            try {

                System.out.println("Escribe una de las opciones: ");
                opcion = sn.nextInt();
                System.out.println("------------------------------");
                switch (opcion) {
                    case 1:
                        System.out.println("******************************");
                        System.out.println("*** Datos personales ***");
                        System.out.println("Ingresa tu nombre completo: ");
                        nombre = cadena.nextLine();
                        System.out.println("Hola "+nombre+" recuerda seleccionar a opcion 6 para salir.");
                        System.out.println("******************************");
                        break;
                    case 2:
                        System.out.println("******************************");
                        System.out.println("*** Sumar ***");
                        System.out.println("Ingresa numero 1: ");
                        num1 = sn.nextDouble();
                        System.out.println("Ingresa numero 2: ");
                        num2 = sn.nextDouble();
                        resultado = num1 + num2;
                        System.out.println("La suma es: " +resultado);
                        System.out.println("******************************");
                        break;
                    case 3:
                        System.out.println("******************************");
                        System.out.println("*** Restar ***");
                        System.out.println("Ingresa numero 1: ");
                        num1 = sn.nextDouble();
                        System.out.println("Ingresa numero 2: ");
                        num2 = sn.nextDouble();
                        resultado = num1 - num2;
                        System.out.println("La resta es: " +resultado);
                        System.out.println("******************************");
                        break;
                    case 4:
                        System.out.println("******************************");
                        System.out.println("*** Dividir ***");
                        System.out.println("Ingresa numero 1: ");
                        num1 = sn.nextDouble();
                        System.out.println("Ingresa numero 2: ");
                        num2 = sn.nextDouble();
                        resultado = num1 / num2;
                        System.out.println("La division es: " +resultado);
                        System.out.println("******************************");
                        break;
                    case 5:
                        System.out.println("******************************");
                        System.out.println("*** Multiplicar ***");
                        System.out.println("Ingresa numero 1: ");
                        num1 = sn.nextDouble();
                        System.out.println("Ingresa numero 2: ");
                        num2 = sn.nextDouble();
                        resultado = num1 * num2;
                        System.out.println("La multiplicacion es: " +resultado);
                        System.out.println("******************************");
                        break;
                    case 6:
                        System.out.println("Hasta luego!, vuelve pronto.");
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 6");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }
    
}
