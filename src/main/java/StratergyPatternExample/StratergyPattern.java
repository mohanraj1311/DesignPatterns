package StratergyPatternExample;

import StratergyPatternExample.MallardDuck;
import StratergyPatternExample.RubberDuck;

public class StratergyPattern {
    public static void main(String[] args) {
        StratergyPatternExample.MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        StratergyPatternExample.RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();


    }
}
