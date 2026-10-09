package Abstract;

public class Main {
    public static void main(String[] args) {

        Guitar guitar = new Guitar("Toha");

        guitar.play();

        guitar.tune();

        System.out.println("Running successfully");
    }
}
