package StratergyPatternExample;

public class RubberDuck extends Duck {
    public RubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    public void display(){
        System.out.println("Hi , i am a rubber duck");
    }
}
