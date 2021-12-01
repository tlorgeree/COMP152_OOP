package com.Store;

import java.util.ArrayList;

public class BusinessCustomer extends Customer{
    private double purchaseOrderBalance;
    public BusinessCustomer(String _name) {
        super(_name);
    }

    @Override
    public void PayForOrder(ArrayList<merchandiseItem> _cart) {
        var _name = this.getName();
        System.out.println("This order is for: " + _name + " and will be paid with Purchase.");
    }
}
