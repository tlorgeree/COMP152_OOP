package com.Store;

public class Store {
    String AddressLine1;
    String AddressLine2;
    String City;
    String State;
    String PostalCode;

    public String toString(){
        //Do thing
    }
    public String ShippingAddress(String _line1,
      String _line2, String _city, String _state, String _zip){
        //Do thing
        String _address = _line1 + ",\n " + _line2 + ",\n"
                + _city + ", " + _state + ", " + _zip;

        return _address;
    }
}
