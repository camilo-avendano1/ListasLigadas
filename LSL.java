/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2logica;

import java.util.Objects;

/**
 *
 * @author JoseW
 */
public class LSL {
    private NodoLG primero;
    private NodoLG ultimo;

    public LSL() {
        this.primero = null;
        this.ultimo = null;
    }
    
    public void construir(String hilera){
        int tamaño = hilera.length();

        NodoLG x = new NodoLG(null);
        primero = x;
        ultimo = x;
        Pila pila = new Pila(tamaño);
        for (int i=1; i < tamaño; i++){
            //caso ,
            if(String.valueOf(hilera.charAt(i)).equals(",")){
                NodoLG y = new NodoLG();
                ultimo.cambiarLiga(y);
                ultimo = y;
                System.out.println(",");
              //caso (  
            }else if(String.valueOf(hilera.charAt(i)).equals("(")){
                pila.apilar(ultimo);
                NodoLG y = new NodoLG();
                ultimo.cambiarSw(1);
                ultimo.cambiarDato(y);
                ultimo = y;
                System.out.println("(");
            }else if(String.valueOf(hilera.charAt(i)).equals(")")){
                ultimo = pila.desapilar();
                System.out.println(")");
            } else {
                
                ultimo.cambiarDato(hilera.charAt(i));
                System.out.println(hilera.charAt(i));
            }
 
        }
    }

    public NodoLG retonarPrimerNodo() {
        return primero;
    }
    
    public NodoLG retornarUltimoNodo() {
        return ultimo;
    }
    
    public void insertar(NodoLG nodo) {
        if(this.esVacia()) {
            this.primero = nodo;
            this.ultimo = this.primero;
        } else {
            this.ultimo.cambiarLiga(nodo);
            this.ultimo = nodo;
        }
    }
    
    public void eliminarUltimoNodo() {
        NodoLG antUltimo = this.anterior(this.ultimo);
        if(!this.esVacia()){
            if(antUltimo != null) {
                antUltimo.cambiarLiga(null);
            }
            this.ultimo = antUltimo;
        }
    }
    
    public void eliminarNodo(Object dato) {
        NodoLG datoAntEncontrado = null;
        boolean datoEncontrado = this.buscarDato(dato, datoAntEncontrado);
        if(datoEncontrado) {
            if(datoAntEncontrado == null) {
                //datoAntEncontrado.cambiarLiga(this.primero.retornarLiga());
                this.primero = this.ultimo; 
            } else {
                datoAntEncontrado.cambiarLiga(datoAntEncontrado.retornarLiga().retornarLiga());
            }
        }
    }
    
    public void eliminarPrimerNodo() {
        if(!this.esVacia()){
            this.primero = this.primero.retornarLiga();
        }
    }
    
    public boolean buscarDato(Object dato, NodoLG nodoResAnt) {
        NodoLG nodoIndex = this.primero;
        while(!this.finDeRecorrido(nodoIndex)){
            if(nodoIndex.retornarDato().equals(dato)){
                nodoResAnt = this.anterior(nodoIndex);
                return true;
            }
            nodoIndex = nodoIndex.retornarLiga();
        }
        return false;
    }
    
    public NodoLG anterior(NodoLG nodo){
        NodoLG nodoIndex = this.primero;
        NodoLG antIndex = null;
        while(!this.finDeRecorrido(nodoIndex)){
            if(nodoIndex.retornarDato().equals(nodo.retornarDato())) {
                return antIndex;
            }
            antIndex = nodoIndex;
            nodoIndex = nodoIndex.retornarLiga();
        }
        return null;
    }
    
    public boolean esVacia() {
        return primero == ultimo && primero == null;
    }
    
    public boolean finDeRecorrido(NodoLG nodoIndex){
        return nodoIndex == null;
    }
    
    public void imprimir() {
        
        if(this.esVacia()){
            System.out.println("No hay datos que imprimir");
            return;
        }
        
        NodoLG nodoIndex = this.primero;
        while (!this.finDeRecorrido(nodoIndex)) {
            System.out.println("--------------------");
            System.out.println("Dato: " + nodoIndex.retornarDato());
            System.out.println("Liga: " + nodoIndex.retornarLiga());
            System.out.println("--------------------");
            nodoIndex = nodoIndex.retornarLiga();
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.primero);
        hash = 89 * hash + Objects.hashCode(this.ultimo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LSL other = (LSL) obj;
        if (!Objects.equals(this.primero, other.primero)) {
            return false;
        }
        return Objects.equals(this.ultimo, other.ultimo);
    }

    @Override
    public String toString() {
        return "LSL{" + "primero=" + primero + ", ultimo=" + ultimo + '}';
    }
    
    
    
}
