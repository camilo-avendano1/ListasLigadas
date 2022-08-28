/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto2logica;

/**
 *
 * @author juanc
 */
public class Proyecto2logica {

    public static void main(String[] args) {
        System.out.println("Hello Worlda!");
        String hilera = "(a,b,c,(d,e,(f,z),k,j),h,i)";
        LSL lista = new LSL();   
        lista.construir(hilera);
        lista.imprimir();
        System.out.println(lista);
    }
}
