package com.Store;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Store{
    private ArrayList<String> Orders;
    private ArrayList<String> Customers;
    public static void main(String[] args) throws IOException {
        var currStore = new Store();

    }
    public void runStore(){
        var menu = true;
        while (menu) {
            Scanner menuSelect = new Scanner(System.in);
            System.out.println("Select from the following options:\n1. Add Customer"
            +"\n2. Select Customer\n3. Quit");
            String selection = menuSelect.nextLine();
            switch (selection)
            {
                case "1": addCustomer(); break;
                case "2": selectCustomer(); break;
                case "3": menu = false; break;
            }
        }

    }
    public void makeOrder(String _address, String _customer){
        //Do thing
    }
    public Store() throws IOException {
        var customerFile = "Customers.txt";
        String all_customers = Files.readString(Paths.get(customerFile));
        String[] customerList = all_customers.split(",");
        int _max = customerList.length;

        for (var i = 0; i < _max; i++)
        {
            Customers.add(customerList[i]);
        }
    }
    public void addCustomer(){
        Scanner nameSelect = new Scanner(System.in);
        System.out.println("What is the customer's name?");
        String _custName = nameSelect.nextLine();
        var newCustomer = new Customer(_custName);
        Customers.add(newCustomer.getName());
    }
    public String selectCustomer(){
        //Do thing
    }
    public void manageCustomer(String _selected_customer){
        //Do thing
    }
}
