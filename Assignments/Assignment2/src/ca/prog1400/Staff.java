package ca.prog1400;

import java.util.ArrayList;

public class Staff extends Person {
    private static final double DEFAULT_SALARY = 50000;
    private static final double INCREASE_SALARY = 500;
    private int yearOfService;
    private double pay;

    public Staff(String name, String address, int yearOfService) {
        super(name, address);
        this.yearOfService = yearOfService;
        this.pay = DEFAULT_SALARY + (this.yearOfService * INCREASE_SALARY);
    }

    public double getBiWeeklyPay() {
        return this.pay / 26;
    }

    //function for calculation staff salary.
    public static double totalStaffPay(ArrayList<Staff> staffs){
        double result = 0;
        for(Staff staff : staffs){
            result += staff.getBiWeeklyPay();
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("name= %2s, address= %2s, year= %2d, pay= $%.2f",
                getName(),getAddress(), this.yearOfService, this.pay);
    }
}
