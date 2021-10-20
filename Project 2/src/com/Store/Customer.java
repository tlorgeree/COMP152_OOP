package com.Store;

import java.util.ArrayList;

public class Customer{
    private ArrayList<String> Addresses;
    private String Name;
    private int accountID;
    private static int customerID;//global

    public String getName(){
        //Returns the name of the customer
        return Name;
    }
    public void addAddress(String _newAddress) {
        //add new address to address array list
        Addresses.add(_newAddress);
    }

    public Customer(String _name) {
        Name = _name;//add new customer
        accountID = customerID;//with unique ID
        customerID++;
    }
}
