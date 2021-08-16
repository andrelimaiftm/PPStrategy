package br.edu.iftm.strategy.classes;

import br.edu.iftm.strategy.Interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Eu não posso voar");        
    }
    
}
