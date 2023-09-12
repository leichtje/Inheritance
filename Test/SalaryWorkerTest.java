import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    SalaryWorker sw1,sw2;

    @BeforeEach
    void setUp() {
        sw1 = new SalaryWorker("200005", "Geno", "Smith", "Mr.", 2000, 24.04, 50000);
        sw2 = new SalaryWorker("200006", "Helen", "Keller", "Mrs.", 1973, 28.85, 60000);
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(961.5384615384615, sw1.calculateWeeklyPay(45));
        assertEquals(1153.8461538461538, sw2.calculateWeeklyPay(41));
    }

    @Test
    void displayWeeklyPay() {
        assertEquals("This is a fraction of your annual salary : 1153.85",sw2.displayWeeklyPay(41));
    }

    @Test
    void setAnnualSalary() {
        assertEquals(50000,sw1.getAnnualSalary());
    }
}