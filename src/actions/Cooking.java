package actions;
import enuminterfaceses.*;
public class Cooking implements DoAction{
    public String doSmth(){
        return "готовили";
    }
    public String PersonName(){
        return String.valueOf(Who.KAROTISHKI);
    }
}