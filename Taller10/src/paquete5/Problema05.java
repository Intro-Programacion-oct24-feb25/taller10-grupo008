/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {

        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };

        String cadena = "";

        for (int i = 0; i < estudiantes.length; i++) {
            for (int col = 0; col < estudiantes[i].length; col++) {
                String inicial = estudiantes[i][col].substring(0, 1);

                switch (inicial) {
                    case "S":
                    case "P":
                    case "T":
                        cadena = String.format("%s %s -",cadena, estudiantes[i][col]);
                        break;
                }
            }
        }
        
        System.out.printf("%s", cadena);

    }
}
