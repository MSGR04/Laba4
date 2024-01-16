package actions;
import enuminterfaceses.*;
public class Cooked implements DoAction {
    public String doSmth(){
        return "приготовили обед";
    }
    public String PersonName(){
        return String.valueOf(Who.KAROTISHKI);
    }
}