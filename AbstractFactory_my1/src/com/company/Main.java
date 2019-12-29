package com.company;

public class Main {

    public static void main(String[] args) {
        ClientAbstractor OSXApp = new ClientAbstractor(new OSXGUIFactory());
        OSXApp.AppButton.MakeSometing();
        ClientAbstractor WinApp = new ClientAbstractor(new WinGUIFactory());
        WinApp.AppButton.MakeSometing();
    }
}
