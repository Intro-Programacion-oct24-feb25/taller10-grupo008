/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] notas = {{9,10,7,8},{10,5,7,9},{7,9.4,10,9}};
        String [] estudiantes = {"Jerry Ponce","Gabriela Lewis","David Bell"};
        double [] promedios = new double [3];
        double suma;
        int col;
        for (int fila = 0; fila < notas.length; fila++) {
            suma = 0;
             for (col = 0; col < notas[fila].length; col++) {
                 suma = suma + notas [fila][col];
             }
             promedios[fila] = suma / col;           
        }
         for (int fila = 0; fila < notas.length; fila++) {
                 System.out.printf("Estudiante: %s tiene un promedio de %.2f\n", estudiantes[fila],promedios[fila]);
             }
        
    }
    
}
