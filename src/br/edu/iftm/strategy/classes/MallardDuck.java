package br.edu.iftm.strategy.classes;

public class MallardDuck  extends Duck{

    public MallardDuck(){
         this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }
  
    


    @Override
    public void display() {
        System.out.println("Eu sou o verdadeiro pato selvagem");
        
    }
    
}
