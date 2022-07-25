package baseball.view;

public class GameView {

    private static final String INPUT_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료\n" +
            "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    private static final String BALL_FORMAT = "%d 볼 ";
    private static final String STRIKE_FORMAT = "%d 스트라이크";
    private static final String NOTHING_FORMAT = "낫싱";

    public void showInputMessage() {
        System.out.print(INPUT_MESSAGE);
    }

    public void showEndMessage() {
        System.out.println(END_MESSAGE);
    }

    public void showBallResult(int ball) {
        System.out.printf(BALL_FORMAT, ball);
    }

    public void showStrikeResult(int strike) {
        System.out.printf(STRIKE_FORMAT, strike);
    }
    public void showNothingResult() {
        System.out.println(NOTHING_FORMAT);
    }
}
