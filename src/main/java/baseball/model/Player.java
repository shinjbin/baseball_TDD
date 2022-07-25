package baseball.model;

public class Player {
    private NumberBalls numberBalls;

    public void Input(NumberBalls numberBalls) {
        this.numberBalls = numberBalls;
    }

    public NumberBalls getNumberBalls() {
        return this.numberBalls;
    }
}
