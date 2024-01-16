package actions;
import enuminterfaceses.*;
public class GetAttached implements DoAction {
    public String doSmth(){
        return "привязался";
    }
    public String PersonName(){
        return String.valueOf(Who.ZNAIKA);
    }
}