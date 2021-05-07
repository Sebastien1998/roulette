import static java.lang.Thread.sleep;

public class Roulette {

    int number;

    public int generateNum(){
        return number = (int) (Math.random()*37);
    }

    public int getNumber() {
        return number;
    }
}
