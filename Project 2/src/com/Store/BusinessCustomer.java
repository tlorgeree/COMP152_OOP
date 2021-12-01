package com.Store;

import java.util.ArrayList;

public class BusinessCustomer extends Customer{
    private double purchaseOrderBalance;
    public BusinessCustomer(String _name) {
        super(_name);
    }

    public double PayForOrder(ArrayList<merchandiseItem> _cart) {
        var _name = this.getName();
        var _sum = 0.00;
        System.out.println("This order is for: " + _name + " and will be paid with Purchase.");
        for (var i=0; i<_cart.size(); i++){
            _sum += _cart.get(i).getPrice();
        }
        _sum*=1.05;
        purchaseOrderBalance += _sum;
        return 0;
    }

    public double payOutstandingBalance(){
        if (purchaseOrderBalance > 1000) purchaseOrderBalance *= 0.95;
        var _paid = purchaseOrderBalance;
        purchaseOrderBalance = 0.00;//Reset to 0 before return.

        return _paid;
    }

    public void arrangeDelivery(){
        System.out.println("Dear" + this.getName() + ",\n\n Please note that all" +
                " deliveries must be Mon-Fri from 9-5. Now please stop having your mother call us.");
    }
}
