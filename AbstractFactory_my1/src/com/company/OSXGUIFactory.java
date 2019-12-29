package com.company;

public class OSXGUIFactory implements GUIFactory{

    @Override
    public Button CreateButton() {
        return new OSXButton();
    }
}
