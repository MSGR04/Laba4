package actions;

import enuminterfaceses.*;
public class Worked implements DoAction {
    public String doSmth(){
        return "работали";
    }
    public String PersonName(){
        return String.valueOf(Who.KAROTISHKI);
    }
}