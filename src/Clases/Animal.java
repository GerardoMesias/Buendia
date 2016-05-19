/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Gerardo
 */
public abstract class Animal {
    
    private String nombre;
    private String color;

    public Animal(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    
    public abstract void Comer();
    public abstract void Sonido();
    
}
