/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2d;


public class Ejercicio2D {

    public static void main(String[] args) {
        float ingresos =  10000;
        int vehiculos = 2;
        int inmuebles = 0;
        boolean embarcacionAeronaveActSoc = true;
        
        if((ingresos>=489083) || (vehiculos>=3) || (inmuebles>=3) || (embarcacionAeronaveActSoc)){
            System.out.println("La persona pertenece al segmento de ingresos altos");
           
        }else {
         System.out.println("La persona no pertenece al segmento de ingresos altos");

        }
    }
}
