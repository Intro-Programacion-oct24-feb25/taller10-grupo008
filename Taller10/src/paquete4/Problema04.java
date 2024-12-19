/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);

        double entrada;
        double[][] datos = new double[2][2];
        int valoresFuera = 0;

        for (int i = 0; i < datos.length; i++) {
            for (int col = 0; col < datos[i].length; col++) {
                System.out.print("Ingrese un número: ");
                entrada = numeros.nextDouble();

                if (entrada > 1000 && entrada < 1199) {
                    datos[i][col] = entrada;
                } else {
                    valoresFuera = valoresFuera + 1;
                    datos[i][col] = 10;
                }

            }

        }
        for (int i = 0; i < datos.length; i++) {
            for (int col = 0; col < datos[i].length; col++) {
                System.out.printf("[%d][%d] = %.2f\n", i,col,datos[i][col]);

            }

        }
        
        System.out.printf("Numero de veces que se ingreso un valor fuera de rango: %d\n", valoresFuera);
    }
}
