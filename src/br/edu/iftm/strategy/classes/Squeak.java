package br.edu.iftm.strategy.classes;

import br.edu.iftm.strategy.Interfaces.QuackBehavior;

public class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Squeak");
        
    }
    
}
