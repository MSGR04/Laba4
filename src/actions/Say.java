package actions;

import enuminterfaceses.*;
public class Say implements DoAction {
    public String doSmth(){
        return "сказал";
    }
    public String PersonName(){
        return String.valueOf(Who.ZNAIKA);
    }
}