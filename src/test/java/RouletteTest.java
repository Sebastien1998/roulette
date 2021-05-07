import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

class RouletteTest {

    @RepeatedTest(40)
    public void generateNumTest() {
        Roulette roulette = new Roulette();
        int number = roulette.generateNum();
        System.out.println(number);
        Assertions.assertTrue(number<37&&number>-1);
    }

    @Test
    public void spinTest(){

    }
}