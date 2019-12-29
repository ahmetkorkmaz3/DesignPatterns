package com.company;

public class SQLImplementor implements Implementor {
    @Override
    public void Connect(String connectionString) {
        System.out.println("Connected to SQL Server : " + connectionString);
    }

    @Override
    public void Execute(String command) {
        System.out.println("Command executed to SQL Server : " + command);
    }
}
