package bowling;

public class Lance {
    public static final char ZERO = '_',
            STRIKE = 'X',
            SPARE = '/';

    private char launch;

    private Lance next;

    public Lance(char launch) {
        this.launch = launch;
        next = null;
    }


    public Lance getNext() {
        return next;
    }

    public void setNext(Lance next) {
        this.next = next;
    }


    public boolean isStrike() {
        return launch == STRIKE;
    }

    public boolean isSpare() {
        return launch == SPARE;
    }

    public boolean isZero() {
        return launch == ZERO;
    }

    public boolean isDigit() {
        // A 0 should be stored as ZERO.
        return Character.isDigit(launch) && launch != '0';
    }

    public boolean isValid() {
        return isDigit() || isZero() || isSpare() || isStrike();
    }

    public int getValue() {
        if (isStrike()) {
            return Frame.MAX_VALUE;
        } else if (isSpare()) {
            // might be good to take into account the previous
            // launch, but not necessary.
            return Frame.MAX_VALUE;
        } else if (isDigit()) {
            return Integer.parseInt("" + launch);
        } else {
            return 0;
        }
    }

}
