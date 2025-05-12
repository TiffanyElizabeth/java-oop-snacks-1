package snacks;

public class Main {
    public static void main(String[] args) {
        // snack 1
        Studente johnSmith = new Studente("John", "Smith", 23);

        System.out.println(johnSmith.fullNameAge());
        // snack 2
        ContoBancario test = new ContoBancario(989898989898L);
        System.out.println(test.getAccountNumber());
        System.out.println(test.getAccountBalance());
        test.deposit(234.95F);
        System.out.println(test.getAccountBalance());
        test.withdrawal(100.20F);
        System.out.println(test.getAccountBalance());

    }
}
