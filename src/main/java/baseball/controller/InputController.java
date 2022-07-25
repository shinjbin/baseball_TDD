package baseball.controller;

import baseball.view.GameView;
import camp.nextstep.edu.missionutils.Console;

public class InputController {
    String string;
    GameView gameView = new GameView();
    InputController() {}

    public String input() {
        gameView.showInputMessage();
        return Console.readLine();
    }

    public int nextGame() {
        gameView.showEndMessage();
        return Integer.parseInt(Console.readLine());
    }
}
