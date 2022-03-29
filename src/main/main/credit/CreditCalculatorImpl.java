package credit;

public class CreditCalculatorImpl implements ICreditCalculator {

    private double creditAmount;
    private int creditDurationInMonths;
    private double creditPercentage;

    @Override
    public double calculateMonthPayment() {
        double overalAmount = creditAmount;
        for (int i = 0; i < creditDurationInMonths; i++) {
            overalAmount = overalAmount + (overalAmount * (creditPercentage / 100 / 12));
        }
        overalAmount = overalAmount / creditDurationInMonths;
        return overalAmount;
    }

    @Override
    public double calculateOverallCreditAmount() {
        double overalAmount = creditAmount;
        for (int i = 0; i < creditDurationInMonths; i++) {
            overalAmount = overalAmount + (overalAmount * (creditPercentage / 100 / 12));
        }
        return overalAmount;
    }

    @Override
    public double calculateCreditOverpayment() {
        double overalAmount = creditAmount;
        for (int i = 0; i < creditDurationInMonths; i++) {
            overalAmount = overalAmount + (overalAmount * (creditPercentage / 100 / 12));
        }
        overalAmount -= creditAmount;
        return overalAmount;
    }

    public CreditCalculatorImpl(double creditAmount, int creditDurationInMonths, double creditPercentage) {
        this.creditAmount = Math.abs(creditAmount);
        this.creditDurationInMonths = Math.abs(creditDurationInMonths);
        this.creditPercentage = Math.abs(creditPercentage);
    }

    public void setCreditAmount(double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public void setCreditDurationInMonths(int creditDurationInMonths) {
        this.creditDurationInMonths = creditDurationInMonths;
    }

    public void setCreditPercentage(double creditPercentage) {
        this.creditPercentage = creditPercentage;
    }

    public double getCreditAmount() {
        return creditAmount;
    }

    public int getCreditDurationInMonths() {
        return creditDurationInMonths;
    }

    public double getCreditPercentage() {
        return creditPercentage;
    }


}
