package actions;

import enuminterfaceses.*;
public class NotWorked implements DoAction {
    public String doSmth(){
        return "не работал";
    }
    public String PersonName(){
        return String.valueOf(Who.VINTIK);
    }
}