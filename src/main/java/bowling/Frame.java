package bowling;

public abstract class Frame {



        protected static final int MAX_VALUE = 10;


        private Lance first;

        private Lance second;

        public Frame(Lance firstLaunch,Lance secondLaunch) {
            this.first = firstLaunch;
            this.second = secondLaunch;
        }

        public Lance getFirst() {
            return first;
        }

        public Lance getSecond() {
            return second;
        }


        public abstract int getScore();


        public abstract boolean isValid();

    }

