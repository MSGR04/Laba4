package actions;


import enuminterfaceses.*;
public class SnuckIn implements DoAction {
    public String doSmth(){
        return "пробрались в зону весомости";
    }
    public String PersonName(){
        return String.valueOf(Who.KAROTISHKI);
    }
}
