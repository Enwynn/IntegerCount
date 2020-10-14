public class Counter {
    private int value;
    private static final int MIN_VALUE = 0;


    public Counter () {
        this.value = MIN_VALUE;
    }

    public Counter(int value) {
        if (value < MIN_VALUE) {
            throw new IllegalArgumentException("Value has to be >= 0");
        }
        else
        this.value = value;
    }

    public int increaseValue() {
        if (value >= Integer.MAX_VALUE) {
            throw new IllegalStateException("Value has to be less than that");
        }
        else
         return value = value + 1;
    }


    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Value is: " + value;
    }
}
