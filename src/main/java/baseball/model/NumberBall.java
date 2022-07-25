package baseball.model;

public class NumberBall {
    private final int number;
    private static final int FROM = 1, TO = 9;
    private static final String RANGE_ERROR_MESSAGE = String.format(
            "숫자는 %d~%d중 선택해야 합니다", FROM, TO);

    public NumberBall(int number) {
        validateNumberRange(number);
        this.number = number;
    }

    int getNumber() {
        return this.number;
    }

    private void validateNumberRange(int number) {
        if (number < FROM || number > TO) {
            throw new IllegalArgumentException(RANGE_ERROR_MESSAGE);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberBall ball = (NumberBall) o;
        return number == ball.number;
    }
}
