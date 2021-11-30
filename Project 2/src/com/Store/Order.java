package com.Store;

import java.util.ArrayList;

public class Order{
    private ArrayList<merchandiseItem> cartForOrder = new ArrayList<merchandiseItem>();
    private ShippingAddress shippingAddress;
    private Customer orderedBy;
    public String getDestination(){
        return shippingAddress.toString();
    }
    public String gerOrder(){
        return orderedBy.getName();
    }
    public Order(ShippingAddress _shipAddress, Customer _customer, ArrayList<merchandiseItem> _cart){
        shippingAddress = _shipAddress;
        orderedBy = _customer;
        for (var i = 0; i< _cart.size(); i++){
            cartForOrder.add(_cart.get(i));
        }
    }
}
