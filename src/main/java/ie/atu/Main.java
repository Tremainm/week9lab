package ie.atu;



public class Main {
    public static void main(String[] args) {
        Person myPerson = new Person("paul", "adress", "0861234567");
        System.out.println(myPerson.toString());

        Customer myCustomer = new Customer("paul", "124", "1234", "91475", true);
        System.out.println(myCustomer.toString());

    }
}