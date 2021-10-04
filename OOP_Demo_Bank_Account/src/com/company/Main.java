package com.company;
public class Main {
    public static void main(String[] args){
        var account =  new BankAccount();
        account.deposit(1000);
        account.addInterest();
        var succeeded = account.withdraw(2000);
        if (succeeded){
            System.out.println("You managed to withdraw");
        }
        else System.out.println("You couldn't withdraw because you only have " +
                account.checkBalance() + " in your account");
    }

}
