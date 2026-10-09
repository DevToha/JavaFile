package Abstract;

abstract public class Instrument {
    String name;

    Instrument (String name){
        this.name = name;
    }

    abstract void tune();
}
