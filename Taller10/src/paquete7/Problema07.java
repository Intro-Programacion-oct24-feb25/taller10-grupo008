/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete7;

/**
 *
 * @author Alejandro
 */
public class Problema07 {
    public static void main(String[] args) {
        double[][] dato1 = {{0, 2, 0},{1, 0, 0}};
        double suma = 0; 
        //
        // double[][] dato1 = {{0, 0, 0},{0, 0, 0}}; //
        /*
            Imprimir si el arreglo es NULO, se considera un arreglo NULO cuando
            la suma de los valores es igual a 0

        */
        
        for (int i = 0; i<dato1.length; i++) {
           for (int j = 0; j<dato1[i].length; j++) {
               suma = suma + dato1[i][j];
           }
        
        }
        
        if (suma == 0){
            System.out.print("El arreglo es NULO. ");
            
        } else {
            System.out.print("El arreglo NO ES NULO. ");
        }
    }
}
