package Enums;

public enum DegreeOfSomething {
    VERY("очень"),
    SIMPLY("просто"),
    DIDNTHOPEATALL("вообще не");

    private String translation;

    private DegreeOfSomething(String translation){
        this.translation = translation;
    }

    public String toString(){
        return translation;
    }
}
