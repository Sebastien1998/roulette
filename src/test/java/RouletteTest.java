import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.mockito.Mockito.mock;

class RouletteTest {

    @Rule
    public Timeout globalTimeout = Timeout.seconds(21);

    @RepeatedTest(40)
    public void generateNumTest() {
        Roulette roulette = new Roulette();
        int number = roulette.generateNum();
        System.out.println(number);
        Assertions.assertTrue(number<37&&number>-1);
    }

}