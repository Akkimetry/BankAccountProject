package com.company;

public class Test {

    public static void main(String[] args) {

        var customer1 = new BankAccount(001,"xyz","Toronto branch","Downtown Toronto",100.00);


        customer1.depositAmount(100);
        System.out.println();

        customer1.withdrawAmount(250);
        System.out.println();

        System.out.println(customer1.checkBalance());

    }

}
