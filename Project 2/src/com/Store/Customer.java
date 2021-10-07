package com.Store;

import java.util.ArrayList;

public class Customer{
    private ArrayList<String> Addresses;
    private String Name;
    private static int customerID;

    public String getName(){
        //Do thing
        return Name;
    }
    public void addAddress(String _newAddress){
        Addresses.add(_newAddress);
    }
    public Customer(String _name) {
        Name = _name;
    }
}
