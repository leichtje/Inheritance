import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    Worker w1,w2;
    @BeforeEach
    void setUp() {
        w1 = new Worker("000001", "Jonathon", "Leicht", "Mr.", 1999, 22.25);
        w2 = new Worker("000003", "Ricky", "Bobby", "Mr.", 1990, 20.50);
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(1056.875, w1.calculateWeeklyPay(45));
        assertEquals(717.5, w2.calculateWeeklyPay(35));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("Regular Hours: 40.00 Regular Pay: 890.00 Overtime Hours: 5.00 Overtime Pay: 5.00 Total Pay: 928.38",w1.displayWeeklyPay(45));
    }

    @Test
    void setHourlyPayRate() {
        assertEquals(22.25,w1.getHourlyPayRate());
    }
}