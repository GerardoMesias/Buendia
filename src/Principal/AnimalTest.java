/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Clases.Animal;
import Clases.Perro;
import Clases.Vaca;

/**
 *
 * @author Gerardo
 */
public class AnimalTest {
    
    public static void main(String[] args) {
        //POLIMORFISMOS        
        Animal animal;
        
        animal = new Perro("bobi","cafe");
        animal.Comer();
        animal.Sonido();
        
        animal = new Vaca("lili","negro");
        animal.Comer();
        animal.Sonido();
        
        /*
        Perro perro = new Perro("Buldog", "Cafe");
        perro.Comer();
        perro.Sonido();
        
        Vaca vaca = new Vaca("Lila","Blanca");
        vaca.Comer();
        vaca.Sonido();*/
    }
}
