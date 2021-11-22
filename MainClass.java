import Human.*;
import Neznaika.Neznaika;
import Neznaika.NeznaikasList;
import Shorty.*;
import Znaika.*;
import Enums.*;
import java.util.ArrayList;
import TheFlightDay.*;

import Znaika.listOfPeople.*;


public class MainClass {
    public static void main(String[] args) {
//        Znaika znaika = new Znaika();
//        Neznaika neznaika = new Neznaika();
//        Shorty shorty = new Shorty("1");
//        Shorty shorty2= new Shorty("2");
//        Shorty shorty3 = new Shorty("3");



//        listOfPeople.znaika.toMakeUpList(listOfPeople.znaika);
//
//        listOfPeople.znaika.toFlash();
//
//        listOfPeople.znaika.toSay();
//
//        System.out.println(TheFlightDay.Appointment(listOfPeople.znaika));
//
//        listOfPeople.shorty1.FlyToTheMoon(listOfPeople.shorty1);
//        listOfPeople.shorty2.FlyToTheMoon(listOfPeople.shorty2);
//        listOfPeople.shorty3.FlyToTheMoon(listOfPeople.shorty3);
//        listOfPeople.shorty4.FlyToTheMoon(listOfPeople.shorty4);
//        System.out.println(listOfPeople.shorty4.weightlessness);
        listOfPeople.znaika.toRaise(listOfPeople.znaika);
        listOfPeople.znaika.toFlash(listOfPeople.neznaika);
        listOfPeople.znaika.toSay();
        System.out.println("на самом деле " + listOfPeople.neznaika.wantTo() + CelestialBodies.MOON);
        System.out.println(listOfPeople.neznaika.haveHope() + ", что " + listOfPeople.znaika.name + listOfPeople.znaika.toForget() + " и" + listOfPeople.znaika.toExecute());
        System.out.println("Однако " + listOfPeople.neznaika.name + listOfPeople.neznaika.expect());
        System.out.println(listOfPeople.znaika.name + listOfPeople.znaika.didntForgetAnything());
        TheFlightDay.Appointment();
        listOfPeople.znaika.toMakeUpList(listOfPeople.znaika);
        System.out.println();

        listOfPeople.shorty1.FlyToTheMoon();




    }

}
