package Neznaika;

import Enums.DegreeOfSomething;
import Enums.TypesOfPeople;
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

    public void expect(){
        System.out.println("надеялся");
    }

}
