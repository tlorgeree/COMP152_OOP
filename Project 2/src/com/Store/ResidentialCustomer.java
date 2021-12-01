package com.Store;

import java.util.ArrayList;

public class ResidentialCustomer extends Customer{
    public ResidentialCustomer(String _name) {
        super(_name);
    }

    public double PayForOrder(ArrayList<merchandiseItem> _cart) {
        var _sum = 0.00;
        for (var i=0; i<_cart.size(); i++){
            _sum += _cart.get(i).getPrice();
        }
        return _sum;
    }
}
