package Interfaces;

public class CDplayer implements Media{

    @Override
    public void start(){
        System.out.println("Rock music start");
    }

    @Override
    public void stop(){
        System.out.println("stop the music");
    }
}
