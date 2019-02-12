package ca.prog1400;

public class Staff extends Person {
    int yearOfService;
    public Staff( String name, String address ,int yearOfService) {
        super(name, address);
        this.yearOfService = yearOfService;
    }
    public String toString(){
        return "";
    }
}
