package com.classes;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount emptyAccount = new BankAccount();
        emptyAccount.printCustomerInformation();

        BankAccount madhavsAccount = new BankAccount("ABC-DEF-1234", 1000.00, "Madhav", "mad007@gmail.com", "9876543210");
        madhavsAccount.depositMoney(500);
        madhavsAccount.withdrawMoney(200);
        madhavsAccount.printCustomerInformation();


    }
}
