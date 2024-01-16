package characters;

import enuminterfaceses.Flyable;

public class PONCHIK extends Characters implements Flyable {
    @Override
    public String Gender() {
        return "Male";
    }
    public void fly(){
        System.out.println(this.Name + " полетел");
    }
    public PONCHIK() {
        super("Пончик");
    }

}
