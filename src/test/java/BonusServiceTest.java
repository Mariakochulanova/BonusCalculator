import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService bonusService = new BonusService();
        boolean registered = true;
        long amount = 1000_60;
        long expected = 30;
        long actual = bonusService.calculate(amount, registered);
        boolean passed = expected == actual;
        assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateForNotRegisteredAndUnderLimit() {
        BonusService bonusService = new BonusService();
        boolean registered = false;
        long amount = 1000_60;
        long expected = 10;
        long actual = bonusService.calculate(amount, registered);
        boolean passed = expected == actual;
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForRegisteredAndOverLimit () {
        BonusService bonusService = new BonusService();
        boolean registered = true;
        long amount = 2_150_000_00;
        long expected = 500;
        long actual = bonusService.calculate(amount, registered);
        boolean passed = expected == actual;
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForNotRegisteredAndOverLimit () {
        BonusService bonusService = new BonusService();
        boolean registered = false;
        long amount = 5_100_000_00;
        long expected = 500;
        long actual = bonusService.calculate(amount, registered);
        boolean passed = expected == actual;
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForRegisteredAndLowBonus () {
        BonusService bonusService = new BonusService();
        boolean registered = true;
        long amount = 60_00;
        long expected = 1;
        long actual = bonusService.calculate(amount, registered);
        boolean passed = expected == actual;
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForNotRegisteredAndLowBonus () {
        BonusService bonusService = new BonusService();
        boolean registered = false;
        long amount = 100_00;
        long expected = 1;
        long actual = bonusService.calculate(amount, registered);
        boolean passed = expected == actual;
        assertEquals(expected, actual);
    }

}