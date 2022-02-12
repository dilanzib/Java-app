package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PaymentTest {

    @Test
    void threeExponentThreeShouldEqualTwentySeven(){
        var calculator = new Payment(1000, 0.00625, 60);
        assertEquals(27, calculator.power(3, 3));
    }

    @Test
    void threeExponentZeroShouldEqualOne(){
        var calculator = new Payment(1000, 0.00625, 60);
        assertEquals(1, calculator.power(3, 0));
    }

    @Test
    void monthlyDebtCalculatorTest(){
        double loan = 1000;
        double interest = (7.5/100)/12;
        int years = 5*12;

        var payment = new Payment(loan, interest, years);
        assertEquals(20.037948595623522, payment.m);
    }


}