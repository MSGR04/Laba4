package characters;

import enuminterfaceses.*;
import exceptions.IncorrectPerson;
import exceptions.NoAction;

import java.util.Objects;

public abstract class Characters {
    protected String Name;
    public Characters(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public String doAction(DoAction a, String whom) throws IncorrectPerson, NoAction {
        if (whom != null) {
            String s = a.doSmth();
            boolean is_person_correct = a.PersonName().toString().equals(getClass().getSimpleName().toString());
            if (is_person_correct){
                return(this.Name + " " + s + " " + whom);
            }
            else{
                throw new IncorrectPerson(this, a);
            }
        }
        NoAction noAction = new NoAction();
        NullPointerException nullPointerException = new NullPointerException("whom is null");
        noAction.initCause(nullPointerException);
        throw noAction;
    }
    //проверка не учитывающая регистра
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Characters characters = (Characters) o;
        return Objects.equals(Name.toLowerCase(), characters.Name.toLowerCase()) && Objects.equals(this.Gender(), characters.Gender());
    }

    public abstract String Gender();

    public String toString() {
        return "Character[" +
                "Name='" + Name + '\'' +
                ']';
    }
    public int hashCode() {
        return Objects.hash(Name);
    }
}
