/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner ventas = new Scanner(System.in);
        
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        double[][] ventasdias = new double[2][5];
        String [] dias = {"LUNES","MARTES","MIERCOLES","JUEVES","VIERNES"};
        double numero;
        double suma = 0;
        /*for (int fila = 0; fila<vendedores.length ; fila++) {
            for (int col = 0; col<vendedores[fila].length ; col++) {
                
            }*/
        for (int fila = 0; fila < ventasdias.length; fila++) { // 0<2 // 1<2
            for (int col = 0; col < ventasdias[fila].length; col++) {
                System.out.printf("Ingrese la venta de %S del dia %s: ",vendedores[fila],dias[col]);
                numero = ventas.nextDouble();
                
                ventasdias[fila][col] = numero;
                
                suma = suma +  ventasdias[fila][col];
            }
        }
                            
        for (int fila = 0; fila < ventasdias.length; fila++) {
            System.out.printf("Vendedor(a) %s \n", vendedores[fila]);
        }
        
        System.out.printf("Ha realizado un total de %.2f en ventas\n", suma);
        
    }
}
