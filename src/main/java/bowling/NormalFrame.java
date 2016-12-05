package bowling;

/**
 * Created by Mes documents on 05/12/2016.
 */
public class NormalFrame extends Frame {

    /**
     * @param firstLaunch  score of the first launch.
     * @param secondLaunch score of the second launch
     */
    public NormalFrame(Lance firstLaunch, Lance secondLaunch) {
        super(firstLaunch, secondLaunch);
    }

    @Override
    public int getScore() {

        if (!isValid()) {
            // throw exception ?
            return 0;
        }

        return getFirst().getValue() + getSecond().getValue();

    }


    @Override
    public boolean isValid() {
        // Only Zero and digit char allowed.
        if (!(getFirst().isDigit() || getFirst().isZero()) &&
                (getSecond().isDigit() || getSecond().isZero())
                ) {
            return false;
        }
        // The value of the frame can't be greater or equal to MAX_VALUE
        // A frame with the MAX_VALUE is either a Spare or a Strike
        return !(getFirst().getValue() + getSecond().getValue() >= MAX_VALUE);
    }
}