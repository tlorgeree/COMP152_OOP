package com.Store;

public class ShippingAddress {
    private String AddressLine1;
    private String AddressLine2;
    private String City;
    private String State;
    private String PostalCode;

    public String toString(){
        //Do thing
        return AddressLine1 + ",\n " + AddressLine2 + ",\n"
                + City + ", " + State + ", " + PostalCode;
    }
    public ShippingAddress(String _line1,
                                  String _line2, String _city, String _state, String _zip){
        AddressLine1 = _line1;
        AddressLine2 = _line2;
        City = _city;
        State = _state;
        PostalCode = _zip;
    }
}
