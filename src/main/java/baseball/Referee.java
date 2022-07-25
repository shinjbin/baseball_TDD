package baseball;

import baseball.model.Computer;
import baseball.model.NumberBalls;
import baseball.model.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Referee {

    private int strike;
    private int ball;
    private static final int NUMBER_OF_NUMBERBALLS = 3;
    private static final String SIZE_DIFFERENT_ERROR = "두 볼들의 크기가 다릅니다.";

    public void judge(Computer computer, Player player) {
        NumberBalls computerNumberballs = computer.getNumberBalls();
        NumberBalls playerNumberballs = player.getNumberBalls();

        if (computerNumberballs.getSize() != playerNumberballs.getSize()) {
            throw new IllegalArgumentException(SIZE_DIFFERENT_ERROR);
        }
        int size = computerNumberballs.getSize();
        countStrike(computerNumberballs, playerNumberballs, size);
        countBall(computerNumberballs, playerNumberballs, size);
        ball = ball - strike;
    }

    public void countStrike(NumberBalls numberBalls1, NumberBalls numberBalls2, int size) {
        strike = 0;
        IntStream.range(0, size).forEach(i -> {
            if (numberBalls1.getBallNumber(i) == numberBalls2.getBallNumber(i))
                strike++;
        });
    }

    public void countBall(NumberBalls numberBalls1, NumberBalls numberBalls2, int size) {
        ball = 0;

        IntStream.range(0, size).forEach(i -> {
            if (numberBalls2.contains(numberBalls1.getNumberBall(i))) {
                ball++;
            }
        });
    }

    public int getStrike() {
        return strike;
    }
    public int getBall() {
        return ball;
    }

    public boolean gameEnd() {
        return strike == NUMBER_OF_NUMBERBALLS;
    }
}

