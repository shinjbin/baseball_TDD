package baseball.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NumberBallsTest {
    private static int LIST_SIZE = 3;

    @Test
    void Balls의크기는LIST_SIZE이다() {
        NumberBalls numberBalls = new NumberBalls(Arrays.asList(new NumberBall(1), new NumberBall(2), new NumberBall(3)));
        assertEquals(LIST_SIZE, numberBalls.getSize());
    }

    @Test
    void Ball끼리는겹치면안된다() {
        assertThrows(IllegalArgumentException.class, () -> new NumberBalls(Arrays.asList(new NumberBall(1), new NumberBall(1), new NumberBall(3))));
    }


}