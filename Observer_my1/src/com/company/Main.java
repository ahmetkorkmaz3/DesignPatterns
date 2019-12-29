package com.company;

public class Main {

    public static void main(String[] args) {
        SubjectProduct tshirtAlevli = new ConcrateSubject("Alevli", 10);
        SubjectProduct tshirtBeyaz = new ConcrateSubject("Beyaz", 20);
        tshirtAlevli.users.add(new CustomerUser("engin@engin.com"));
        tshirtAlevli.users.add(new CustomerUser("ali@engin.com"));
        tshirtAlevli.users.add(new CustomerUser("veli@engin.com"));
        tshirtBeyaz.users.add(new CustomerUser("49@engin.com"));
        tshirtAlevli.users.add(new CustomerUser("50@engin.com"));
        tshirtBeyaz.users.add(new CustomerUser("abz@engin.com"));
        tshirtBeyaz.users.add(new CustomerUser("engin@engin.com"));
        tshirtBeyaz.users.add(new CustomerUser("ali@engin.com"));
        tshirtBeyaz.users.add(new CustomerUser("veli@engin.com"));
        tshirtAlevli.setPrice(5);
        System.out.println("");
        tshirtBeyaz.setPrice(5);
    }
}