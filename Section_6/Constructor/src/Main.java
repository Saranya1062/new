public class Main {

    public static void main(String[] args) {
        Account bobsAccount = new Account();
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

        Account nameAccount = new Account("xxx", "xxx@email.com","12345");
        System.out.println(nameAccount.getNumber() + " name " + nameAccount.getCustomerName());

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("yyy", 25000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("xxx", 100.00, "xxx@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}

