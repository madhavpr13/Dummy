package com.classes;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    // getters and setters

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    // deposit and withdrawal
    public void depositMoney(double amount) {
        this.balance += amount;
    }

    public void withdrawMoney(double amount) {
        if(this.balance - amount < 0) {
            System.out.println("Insufficient funds. Cannot withdraw");

        } else {
            this.balance -= amount;
        }
    }

    public void printCustomerInformation(){
        System.out.println("Account number: " + getAccountNumber());
        System.out.println("Current balance: " + getBalance());
        System.out.println("Customer name: " + getCustomerName());
        System.out.println("Customer phone number: " + getCustomerPhoneNumber());
        System.out.println("Customer email address: " + getCustomerEmail());
        System.out.println();
    }


}
