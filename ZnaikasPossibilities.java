package Znaika;

import Human.*;

public interface ZnaikasPossibilities {
    public void toRaise(Human h); //поднял
    public void toFlash(Human human); //сверкнув глазами
    public void toSay(); // сказал
    public String toForget(); // забыл или нет
    public String toExecute(); //не станет приводить в исполнение свою угрозу
    public void toMakeUpList(Human h); //составить
    public String didntForgetAnything();
}
