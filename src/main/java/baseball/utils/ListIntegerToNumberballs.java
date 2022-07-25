package baseball.utils;

import baseball.model.NumberBall;
import baseball.model.NumberBalls;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIntegerToNumberballs {

    public static NumberBalls convert(List<Integer> integerList) {
        List<NumberBall> numberBallList = new ArrayList<>();
        for (Integer integer : integerList) {
            numberBallList.add(new NumberBall(integer));
        }

        return new NumberBalls(numberBallList);
    }
}
