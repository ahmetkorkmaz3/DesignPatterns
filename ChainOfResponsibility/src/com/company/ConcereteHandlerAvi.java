package com.company;

public class ConcereteHandlerAvi extends PlayerHandler {
    @Override
    void play(String fileName) {
        String[] uzanti = fileName.split("[.]", 2);
        if (uzanti[1].equals("avi")) {
            System.out.println("Avi oynatılıyor.");
        } else {
            if (super.nextHandler != null) {
                super.nextHandler.play(fileName);
            }
        }
    }
}
