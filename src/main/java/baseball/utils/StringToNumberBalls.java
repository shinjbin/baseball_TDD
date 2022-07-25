package baseball.utils;

import baseball.model.NumberBall;
import baseball.model.NumberBalls;

import java.util.ArrayList;
import java.util.List;

public class StringToNumberBalls {


    public static NumberBalls convert(String string) {
        List<NumberBall> numberBallList = new ArrayList<>();

        String[] separatedString = string.split("");
        int ballNumber = 0;
        for (String s: separatedString) {
            try {
                ballNumber = Integer.parseInt(s);
            } catch(Exception e) {
                System.out.println("Unable to parse string to int: " + e.getMessage());
            }
            NumberBall numberBall = new NumberBall(ballNumber);
            numberBallList.add(numberBall);
        }

        return new NumberBalls(numberBallList);
    }
}
