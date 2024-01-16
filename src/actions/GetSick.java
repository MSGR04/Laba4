package actions;
import enuminterfaceses.*;
public class GetSick implements DoAction {
    public String doSmth(){
        return "заболел";
    }
    public String PersonName(){
        return String.valueOf(Who.VINTIK);
    }
}