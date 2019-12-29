package com.company;

public abstract class DbAbstraction {
    private Implementor implementor;

    DbAbstraction(Implementor implementor){
        this.implementor = implementor;
    }

    void Connect(String connectionString){
        this.implementor.Connect(connectionString);
    }

    void Execute(String command){
        this.implementor.Execute(command);
    }

}
