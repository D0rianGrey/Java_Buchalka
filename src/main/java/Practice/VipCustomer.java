package Practice;

public class VipCustomer {

    String name;
    float creditLimit;
    String email;

    public VipCustomer() {
        this("Eugene", 1000, "constructor_1@test.ua");
    }


    public VipCustomer(String name, float creditLimit) {
        this(name, creditLimit, "constructor_2@test.ua");
    }

    public VipCustomer(String name, float creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    @Override
    public String toString() {
        return "VipCustomer{" +
                "name='" + name + '\'' +
                ", creditLimit=" + creditLimit +
                ", email='" + email + '\'' +
                '}';
    }
}
