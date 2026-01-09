import java.util.Scanner;

class Person {
    int id;
    String name;
    String job;

    public Person(int id, String name, String job) {
        this.id = id;
        this.name = name;
        this.job = job;
    }
}

class BankAccount extends Person {
    long accountNumber;
    long balance;

    public BankAccount(int id, String name, String job, long accountNumber, long balance) {
        super(id, name, job);
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(long amount) {
        this.balance += amount;
    }

    void withDraw(long amount) throws  Exception{
            if (amount > this.balance || amount < 0) {
                System.out.println("\n\n Ibintabwo bikunda ongera.");
                return;
            }
            this.balance -= amount;
    }
void check(long balance){
        System.out.println(this.balance);
}
    long getAccountNumber() {
        return accountNumber;
    }

    void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    long getBalance() {
        return balance;
    }
}



public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        BankAccount account = new BankAccount(1, "Moise", "Dev", 1234567890L, 500);

        System.out.println("\n\n\t\t\t\t+++++++++++ KIM Bank System +++++++++++++++");
        System.out.println("\nWelcome '" + account.name + "', this is KIM Bank.");

        int option;

        do {
            System.out.println("\n \n Murakaza neza Hitamo icyo ushaka gukora: ");
            System.out.println("1. Kubitsa: ");
            System.out.println("2. Kubikuza: ");
            System.out.println("3. Reba ayo usigaranye: ");
            System.out.println("0. Ntanakimwe");

            System.out.print("Shyiramo icyo ushaka: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Shyiramo umubare ushaka kubitsa: ");
                    long depositAmount = scanner.nextLong();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Shyiramo umubare ushaka kubikuza: ");
                    long withdrawAmount = scanner.nextLong();
                    account.withDraw(withdrawAmount);
                    break;
                case 3:
                    System.out.print("Usigaranye :" + account.balance );
                    break;

                case 0:
                    System.out.println("Murakoze gukoresha KIM Bank. Ibihe byiza!");
                    break;

                default:
                    System.out.println("❗ Ibi ntibyemewe, hindura");
            }

        } while (option != 0);

        scanner.close();
    }
}
