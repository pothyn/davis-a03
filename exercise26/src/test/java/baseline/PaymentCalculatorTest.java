package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void testConstructor() {
        PaymentCalculator pcApp = new PaymentCalculator(5000, 12, 100);

        assertEquals(5000, pcApp.getBalance());
        assertEquals(12, pcApp.getDailyRate()*365,.0001);
        assertEquals(100, pcApp.getMonthlyPayment());
    }

    @Test
    void testCalculateMonthsUntilPaidOff() {
        PaymentCalculator pcApp = new PaymentCalculator(5000, 12, 100);

        assertEquals(70, pcApp.calculateMonthsUntilPaidOff());
    }

}