package baseball.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberBallTest {
    private final int FROM = 0, TO = 9;

    @Test
    void 십은Ball이가질수없는숫자() {
        assertThrows(IllegalArgumentException.class, () -> new NumberBall(10));
    }
}