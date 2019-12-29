package com.company;

public class WinGUIFactory implements GUIFactory {
    @Override
    public Button CreateButton() {
        return new WinButton();
    }
}
