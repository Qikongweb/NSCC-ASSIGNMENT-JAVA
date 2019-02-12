package ca.prog1400;


import java.util.Map;

public class Student extends Person {
    private int year;
    private static final double DEFAULT_FEE = 3000;
    private static final int [] BONUS = {0,0,100,200,300};

    public Student(int year, String name, String address) {
        super(name, address);
        this.year = year;
    }
    public String toString(){
        return String.format("name= %s, address= %s, year= %d,fee=$%.2f",
                this.name,this.address,this.year,calculator());
    }

    private double calculator(){
        return (this.year * DEFAULT_FEE) / this.year + BONUS[this.year];

    }
}
