package com.company;

public class ConcereteHandlerMpg extends PlayerHandler {
    @Override
    void play(String fileName) {
        String[] uzanti = fileName.split("[.]", 2);
        if (uzanti[1].equals("mpg")) {
            System.out.println("Mpg oynatılıyor.");
        } else {
            if (super.nextHandler != null) {
                super.nextHandler.play(fileName);
            }
        }
    }
}
