package br.edu.iftm.strategy.classes;

public class DecoyDuck extends Duck{

    public DecoyDuck(){
        setQuackBehavior(new MuteQuack());
        setFlyBehavior(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("Eu sou um pato de madeira");
        
    }
    
}
