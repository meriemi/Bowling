package bowling;

public class Lance {



    public static final char ZERO = '_',
            STRIKE = 'X',
            SPARE = '/';

    private char lance;

    private Lance next;

    public Lance(char lance) {
        this.lance = lance;
        next = null;
    }

    public Lance getNext() {
        return next;
    }

    public void setNext(Lance next) {
        this.next = next;
    }


    public boolean isStrike() {
        return lance == STRIKE;
    }

    public boolean isSpare() {
        return lance == SPARE;
    }

    public boolean isZero() {
        return lance == ZERO;
    }

    public boolean isDigit() {
        // A 0 should be stored as ZERO.
        return Character.isDigit(lance) && lance != '0';
    }

    public boolean isValid() {
        return isDigit() || isZero() || isSpare() || isStrike();
    }

    public int getValue() {
        if (isStrike()) {
            return Frame.MAX_VALUE;
        } else if (isSpare()) {

            return Frame.MAX_VALUE;
        } else if (isDigit()) {
            return Integer.parseInt("" + lance);
        } else {
            return 0;
        }
    }

}
