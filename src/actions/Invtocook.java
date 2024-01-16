package actions;
import enuminterfaceses.*;
public class Invtocook implements DoAction {
    public String doSmth(){
        return "придумал сварить";
    }
    public String PersonName(){
        return String.valueOf(Who.SHPUNTIK);
    }
}