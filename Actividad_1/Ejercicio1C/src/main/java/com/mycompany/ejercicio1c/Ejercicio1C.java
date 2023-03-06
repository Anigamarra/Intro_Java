/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1c;


public class Ejercicio1C {


    public static void main(String[] args) {
  
        int numeroInicio=0;
        int numeroFin=15;
        int parOImpar=0;//0 para par 1 para impar
        
   while (numeroInicio<=numeroFin){
       if (numeroInicio%2==parOImpar){
           System.out.print(numeroInicio+" ");
                   
       }
       numeroInicio++;
   }
    }
}
 