package com.company;

public class OracleImplementor implements Implementor {
    @Override
    public void Connect(String connectionString){
        System.out.println("Connected to Oracle Server : " + connectionString);
    }

    @Override
    public void Execute(String command){
        System.out.println("Command executed to Oracle Server : " + command);
    }
}
