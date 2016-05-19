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
public class Vaca extends Animal {

    public Vaca(String nombre, String color) {
        super(nombre, color);
    }

    @Override
    public void Comer() {
        System.out.println("Vaca Comiendo");
    }

    @Override
    public void Sonido() {
        System.out.println("Vaca muge");
    }
    
}
