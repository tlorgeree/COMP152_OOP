package com.Store;

import java.util.ArrayList;
import java.util.Scanner;

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
    public String getAddress(){
        System.out.println("Please select the integer for the correct shipping address:");
        var _max = Addresses.size();
        for(var i = 0; i < _max; i++)
        {
            System.out.println(i + ". " + Addresses.get(i));
        }
        Scanner addsel_menuSelect = new Scanner(System.in);
        String selAddress = addsel_menuSelect.nextLine();
        int _int_selAddress = Integer.parseInt(selAddress);
        return Addresses.get(_int_selAddress);
    }
    public Customer(String _name) {
        Name = _name;//add new customer
        accountID = customerID;//with unique ID
        customerID++;
    }
}
