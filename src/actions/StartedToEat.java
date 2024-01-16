package actions;
import enuminterfaceses.*;
public class StartedToEat implements DoAction {
    public String doSmth(){
        return "стали обедать";
    }
    public String PersonName(){
        return String.valueOf(Who.KAROTISHKI);
    }
}