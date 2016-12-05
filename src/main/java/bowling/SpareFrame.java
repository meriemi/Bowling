package bowling;

/**
 * Created by Mes documents on 05/12/2016.
 */
public class SpareFrame extends Frame {
    /**
     * @param firstLaunch  score of the first launch.
     * @param secondLaunch score of the second launch
     */
    public SpareFrame(Lance firstLaunch, Lance secondLaunch) {
        super(firstLaunch, secondLaunch);
    }

    @Override
    public int getScore() {
        if (!isValid()) {
            return 0;
        }

        return MAX_VALUE + getSecond().getNext().getValue();

    }


    @Override
    public boolean isValid() {
        return (getFirst().isDigit() || getFirst().isZero()) && getSecond().isSpare();
    }
}