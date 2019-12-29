package com.company;

public class ConcereteHandlerMp4 extends PlayerHandler {

    @Override
    void play(String fileName) {
        String[] uzanti = fileName.split("[.]", 2);
        if (uzanti[1].equals("mp4")) {
            System.out.println("Mp4 oynatılıyor.");
        } else {
            if (super.nextHandler != null) {
                super.nextHandler.play(fileName);
            }
        }
    }
}
