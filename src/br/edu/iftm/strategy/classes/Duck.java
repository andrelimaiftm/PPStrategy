package br.edu.iftm.strategy.classes;

import br.edu.iftm.strategy.Interfaces.FlyBehavior;
import br.edu.iftm.strategy.Interfaces.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){
    }   

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("Todos os patos fluatuam, até os de madeira!");
    }
    
}
