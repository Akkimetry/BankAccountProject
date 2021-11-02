package com.company;

public class Test {

    public static void main(String[] args) {

        var customer1 = new BankAccount();

        customer1.accountHolder = "xyz";
        customer1.accountNumber = 001;
        customer1.accountType = "Savings account";
        customer1.branchName = "Toronto branch";
        customer1.branchAddress = "Downtown Toronto";
        customer1.balance = 100.00;

        customer1.depositAmount(100);
        System.out.println();

        customer1.withdrawAmount(50);
        System.out.println();

        System.out.println(customer1.checkBalance());
    }

}
