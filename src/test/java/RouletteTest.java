import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class RouletteTest {

    @RepeatedTest(40)
    public void tournerRouletteTest() {
        Roulette roulette = new Roulette();
        int number = roulette.tournerRoulette();
        System.out.println(number);
        Assertions.assertTrue(number<37&&number>-1);
    }
}