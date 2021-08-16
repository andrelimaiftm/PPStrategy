package br.edu.iftm.strategy;

import br.edu.iftm.strategy.classes.DecoyDuck;
import br.edu.iftm.strategy.classes.MallardDuck;
import br.edu.iftm.strategy.classes.RedHeadDuck;
import br.edu.iftm.strategy.classes.RubberDuck;

public class Principal {

    public static void main(String[] args) {

        MallardDuck mallard = new MallardDuck();
        RedHeadDuck red = new RedHeadDuck();
        DecoyDuck decoy = new DecoyDuck();
        RubberDuck patoBorracha = new RubberDuck();

        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        mallard.swim();
        System.out.println();

        red.display();
        red.performQuack();
        red.performFly();
        red.swim();
        System.out.println();

        decoy.display();
        decoy.performQuack();
        decoy.performFly();
        decoy.swim();
        System.out.println();

        patoBorracha.display();
        patoBorracha.performQuack();
        patoBorracha.performFly();
        patoBorracha.swim();

        
    }
    
}
