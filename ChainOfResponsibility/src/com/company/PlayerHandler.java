package com.company;

abstract class PlayerHandler {
    public PlayerHandler nextHandler;

    abstract void play(String fileName);
}
