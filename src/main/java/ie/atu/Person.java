package ie.atu;

java.util.Scanner;

public class Person {
    private String name;
    private String address;
    private String number;

    public Person()
    {
        name = "John";
        address = "123 main street";
        number = "0861234567";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
