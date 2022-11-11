package com.company;

public class BankAccount {

    sdfghjkl

    String accountHolder;
    String accountType;
    String branchName;
    String branchAddress;
    double balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    int accountNumber;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }



    public void depositAmount(double amount){
        balance = balance+amount;

        System.out.println("The total deposited amount is $"+amount);
        System.out.println("The updated balance is $"+balance);

    }

    public void withdrawAmount(double amount){
        balance=balance-amount;

        System.out.println("The total amount withdrawn is $"+amount);
        System.out.println("The updated balance is $"+balance);
    }

    public String checkBalance(){
        double balance = this.balance;

        return "The current balance is $"+ balance;
    }


}
