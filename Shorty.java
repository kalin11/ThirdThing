package Shorty;

import Enums.TypesOfPeople;
import Human.*;
import Neznaika.NeznaikasList;

public class Shorty extends Human implements ShortiesPossibilities{
    public Shorty(String num){
        super("Коротыш", TypesOfPeople.SHORTY, true);
        this.name = "Коротыш номер " + num;
    }


    public void FlyToTheMoon(Shorty shorty) {
        if (NeznaikasList.checkList.contains(shorty)) {
            System.out.println(shorty.name + " летит на луну");
        } else {
            System.out.println(shorty.name + " не летит на луну");
        }


        }
    }
