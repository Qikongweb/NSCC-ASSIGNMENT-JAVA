package ca.prog1400;

public class Staff extends Person {
    private int yearOfService;
    private static final double DEFAULT_SALALY = 50000;
    private static final double INCREASE_SALAY = 500;

    public Staff(String name, String address, int yearOfService) {
        super(name, address);
        this.yearOfService = yearOfService;
    }

    private double getCalculatorFee() {
        return DEFAULT_SALALY + (this.yearOfService * INCREASE_SALAY);
    }

    public double getBiWeeklyFee() {
        return (DEFAULT_SALALY + (this.yearOfService * INCREASE_SALAY)) / 26;
    }

    @Override
    public String toString() {
        return String.format("name= %s, address= %s, year= %d,fee=$%.2f",
                this.name, this.address, this.yearOfService, getCalculatorFee());
    }


}
