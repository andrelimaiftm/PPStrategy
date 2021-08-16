package br.edu.iftm.strategy.classes;

import br.edu.iftm.strategy.Interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Estou voando!!!");        
    }
    
}
