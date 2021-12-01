package com.Store;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Customer{
    private ArrayList<ShippingAddress> Addresses = new ArrayList<ShippingAddress>();
    private String Name;
    private int accountID;
    private static int customerID;//global

    public Customer(String _name) {
        Name = _name;//add new customer
        accountID = customerID;//with unique ID
        customerID++;
    }
    public String getName(){
        //Returns the name of the customer
        return Name;
    }
    public void addAddress(String _line1,
    String _line2, String _city, String _state, String _zip) {
        ShippingAddress _newAddress = new ShippingAddress(_line1, _line2,_city, _state, _zip);
        Addresses.add(_newAddress);
    }
    public ShippingAddress getAddress(){
        System.out.println("Please select the integer for the correct shipping address:");
        var _max = Addresses.size();
        for(var i = 0; i < _max; i++)
        {
            System.out.println(i + ". " + Addresses.get(i).toString());
        }
        Scanner addsel_menuSelect = new Scanner(System.in);
        String selAddress = addsel_menuSelect.nextLine();
        int _int_selAddress = Integer.parseInt(selAddress);
        return Addresses.get(_int_selAddress);
    }


    public String arrangeDelivery(){
        var output = Name + ". Deliver any Time.";
        return output;
    }

    public double payOutstandingBalance(){
        return 0.0;
    }

    public abstract void PayForOrder(ArrayList<merchandiseItem> _cart);

}
