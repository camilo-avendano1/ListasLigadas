/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2logica;

/**
 *
 * @author juanc
 */
public class Nodo {
    
    Boolean sw;
    Object dato;
    Nodo siguienteNodo;
    
    public Nodo(){
        this.sw = false;
        this.dato = null;
        this.siguienteNodo = null;
    }
    
    public Nodo(Object dato, Boolean sw, Nodo siguiente){
        this.sw = sw;
        this.dato = dato;
        this.siguienteNodo = siguiente;
    }

    public Boolean getSw() {
        return sw;
    }

    public void setSw(Boolean sw) {
        this.sw = sw;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getSiguienteNodo() {
        return siguienteNodo;
    }

    public void setSiguienteNodo(Nodo siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }
    
    
    
    
}
