package baseball.utils;

import baseball.model.NumberBall;
import baseball.model.NumberBalls;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIntegerToNumberballs {
    private final List<Integer> integerList;

    public ListIntegerToNumberballs(List<Integer> integerList) {
        this.integerList = integerList;
    }

    public NumberBalls result() {
        List<NumberBall> numberBallList = new ArrayList<>();
        for (Integer integer : integerList) {
            numberBallList.add(new NumberBall(integer));
        }

        return new NumberBalls(numberBallList);
    }
}
