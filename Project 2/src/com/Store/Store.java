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
        currStore.runStore();
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
        //Select a customer
        //return customer
        int _max = Customers.size();
        System.out.println("Please enter an integer from the following list of customers to select:");
        for(var i = 0; i < _max; i++)
        {
            System.out.println(i + ". " + Customers.get(i));
        }
        Scanner custSelect = new Scanner(System.in);
        String _choice = custSelect.nextLine();
        int _int_choice = Integer.parseInt(_choice);
        return Customers.get(_int_choice);

    }
    public void manageCustomer(String _selected_customer){
        //Do thing
    }
}
