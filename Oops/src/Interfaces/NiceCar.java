package Interfaces;

public class NiceCar {
    private Engine engine;
    private Media player=new CDplayer();

    public NiceCar(){
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void MusicStart(){
        player.start();
    }

    public void MusicStop(){
        player.stop();
    }

    public void Upgradeengine(Engine engine){
        this.engine = engine;
    }
}
