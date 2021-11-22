package Neznaika;

import Enums.DegreeOfSomething;
import Enums.*;
import Human.Human;

public class Neznaika extends Human implements NeznaikaPossibilities {
    public Neznaika(){
        super("Незнайка",TypesOfPeople.GIANT, true);
    }

    public String wantTo(){
        return "ему " + DegreeOfSomething.VERY + " хотелось полететь на ";
    }

    public String haveHope() {
        return "его не оставляла надежда";
    }

    public String expect(){
        return " напрасно надеялся";
    }

}
