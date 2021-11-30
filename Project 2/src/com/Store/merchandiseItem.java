package com.Store;

public class merchandiseItem {
    private ItemType taxibleType;
    private String Name;
    private double Price;

    public merchandiseItem(String _name, double _price, ItemType _type){
        Name = _name;
        Price = _price;
        taxibleType = _type;
    }

    public ItemType getType(){
        return taxibleType;
    }

    public String getName(){
        return Name;
    }

    public double getPrice(){
        return Price;
    }
}
