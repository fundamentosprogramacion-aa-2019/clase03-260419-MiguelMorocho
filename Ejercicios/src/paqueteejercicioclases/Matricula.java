/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteejercicioclases;

import java.util.Scanner;

/**
 *
 * @author INSPIRON
 */
public class Matricula {

    public static void main(String[] args) {
        // documentacion
        Scanner entrada = new Scanner(System.in);
        String ciudad;
        String estadocivil;
        int edad;
        double costo_matricula = 1200;
        double descuento = 0;
        double impuesto = 0;
        double costo_final_matricula;
        System.out.println("Ingrese su ciudad de nacimiento: ");
        ciudad = entrada.nextLine();

        System.out.println("Ingrese su estado civil: ");
        estadocivil = entrada.nextLine();

        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();

        if (ciudad.equals("Loja") || ciudad.equals("Zamora")) {
            // descuento
            descuento = descuento + (costo_matricula * 20) / 100;
        }

        if ((edad >= 17) && (edad < 20)) {
            // descuento
            descuento = descuento + (costo_matricula * 10) / 100;
        }

        if (estadocivil.equals("casdo")) {
            // descuento
            descuento = descuento + (costo_matricula * 5) / 100;
        }
        {

        }
        impuesto = (2 * costo_matricula) / 100;
        costo_final_matricula = costo_matricula - descuento;
        System.out.printf("Su matricula es %f: ", costo_final_matricula);
    }
}
