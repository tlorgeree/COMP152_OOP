package com.Store;

import java.util.ArrayList;

public class TaxExemptCustomer extends Customer{
    public TaxExemptCustomer(String _name) {
        super(_name);
    }

    public double PayForOrder(ArrayList<merchandiseItem> _cart){
        var _sum = 0.00;
        for (var i=0; i<_cart.size(); i++){
            _sum += _cart.get(i).getPrice();
        }
        return _sum;
    }

    @Override
    public void arrangeDelivery(){
        System.out.println(this.getName() + ",\n\n All deiveries must be 9-5, Mon-Fri.");
    }
}
