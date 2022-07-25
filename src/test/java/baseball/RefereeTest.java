package baseball;

import baseball.model.NumberBall;
import baseball.model.NumberBalls;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RefereeTest {

    @Test
    void 테스트_123과_132_결과는_2볼_1스트라이크() {
        Referee referee = new Referee();
        NumberBalls numberBalls1 = new NumberBalls(Arrays.asList(
                new NumberBall(7), new NumberBall(8), new NumberBall(9)
        ));
        NumberBalls numberBalls2 = new NumberBalls(Arrays.asList(
                new NumberBall(8), new NumberBall(3), new NumberBall(9)
        ));

        referee.countBall(numberBalls1, numberBalls2, 3);
        referee.countStrike(numberBalls1, numberBalls2, 3);
        assertEquals(2, referee.getBall());
        assertEquals(0, referee.getStrike());
    }
}