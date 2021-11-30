package com.Store;

public class Order{
    private ShippingAddress shippingAddress;
    private Customer orderedBy;
    public String getDestination(){
        return shippingAddress.toString();
    }
    public String gerOrder(){
        return orderedBy.getName();
    }
    public Order(ShippingAddress _shipAddress, Customer _customer){
        shippingAddress = _shipAddress;
        orderedBy = _customer;
    }
}
