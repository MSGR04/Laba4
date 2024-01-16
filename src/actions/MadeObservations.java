package actions;
import enuminterfaceses.*;
public class MadeObservations implements DoAction {
    public String doSmth(){
        return "производил наблюдения";
    }
    public String PersonName(){
        return String.valueOf(Who.ZNAIKA);
    }
}