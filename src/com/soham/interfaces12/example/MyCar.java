package com.soham.interfaces12.example;

public class MyCar {
    private Engine engine;
    private Media player = new Songs();

    public MyCar() {
        engine = new PetrolEngine();
    }

    public MyCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

     public void accelerate() {
        engine.acc();
     }

    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        player.start();
    }

    public void stopMusic() {
        player.stop();
    }
}
