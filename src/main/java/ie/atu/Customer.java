package ie.atu;

public class Customer extends Person {
    private String customerNum;
    private boolean mailingList;

    public Customer() {
    }

    public Customer(String name, String address, String number, String customerNum, boolean mailingList) {
        super(name, address, number);
        this.customerNum = customerNum;
        this.mailingList = mailingList;
    }

    public String getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(String customerNum) {
        this.customerNum = customerNum;
    }

    public boolean getMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "customerNum='" + customerNum + '\'' +
                ", mailingList=" + mailingList +
                '}';
    }
}
