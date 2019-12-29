package com.company;

public class Main {

    public static void main(String[] args) {
        DbAbstraction dbAbstractionOracle = new DbRefinedAbstraction(new OracleImplementor());
        dbAbstractionOracle.Connect("oracle connection string");
        dbAbstractionOracle.Execute("Select * from Users");
        DbAbstraction dbAbstractionSql = new DbRefinedAbstraction(new SQLImplementor());
        dbAbstractionSql.Connect("SQL connection string");
        dbAbstractionSql.Execute("Select * from Users");
    }
}
