package actions;

import enuminterfaceses.*;
public class StartedToBring implements DoAction {
    public String doSmth(){
        return "принялись таскать";
    }
    public String PersonName(){
        return String.valueOf(Who.KAROTISHKI);
    }
}