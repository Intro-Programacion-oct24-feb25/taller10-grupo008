/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {

        String[][] notasCualitativas = new String[3][3];
        double[][] notasCuantitativas = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};
        /*
        Referencia para obtener el valor cualitativo de una nota numérica
        0 - 2.9   Insuficiente
        3 - 4.9   Regular
        5 - 7.9   Buena
        8 - 9.5   Muy Buena
        9.6 - 10  Sobresaliente  
         */
        for (int i = 0; i < notasCuantitativas.length; i++) {
            for (int col = 0; col < notasCuantitativas[i].length; col++) {
                if (notasCuantitativas[i][col] >= 0 && notasCuantitativas[i][col] <= 2.9) {
                    notasCualitativas[i][col] = "Insuficiente";
                } else {
                    if (notasCuantitativas[i][col] >= 3 && notasCuantitativas[i][col] <= 4.9) {
                        notasCualitativas[i][col] = "Regular";
                    } else {
                        if (notasCuantitativas[i][col] >= 5 && notasCuantitativas[i][col] <= 7.9) {
                            notasCualitativas[i][col] = "Buena";
                        } else {
                            if (notasCuantitativas[i][col] >= 8 && notasCuantitativas[i][col] <= 9.5) {
                                notasCualitativas[i][col] = "Muy Buena";
                            } else {
                                if (notasCuantitativas[i][col] >= 9.6 && notasCuantitativas[i][col] <= 10) {
                                    notasCualitativas[i][col] = "Sobresaliente";
                                }
                            }
                        }
                    }
                }

            }
        }
        
        for (int i = 0; i < notasCualitativas.length; i++) {
            for (int col = 0; col < notasCualitativas[i].length; col++) {
                System.out.printf("%.2f es %s\n", notasCuantitativas[i][col],notasCualitativas[i][col]);
            }
        }
        

    }

}

