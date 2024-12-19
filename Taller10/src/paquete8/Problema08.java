
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete8;

/**
 *
 * @author Alejandro
 */
public class Problema08 {

    public static void main(String[] args) {

        double[][] dato1 = {{1, 2, 3}, {6, 8, 9}};
        double[][] dato2 = {{10, 1, 2}, {10, 9, 1}};
        double[][] solucion = new double[2][3];

        for (int i = 0; i < dato1.length; i++) {
            for (int j = 0; j < dato1[i].length; j++) {
                if (dato1[i][j] < dato2[i][j]) {
                    solucion[i][j] = dato1[i][j];
                } else {
                    solucion[i][j] = dato2[i][j];
                }

            }
        }

        for (int i = 0; i < solucion.length; i++) {
            for (int j = 0; j < solucion[i].length; j++) {
                System.out.printf("%.0f\t", solucion[i][j]);
            }
            System.out.print("\n");
        }

    }
}