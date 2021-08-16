package br.edu.iftm.strategy.classes;

public class RedHeadDuck extends Duck{

    public RedHeadDuck(){
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Eu sou o real pato cabeça vermelha");        
    }


    
}
