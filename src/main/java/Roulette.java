import static java.lang.Thread.sleep;

public class Roulette {

    int number;

    public int tournerRoulette(){
        return number = (int) (Math.random()*37);
    }

    public int getNumber() {
        return number;
    }
}
