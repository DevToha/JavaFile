package Abstract;

public class Guitar extends Instrument implements Playable {


    Guitar(String name) {
        super(name);
    }

    @Override
    void tune() {
        System.out.println("Tuning the " + name + " strings to E-A-D-G-B-E.");
    }

    @Override
    public void play() {
        System.out.println("Playing acoustic melody on the " + name + ".");
    }
}
