package com.example.arduinoconnection;

public class Utils {

    public static Utils instance;
    private MainActivity mainAct;

    public MainActivity getMainAct() {
        return mainAct;
    }

    public Utils(MainActivity mainAct)
    {
        this.mainAct = mainAct;
    }

    public Utils()
    {
    }

    public static Utils getInstance(MainActivity mainAct)
    {
        if (instance == null)
            instance = new Utils(mainAct);

        return instance;
    }

    public static Utils getInstance()
    {
        if (instance == null)
            instance = new Utils();

        return instance;
    }
}
