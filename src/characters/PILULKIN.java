package characters;

import enuminterfaceses.GoneToTown;

public class PILULKIN extends Characters implements GoneToTown {
    public ForWhat forWhat = new ForWhat();
    public class ForWhat{
        String reason = "";
        public void setReason(String what){this.reason = what;}
        public String getReason(){
            return reason;
        }
    }
    @Override
    public String Gender() {
        return "Male";
    }
    public PILULKIN() {
        super("Пилюлькин");
    }
    @Override
    public String GoToTown(){
        return "Пилюлькин пошёл в город, чтобы" + forWhat.getReason();
    }
}
