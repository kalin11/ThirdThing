package Znaika;

import Donut.Donut;
import Human.Human;
import Neznaika.Neznaika;
import Shorty.Shorty;

import java.util.ArrayList;
import Neznaika.*;

public class listOfPeople {
    public static ArrayList<Human> listOfPeople = new ArrayList<>();
    public static Donut donut = new Donut();
    public static Znaika znaika = new Znaika();
    public static Neznaika neznaika = new Neznaika();
    public static Shorty shorty1 = new Shorty("1");
    public static Shorty shorty2= new Shorty("2");
    public static Shorty shorty3 = new Shorty("3");
    public static Shorty shorty4 = new Shorty("4");
    public static void makeList(){
        listOfPeople.add(donut);
        listOfPeople.add(neznaika);
        listOfPeople.add(shorty1);
        listOfPeople.add(shorty2);
        listOfPeople.add(shorty3);
        listOfPeople.add(shorty4);
    }

}
