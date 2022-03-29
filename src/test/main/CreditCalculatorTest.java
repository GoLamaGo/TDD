import credit.ICreditCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditCalculatorTest {

    @Test
    void calculateMonthPayment() {
        double creditAmount = 50000D;
        int creditDurationInMonths = 12;
        double creditPercentage = 8.15D;
        ICreditCalculator credit = null;
        Assertions.assertDoesNotThrow(credit::calculateMonthPayment);
    }

    @Test
    void calculateOverallCreditAmount() {
        double creditAmount = 50000D;
        int creditDurationInMonths = 12;
        double creditPercentage = 8.15D;
        ICreditCalculator credit = null;
        Assertions.assertDoesNotThrow(credit::calculateOverallCreditAmount);
    }

    @Test
    void calculateCreditOverpayment() {
        double creditAmount = 50000D;
        int creditDurationInMonths = 12;
        double creditPercentage = 8.15D;
        ICreditCalculator credit = null;
        Assertions.assertDoesNotThrow(credit::calculateCreditOverpayment);
    }

}
