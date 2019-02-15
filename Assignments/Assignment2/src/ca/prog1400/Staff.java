package ca.prog1400;

public class Staff extends Person {
    private int yearOfService;
    private static final double DEFAULT_SALALY = 50000;
    private static final double INCREASE_SALAY = 500;

    public Staff(String name, String address, int yearOfService) {
        super(name, address);
        this.yearOfService = yearOfService;
    }

    private double getCalculatorPay() {
        return DEFAULT_SALALY + (this.yearOfService * INCREASE_SALAY);
    }

    public double getBiWeeklyPay() {
        return getCalculatorPay() / 26;
    }

    @Override
    public String toString() {
        return String.format("name= %2s, address= %2s, year= %2d, pay= $%.2f",
                this.name, this.address, this.yearOfService, getCalculatorPay());
    }
}
