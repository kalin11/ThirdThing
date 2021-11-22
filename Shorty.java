package Shorty;

import Enums.TypesOfPeople;
import Human.*;
import Neznaika.NeznaikasList;

public class Shorty extends Human implements ShortiesPossibilities{
    public Shorty(String num){
        super("Коротыш", TypesOfPeople.SHORTY, true);
        this.name = "Коротыш номер " + num;
    }


    public void FlyToTheMoon() {
        for (Human human : NeznaikasList.checkList){
            if (NeznaikasList.checkList.contains(human)) {
                System.out.println(human.name + " летит на луну");
            } else {
                System.out.println(human.name + " не летит на луну");
            }

        }
    }
}
