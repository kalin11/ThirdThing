package Human;
import Enums.*;

public abstract class Human {
    public String name;
    public TypesOfPeople TypeOfHuman;
    public Eyes eyes;
    public boolean weightlessness;
    public Human(String name, TypesOfPeople Type, boolean weightlessness){
        this.name = name;
        this.weightlessness = weightlessness;
        this.TypeOfHuman = Type;

    }
    public String toString(){
        return "[" + name + "]";
    }

    public static class Eyes {
        public String flashed(){
            return "сверкнул";
        }
    }
}
