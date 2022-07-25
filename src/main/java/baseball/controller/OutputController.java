package baseball.controller;

import baseball.view.GameView;

public class OutputController {
    GameView gameView = new GameView();

    public void output(int strike, int ball) {
        if (strike == 0 && ball == 0) {
            outputNothing();
        }
        else {
            outputBall(ball);
            outputStrike(strike);
            System.out.println();
        }
    }

    private void outputStrike(int strike) {
        if (strike > 0)
            gameView.showStrikeResult(strike);
    }

    private void outputBall(int ball) {
        if (ball > 0)
            gameView.showBallResult(ball);
    }

    private void outputNothing() {
        gameView.showNothingResult();
    }
}
