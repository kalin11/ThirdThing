package Znaika;

import Donut.Donut;
import Enums.TypesOfPeople;
import Human.Human;

import java.util.ArrayList;
import java.util.Random;
import Human.*;
import Neznaika.*;
import Shorty.Shorty;



public class Znaika extends Human implements ZnaikasPossibilities {
    public Znaika(){
        super("Знайка", TypesOfPeople.GIANT, true);

    }

    public void toRaise(Human h){
        System.out.println(h.name + " поднял прибор с земли");
    }

    public void toFlash(Human human){
        Eyes eyes1 = new Eyes();
        System.out.println("Знайка сердито " + eyes1.flashed() + " глазами на " +human.name);

    }

    public void toSay(){
        String phrase = Phrase.sayPhrase();
        System.out.println("Знайка сказал: " + phrase);
    }

    public void toMakeUpList(Human h){
        System.out.println(h.name + " составил список");
        listOfPeople.makeList();
        Random random = new Random();
        boolean chanche = random.nextBoolean();

        if (chanche){
            NeznaikasList.checkList.add(listOfPeople.shorty1);
            NeznaikasList.checkList.add(listOfPeople.shorty2);
        }
        else {
            NeznaikasList.checkList.add(listOfPeople.shorty3);
            NeznaikasList.checkList.add(listOfPeople.shorty4);
        }

        for (Human human : listOfPeople.listOfPeople){
            if (NeznaikasList.checkList.contains(human)){
                System.out.println(human);
            }
        }

        for (Human human : listOfPeople.listOfPeople){
            if (NeznaikasList.checkList.contains(human)) {
                human.weightlessness = true;
                System.out.print(human.name + " в списке");
                System.out.print(", ");
            }
            else {
                human.weightlessness = false;
                if (human.name == "Незнайка"){
                    System.out.print(human.name + " не в списке, потому что додик, ");
                }
                else {
                    System.out.print(human.name + " не в списке, потому что" + Nevesomost.Perenosimost(human));
                    System.out.print(", ");
                }
            }
        }

    }

    public String toForget(){
//        if (t){
//            System.out.println(" позабудет ");
//        }
//        else{
//            System.out.println(" не позабудет ");
//        }
        return " позабудет";

    }

    public String toExecute(){
//        if (t){
//            System.out.println(" не станет приводить в исполнение свою угрозу ");
//        }
//        else{
//            System.out.println(" станет приводить в исполнение свою угрозу ");
//        }
        return " не станет приводить в исполнение свою угрозу ";
//        если позабудет, то и угрозу воплощать в жизнь не будет
//        иначе - будет
    }
    public String didntForgetAnything(){
        return " ничего не забыл";
    }

}
