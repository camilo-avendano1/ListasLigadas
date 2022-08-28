/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2logica;

/**
 *
 * @author juanc
 */
public class Pila {
    NodoLG[] v;
    int tope, n;
    
    public Pila(int m){
        v = new NodoLG[m];
        n=m;
        tope = 0;
    }
    
 public boolean esVacia(){
     return tope == 0;
 }
 
 public boolean esLlena(){
     return tope == n;
 }
 public void apilar(NodoLG x){
     if (esLlena()){
         System.out.println("pila llena");
         return;
     }
     tope++;
     v[tope] = x;
 }
 
 public NodoLG desapilar(){
     if (esVacia()){
         System.out.println("pila vacia");
         return null;
     }
     NodoLG d = v[tope];
     tope--;
     return d;
 }
}
