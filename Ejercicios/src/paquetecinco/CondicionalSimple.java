/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecinco;
import java.util.Scanner;
import paquetedos.MiMensaje;
/**
 *
 * @author INSPIRON
 */
public class CondicionalSimple {
     public static void main(String[] args) {
         
         Scanner entrada = new Scanner(System.in);
         System.out.printf("Ingrese el valor de su calificación:");
         int calificacion = entrada.nextInt();
         String miMensaje = MiMensaje.mensajeUno;
         
         if (calificacion >= 85){
             System.out.printf("%s con %d puntos\n", miMensaje, calificacion);
         }
         int calificacion_2 = 45;
         
         if (calificacion_2 >=85){
             System.out.printf("%s con %d puntos\n", miMensaje, calificacion_2);
         }
     }
}
