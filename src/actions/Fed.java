package actions;
import enuminterfaceses.*;
public class Fed implements DoAction {
    public String doSmth(){
        return "накормили";
    }
    public String PersonName(){
        return String.valueOf(Who.KAROTISHKI);
    }
}