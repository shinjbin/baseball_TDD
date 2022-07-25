package baseball.utils;

import baseball.model.NumberBalls;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntegerToNumberballsTest {

    @Test
    public void 클래스의출력은NumberBalls() {
        List<Integer> sample = Arrays.asList(1,2,3);
        Assertions.assertEquals(NumberBalls.class, ListIntegerToNumberballs.
                convert(sample).getClass());
    }
}
