import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CounterTest {

    @Test
    void emptyConstructorSetsZero() {
        Counter c = new Counter();
        assertEquals(0, c.getValue());
    }

    @Test
    void constructorSetsZero() {
        Counter c = new Counter(0);
        assertEquals(0, c.getValue());
    }

    @Test
    void constructorSetsMoreThanZero () {
        Counter c = new Counter(1);
        assertEquals(1,c.getValue());
    }

    @Test
    void iAEThrows () {
        assertThrows(IllegalArgumentException.class, () -> {
            new Counter(-1);
        });
    }

    @Test
    void increaseCount() {
        Counter c = new Counter(1);
        assertEquals(2,c.increaseValue());
    }

    @Test
    void increaseCountToMax() {
        Counter c = new Counter(Integer.MAX_VALUE - 1);
        assertEquals(Integer.MAX_VALUE, c.increaseValue());
    }

    @Test
    void increaseCountThrowsOnMaxValue() {
        Counter c = new Counter(Integer.MAX_VALUE);
        assertThrows(IllegalStateException.class, c::increaseValue);
    }

    @Test
    void toStringIsCorrect() {
        Counter c = new Counter(57);
        assertEquals("Value is: " + 57, c.toString());
        assertEquals(58, c.increaseValue());
        assertEquals("Value is: " + 58, c.toString());
    }

}