import credit.CreditCalculatorImpl;
import credit.ICreditCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditCalculatorImplTest {

    @Test
    void calculateMonthPayment() {
        double creditAmount = 50000D;
        int creditDurationInMonths = 12;
        double creditPercentage = 8.15D;
        ICreditCalculator credit = new CreditCalculatorImpl(creditAmount, creditDurationInMonths, creditPercentage);
        Assertions.assertDoesNotThrow(credit::calculateMonthPayment);
    }

    @Test
    void calculateOverallCreditAmount() {
        double creditAmount = 50000D;
        int creditDurationInMonths = 12;
        double creditPercentage = 8.15D;
        ICreditCalculator credit = new CreditCalculatorImpl(creditAmount, creditDurationInMonths, creditPercentage);
        Assertions.assertDoesNotThrow(credit::calculateOverallCreditAmount);
    }

    @Test
    void calculateCreditOverpayment() {
        double creditAmount = 50000D;
        int creditDurationInMonths = 12;
        double creditPercentage = 8.15D;
        ICreditCalculator credit = new CreditCalculatorImpl(creditAmount, creditDurationInMonths, creditPercentage);
        Assertions.assertDoesNotThrow(credit::calculateCreditOverpayment);
    }

    @Test
    void amountOverZero(){
        double creditAmount = -50000D;
        int creditDurationInMonths = -12;
        double creditPercentage = -5D;
        ICreditCalculator credit = new CreditCalculatorImpl(creditAmount, creditDurationInMonths, creditPercentage);
        var result = credit.calculateMonthPayment();
        Assertions.assertTrue(result > 0);
    }

}
