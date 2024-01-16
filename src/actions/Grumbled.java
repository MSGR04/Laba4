package actions;
import enuminterfaceses.*;
public class Grumbled implements DoAction {
    public String doSmth(){
        return "ворчал";
    }
    public String PersonName(){
        return String.valueOf(Who.VORCHUN);
    }
}