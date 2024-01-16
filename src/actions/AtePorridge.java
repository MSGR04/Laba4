package actions;
import enuminterfaceses.*;
public class AtePorridge implements DoAction {
    public String doSmth(){
        return "съел кастрюлю каши";
    }
    public String PersonName(){
        return String.valueOf(Who.PONCHIK);
    }
}