package ca.prog1400;

public abstract class Person {
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    String firstName;
    String lastName;


    boolean isInvited;


    public Person(String firstName, String lastName, boolean isInvited) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isInvited = isInvited;


    }

    public boolean isInvited() {
        return isInvited;
    }

    public String getFullName(){
        return this.firstName+" "+this.lastName;
    }

    //I want to this impleted subclass.
    //TODO make make maeke
    public abstract void gotoPart();



}
