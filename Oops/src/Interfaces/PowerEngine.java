package Interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power enginer start");
    }

    @Override
    public void stop() {
        System.out.println("Power engine stop");
    }

    @Override
    public void accelarate() {
        System.out.println("power engine accelarate");
    }
}
