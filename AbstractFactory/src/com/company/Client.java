package com.company;

public class Client {

    private Factory _factory;

    public Client(Factory _factory) {
        this._factory = _factory;
        _factory.createHdd();
        _factory.createRam();
    }
}
