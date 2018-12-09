package com.classes;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount madhavsAccount = new BankAccount();

        madhavsAccount.setAccountNumber("001-123-ABC");
        madhavsAccount.setBalance(100);
        madhavsAccount.setCustomerName("Madhav");
        madhavsAccount.setCustomerEmail("m007@gmail.com");
        madhavsAccount.setCustomerPhoneNumber("546345328");

        madhavsAccount.depositMoney(500);
        madhavsAccount.depositMoney(1000);
        madhavsAccount.withdrawMoney(400);
        madhavsAccount.printCustomerInformation();

        madhavsAccount.withdrawMoney(   1200);
        madhavsAccount.printCustomerInformation();

        madhavsAccount.withdrawMoney(100);
        madhavsAccount.printCustomerInformation();

    }
}
