package Practice;

public class Launcher {
    public static void main(String[] args) {
        VipCustomer v1 = new VipCustomer();
        System.out.println(v1);

        VipCustomer v2 = new VipCustomer("Marta", 5000);
        System.out.println(v2);

        VipCustomer v3 = new VipCustomer("Anton", 6000, "test3@test.ua");
        System.out.println(v3);
    }
}
