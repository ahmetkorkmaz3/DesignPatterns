package com.company;

public class ClientAbstractor {
    Button AppButton;

    ClientAbstractor(GUIFactory guiFactory){
        AppButton  = guiFactory.CreateButton();
    }

    public Button getAppButton() {
        return AppButton;
    }
}
