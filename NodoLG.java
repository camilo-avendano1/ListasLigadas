/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2logica;

/**
 *
 * @author JoseW
 */
public class NodoLG {
    private int sw;
    private Object dato;
    private NodoLG liga;

    public NodoLG(){
        
    }
    
    public NodoLG(Object dato) {
        this.dato = dato;
        this.sw = 0;
    }

    public int retornaSw() {
        return this.sw;
    }

    public Object retornarDato() {
        return this.dato;
    }

    public NodoLG retornarLiga() {
        return this.liga;
    }

    public void cambiarSw(int sw) {
        this.sw = sw;
    }

    public void cambiarDato(Object dato) {
        this.dato = dato;
    }

    public void cambiarLiga(NodoLG liga) {
        this.liga = liga;
    }

    public void setSw(int sw) {
        this.sw = sw;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public void setLiga(NodoLG liga) {
        this.liga = liga;
    }
    
    
}
