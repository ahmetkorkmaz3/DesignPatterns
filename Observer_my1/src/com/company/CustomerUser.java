package com.company;

public class CustomerUser implements IUserObserver {
    private String email;

    CustomerUser(String email){
        this.email = email;
    }

    @Override
    public void TakeNotify(SubjectProduct product) {
        System.out.println( email + " Adresine mail gönderildi.");
    }
}
