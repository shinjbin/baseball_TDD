package baseball.model;

import baseball.utils.ListIntegerToNumberballs;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class Computer {
    private final NumberBalls numberBalls;
    private static final int FROM = 1, TO = 9, COUNT = 3;


    public Computer() {
        List<Integer> randomNumbers = Randoms.pickUniqueNumbersInRange(FROM,TO,COUNT);

        ListIntegerToNumberballs util = new ListIntegerToNumberballs(randomNumbers);
        numberBalls = util.result();
    }

    public NumberBalls getNumberBalls() {
        return this.numberBalls;
    }
}
