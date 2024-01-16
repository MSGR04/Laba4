import enuminterfaceses.DoAction;
import exceptions.IncorrectPerson;
import actions.*;
import characters.*;

public class Main {
    public static void main(String[] args) throws IncorrectPerson {
        try {
            KAROTISHKI Karotishki = new KAROTISHKI();
            SHPUNTIK shpuntik = new SHPUNTIK();
            VINTIK vintik = new VINTIK();
            PONCHIK ponchik = new PONCHIK();
            ZNAIKA znaika = new ZNAIKA();
            PILULKIN pilulkin = new PILULKIN();

            //анонимный класс
            Characters LeviuSHPUNTIK = new SHPUNTIK() {
                @Override
                public String Gender(){
                    return ("Female");
                }
            };
            //non-static класс
            class Gorbun extends Characters{
                private final String meat = "котлет";
                private final String garnish = "пюрешкой";
                private Gorbun(){
                    super("Gorbun");
                }
                class Eating{
                    public void eat(){
                        System.out.println("Горбун кушал " + meat + " c " + garnish);
                    }
                }
                @Override
                public String Gender(){
                    return "Male";
                }
            }
            Gorbun gorbun = new Gorbun();
            Gorbun.Eating eating = gorbun.new Eating();
            //static класс
            class Krikun {
                static class InnerClass {
                    public static void gop() {
                        System.out.println("А Крикун кричал на ворчуна.");
                    }
                }
            }
            //локальный класс
            class VORCHUN extends Characters{
                private VORCHUN(){
                    super("Ворчун");
                }
                @Override
                public String Gender(){
                    return "Male";
                }
            }
            final Characters vorchun = new VORCHUN();


            //vorchun
            Grumbled grumbled = new Grumbled();
            //ponchik
            AdaptedToWeightlessness adaptedToWeightlessness = new AdaptedToWeightlessness();
            AtePorridge ate_porridge = new AtePorridge();
            Dangled dangled = new Dangled();

            //Shpuntik
            Invtocook invtocook = new Invtocook();
            //Znaika
            GetAttached getAttached = new GetAttached();
            MadeObservations madeObservations = new MadeObservations();
            Named named = new Named();
            Say say = new Say();

            //Vintik
            NotWorked not_worked = new NotWorked();
            GetSick getSick = new GetSick();

            //Karotishki
            SnuckIn snuckIn = new SnuckIn();
            WantedToEat wantedToEat = new WantedToEat();
            Worked worked = new Worked();
            StartedToBring stb = new StartedToBring();
            Cooking cooking = new Cooking();
            Cooked cooked = new Cooked();
            StartedToEat startedtoeat = new StartedToEat();
            Fed fed = new Fed();



            System.out.println(Karotishki.doAction(stb, "всё, что нужно для приготовления обеда " + shpuntik.getName() + "у"));
            System.out.println(Karotishki.doAction(worked, ""));
            System.out.println(Karotishki.doAction(wantedToEat, ""));
            System.out.println(vintik.doAction(getSick, ""));
            System.out.println(vintik.doAction(not_worked, ""));
            System.out.println(ponchik.doAction(dangled, ""));
            System.out.println(znaika.doAction(say, ", что " + ponchik.getName() + " возможно не приспособился к невесомости"));
            System.out.println(ponchik.doAction(adaptedToWeightlessness, ""));
            System.out.println(ponchik.doAction(ate_porridge, ""));
            System.out.println(Karotishki.doAction(cooking, vintik.getName()+"у"));
            System.out.println(znaika.doAction(getAttached, ""));
            System.out.println(znaika.doAction(madeObservations, ""));
            System.out.println(znaika.doAction(named, ""));
            System.out.println(Karotishki.doAction(snuckIn, ""));
            ponchik.fly();

            pilulkin.forWhat.setReason(" купить лекарства для Винтика");

            System.out.println(pilulkin.GoToTown());
            System.out.println(Karotishki.doAction(cooked, ""));
            System.out.println(Karotishki.doAction(startedtoeat, "тут же, под открытым небом."));
            eating.eat();
            System.out.println(shpuntik.doAction(invtocook, "специальный больничный суп-пюре для " + vintik.getName() + "а"));
            System.out.println(Karotishki.doAction(fed, "больного " + vintik.getName() + "a в состоянии невесомости"));
            System.out.println(vorchun.doAction(grumbled, ""));
            Krikun.InnerClass.gop();

//            System.out.println(shpuntik.doAction(dangled, ""));       //checked
//            System.out.println(ponchik.doAction(adaptedToWeightlessness, null));   //unchecked
            System.out.println(LeviuSHPUNTIK.Gender());
            System.out.println(ponchik.doAction(cooked, ""));
//            System.out.println(Karotishki.doAction(dangled, ""));
//            System.out.println(znaika.Gender());
//            System.out.println(znaika);
        } catch (IncorrectPerson e) {
            System.out.println(e);
        }
    }
}