package baseball.model;

import java.util.ArrayList;
import java.util.List;

public class NumberBalls {
    private List<NumberBall> ballList = new ArrayList<>();
    private static final int ballListSize = 3;
    private static final String SIZE_ERROR_MESSAGE = "입력된 볼 개수가 잘못됐습니다";
    private static final String DUPLICATE_ERROR_MESSAGE = "중복된 볼이 있습니다";

    public NumberBalls(List<NumberBall> ballList) {
        validateListSize(ballList);
        validateNoDuplication(ballList);
        this.ballList = ballList;
    }

    public NumberBalls() {}

    public void addNumberBall(NumberBall numberBall) {
        this.ballList.add(numberBall);
    }

    List<NumberBall> getBallList() {
        return ballList;
    }

    public int getSize() { return this.ballList.size(); }

    public int getBallNumber(int index) {
        int result = 0;
        try {
            NumberBall ball = this.ballList.get(index);
            result = ball.getNumber();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    public NumberBall getNumberBall(int index) {
        try {
            NumberBall numberBall = this.ballList.get(index);
            return numberBall;
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return new NumberBall(0);
    }

    public void validateListSize(List<NumberBall> ballList) {
        if (ballList.size() != ballListSize) {
            throw new IllegalArgumentException(SIZE_ERROR_MESSAGE);
        }
    }

    public void validateNoDuplication(List<NumberBall> ballList) {
        if (ballList.size() != ballList.stream().
                map(NumberBall::getNumber).
                distinct().
                count()) {
            throw new IllegalArgumentException(DUPLICATE_ERROR_MESSAGE);
        }
    }

    public boolean contains(NumberBall numberBall) {
        return this.ballList.contains(numberBall);
    }

    public void printMine() {
        for (NumberBall numberBall: this.ballList) {
            System.out.print(numberBall.getNumber());
        }
        System.out.println();
    }
}
