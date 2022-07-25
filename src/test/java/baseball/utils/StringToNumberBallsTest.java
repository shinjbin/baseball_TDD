package baseball.utils;

import baseball.model.NumberBalls;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToNumberBallsTest {

    @Test
    public void String_123을_NumberBalls로_바꾸기() {
        String string = "123";
        assertEquals(NumberBalls.class, StringToNumberBalls.convert(string).getClass());
    }
}