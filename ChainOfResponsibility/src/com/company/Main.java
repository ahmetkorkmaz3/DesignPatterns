package com.company;

public class Main {

    public static void main(String[] args) {

        PlayerHandler mp4Player = new ConcereteHandlerMp4();
        PlayerHandler mpgPlayer = new ConcereteHandlerMpg();
        PlayerHandler aviPlayer = new ConcereteHandlerAvi();

        mp4Player.nextHandler = mpgPlayer;
        mpgPlayer.nextHandler = aviPlayer;

        mp4Player.play("video.avi");
    }
}
