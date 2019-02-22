package ca.prog1400;

import java.util.ArrayList;

public class Student extends Person {
    private static final double DEFAULT_FEE = 3000;
    private static final int BONUS = 100;
    private int year;
    private double fee;

    public Student(int year, String name, String address) {
        super(name, address);
        this.year = year;
        this.fee = DEFAULT_FEE + (this.year - 1) * BONUS;
    }

    public double getHalfFee() {
        return this.fee / 2.0;
    }

    public static double totalStudentFee(ArrayList<Student> students) {
        double result = 0;
        for (Student student : students) {
            result += student.getHalfFee();
        }

        return result;
    }


    @Override
    public String toString() {
        return String.format("name= %2s, address= %2s, year= %2d, fee= $%.2f",
                getName(), getAddress(), this.year, this.fee);
    }


}
