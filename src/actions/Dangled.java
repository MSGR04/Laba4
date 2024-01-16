package actions;

import enuminterfaceses.*;
public class Dangled implements DoAction {
    public String doSmth(){
        return "болтался";
    }
    public String PersonName(){
        return String.valueOf(Who.PONCHIK);
    }
}