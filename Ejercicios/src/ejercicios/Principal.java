/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import paquetetres.Demo;
import paquetecuatro.DemoDos;
/**
 *
 * @author INSPIRON
 */
public class Principal {
    public static void main(String[] args) {
        int suma = Demo.valor + DemoDos.ValorDos;
        int multiplicacion = Demo.valor * DemoDos.ValorDos;
        
        System.out.printf("%d\n", suma);
         System.out.printf("%d\n", multiplicacion);
    }
}
