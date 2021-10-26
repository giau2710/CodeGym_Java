package com.codegym;

import Animal.*;

public class Main {

    public static void main(String[] args) {
       Animal a=new Cat();
       a.setName("Cat");
       move(a);
    }

    public static void move(Animal animal) {
        animal.move();

        if (animal instanceof ITerrestrialAnimal)
            ((ITerrestrialAnimal)animal).run();

        if(animal instanceof IMarineAnimal)
            ((IMarineAnimal) animal).swim();

        if(animal instanceof ITerrestrialAnimal && animal instanceof IMarineAnimal){
            ((ITerrestrialAnimal)animal).run();
            ((IMarineAnimal) animal).swim();
        }


    }
}
