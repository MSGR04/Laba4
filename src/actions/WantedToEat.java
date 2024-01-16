package actions;

import enuminterfaceses.DoAction;
import enuminterfaceses.Who;

public class WantedToEat implements DoAction {
    public String doSmth(){
        return "хотели есть";
    }
    public String PersonName(){
        return String.valueOf(Who.KAROTISHKI);
    }
}
