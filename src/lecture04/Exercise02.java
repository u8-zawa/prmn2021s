package lecture04;

public class Exercise02 {

    public static void main(String[] args) {
        ATM atm = new ATM();

        atm.existsAccount("田中太郎", "123456789");
        atm.registerAccount("田中太郎", "123456789");

        if (atm.existsAccount("田中太郎","123456789")) {
            atm.deposit("123456789", 1000);
            atm.withdraw("123456789", 2000);
            atm.withdraw("123456789", 500);
        }
    }
}