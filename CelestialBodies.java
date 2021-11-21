package Enums;

public enum CelestialBodies {
    MOON("Луна"),
    COMET("Комета"),
    SATELLITE("Спутник"),
    STARS("Звезды");

    private String translation;

    private CelestialBodies(String translation){
        this.translation = translation;
    }

    public String toString(){
        return translation;
    }




}
