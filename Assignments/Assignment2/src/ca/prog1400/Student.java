package ca.prog1400;

public class Student extends Person {
    int year;

    public Student(int year, String name, String address) {
        super(name, address);
        this.year = year;
    }
    public String toString(){
        return "";
    }
}
