package mx.com.temas.constructors;

public class Main {

    public static void main(String[] args) {
        Account bobsAccount = new Account("123", 0.00, "Bob Brown", "bob@gmail", "(087) 132-1235");

        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);
    }

}
