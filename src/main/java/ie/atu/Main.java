package ie.atu;



public class Main {
    public static void main(String[] args) {
        Customer part1 = new Customer("paul", "124", "1234", "91475", true);
        System.out.println(part1.toString());

        Customer part2 = new Customer();
        part2.setName("Tremain");
        part2.setAddress("Knockroe");
        part2.setNumber("0861690218");
        part2.setCustomerNum("502846");
        part2.setMailingList(false);
        System.out.println(part2.getName() + " " + part2.getAddress() + " " + part2.getNumber() + " " + part2.getCustomerNum() + " " + part2.getMailingList());

    }
}