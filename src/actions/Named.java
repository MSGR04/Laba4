package actions;
import enuminterfaceses.*;
public class Named implements DoAction {
    public String doSmth(){
        return "назвал это зоной весомости";
    }
    public String PersonName(){
        return String.valueOf(Who.ZNAIKA);
    }
}