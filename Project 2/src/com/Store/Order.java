package com.Store;

public class Order{
    private String ShippingAddress;
    private Customer orderedBy;
    public String getDestination(){
        return ShippingAddress;
    }
    public String gerOrder(){
        return orderedBy.getName();
    }
    public Order(String _shipAddress, Customer _customer){
        ShippingAddress = _shipAddress;
        orderedBy = _customer;
    }
}
