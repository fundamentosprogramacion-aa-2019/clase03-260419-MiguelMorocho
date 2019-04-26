/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecinco;
import java.util.Scanner;
import paquetedos.MiMensajeDos;

/**
 *
 * @author INSPIRON
 */
public class CondicionalAnidado {
    public static void main(String[] args) {
        // documentacion
        System.out.printf("Ingrese su calificación: ");
        Scanner entrada = new Scanner(System.in);
        int calificacion = entrada.nextInt();
        
        String mensajeUno = MiMensajeDos.mensajeAprobado;
        String MensajeDos = MiMensajeDos.mensajeExcelente;
        String MensajeTres = MiMensajeDos.mensajeBuena;
        String MensajeCuatro = MiMensajeDos.mensajeRegular;
        String MensajeCinco = MiMensajeDos.mensajeReprobado;
        if (calificacion >= 90) {
            System.out.printf("%s %s con %d\n", mensajeUno,
                    MensajeDos, calificacion);
        } else {
            if (calificacion < 90 && calificacion >= 80) {
                System.out.printf("%s %s con %d\n", mensajeUno,
                    MensajeTres, calificacion);
            } else {
                if (calificacion < 80 && calificacion >= 50) {
                    System.out.printf("%s %s con %d\n", mensajeUno,
                    MensajeCuatro, calificacion);

                } else {
                    System.out.printf("%s con %d\n", 
                            MensajeCinco, calificacion);
                }
            }
        }
    }
}
