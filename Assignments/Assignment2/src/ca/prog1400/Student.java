package ca.prog1400;

public class Student extends Person {
    private int year;
    private static final double DEFAULT_FEE = 3000;
    private static final int[] BONUS = {0, 0, 100, 200, 300};

    public Student(int year, String name, String address) {
        super(name, address);
        this.year = year;
    }

    public double getCalculatorFee() {
        return DEFAULT_FEE + BONUS[this.year];

    }

    public double getHalfFee() {
        return (DEFAULT_FEE + BONUS[this.year]) / 2.0;
    }

    @Override
    public String toString() {
        return String.format("name= %s, address= %s, year= %d,fee=$%.2f",
                this.name, this.address, this.year, getCalculatorFee());
    }


}
