package com.company;

public class BankAccount {

    public BankAccount(int accountNumber,String accountHolder,String branchName,String branchAddress, double balance){

        setBalance(balance);
    }

    String accountHolder;
    String accountType;
    String branchName;
    String branchAddress;
    double balance;

    private int getAccountNumber() {
        return accountNumber;
    }

    private void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {

        if (balance<0){
            throw new IllegalArgumentException("Starting balance cannot be less than 0.");
        }
        this.balance = balance;
    }

    int accountNumber;

    private String getAccountHolder() {
        return accountHolder;
    }

    private void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    private String getAccountType() {
        return accountType;
    }

    private void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    private String getBranchName() {
        return branchName;
    }

    private void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    private String getBranchAddress() {
        return branchAddress;
    }

    private void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }



    public void depositAmount(double amount){
        balance = balance+amount;

        System.out.println("The total deposited amount is $"+amount);
        System.out.println("The updated balance is $"+balance);

    }

    public void withdrawAmount(double amount) {
        balance = balance - amount;
        if (balance > 0) {
            System.out.println("The total amount withdrawn is $" + amount);
            System.out.println("The updated balance is $" + balance);
        } else
            System.out.println("You have insufficient balance. Kindly enter a lower amount for withdrawal.");
    }

    public String checkBalance(){
        double balance = this.balance;

        return "The current balance is $"+ balance;
    }


}
