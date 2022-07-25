package baseball.controller;

import baseball.Referee;
import baseball.model.Computer;
import baseball.model.Player;
import baseball.utils.StringToNumberBalls;
import baseball.view.GameView;

public class GameController {

    private final GameView gameView;
    private Player player;
    private Computer computer;
    private final Referee referee;

    private int nextGame = 0;

    private final InputController inputController;
    private final OutputController outputController;

    public GameController() {
        gameView = new GameView();
        referee = new Referee();
        inputController = new InputController();
        outputController = new OutputController();
    }

    public void init() {
        player = new Player();
        computer = new Computer();
        do {
            String playerInput = inputController.input();
            player.Input(StringToNumberBalls.convert(playerInput));
            referee.judge(computer, player);
            outputController.output(referee.getStrike(), referee.getBall());
        } while(!referee.gameEnd());
        this.nextGame = inputController.nextGame();
        if (this.nextGame == 1) this.init();
    }

}
