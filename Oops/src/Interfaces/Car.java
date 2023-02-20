package Interfaces;

public class Car implements Engine,Brake{

    // at first you will get an error because all the methods as abstract so implement them
    // implement the methods availbale in both Engine and Brake
    @Override
    public void start(){
        System.out.println("I start like a normal car");
    }

    @Override
    public void stop(){
        System.out.println("I stop like a normal car");
    }

    @Override
    public void accelarate(){
        System.out.println("I accelarate like a normal car");
    }

    @Override
    public void brake(){
        System.out.println("I brake like a normal car");
    }
}
