package com.soham.interfaces12.example;

public class Songs implements Media{
    @Override
    public void start() {
        System.out.println("Play a song");
    }

    @Override
    public void stop() {
        System.out.println("Stop the song");
    }
}
