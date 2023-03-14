package com.practicajava.poo.ejecicio3;

public class CD extends Reproductores implements MediaPlayer{

    @Override
    public void play() {
        System.out.println("Play in CD");
    }

    @Override
    public void stop() {

    }

}
