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
public class Perro extends Animal{

    public Perro(String nombre, String color)
    {
        super(nombre, color);
    }

    @Override
    public void Comer() {
        System.out.println("Perro Comiendo");
    }

    @Override
    public void Sonido() {
        System.out.println("Perro Ladra");
    }
    
}
