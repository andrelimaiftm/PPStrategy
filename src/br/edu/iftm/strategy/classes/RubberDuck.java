package br.edu.iftm.strategy.classes;

public class RubberDuck extends Duck{

    public RubberDuck(){
        this.quackBehavior = new Squeak();
        this.flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("Eu sou um pato de borracha");        
    }
    
}
