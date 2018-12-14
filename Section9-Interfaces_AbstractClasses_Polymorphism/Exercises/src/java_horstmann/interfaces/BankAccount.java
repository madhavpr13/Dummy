package java_horstmann.interfaces;

public class BankAccount implements Measurable {

    public double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public double getMeasure() {
        return balance;
    }


}
