package exceptions;

import enuminterfaceses.DoAction;

public class IncorrectPerson extends Exception {
    private final String name;
    private final String error1;
    private final String error2;
    private final String action;

    public IncorrectPerson(Object cls, DoAction a) {
        this.name = cls.getClass().getSimpleName().toString();
        this.error1 = "Incorrect person: ";
        this.error2 =  " hasn't action ";
        this.action = a.doSmth();

    }
    @Override
    public String getMessage() {
        return error1 + name + error2 + action;
    }
}