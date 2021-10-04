package com.company;
public class BankAccount {
    private double balance;
    private float interestRate;

    public void deposit(double amount) {
        balance += amount;
    }
    public void addInterest(){
        balance *= 1 + interestRate;
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

    //Constructors
    public BankAccount(){
        interestRate = 0.02f;
    }
    public BankAccount(double intialBalance, float initialaRate){
        balance = intialBalance;
        interestRate = initialaRate;
    }
}
