package com.company;
public class BankAccount {
    private double balance;
    private float interestRate;

    public void deposit(double amount) {
        balance += amount;
    }
    public void addInterest(){
        balance *= interestRate;
    }
    public boolean withdraw(double amount){
        if (amount <= balance)
        {
            balance-=amount;
            return true;
        }
        else return false;
    }
    public double checkBalance()
    {
        return balance;
    }
}
