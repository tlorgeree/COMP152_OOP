package com.Store;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Store{
    private ArrayList<Order> Orders = new ArrayList<Order>();
    private ArrayList<Customer> Customers = new ArrayList<Customer>();
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
            switch (selection) {
                case "1" -> addCustomer();
                case "2" -> {
                    var _custSelect = selectCustomer();
                    manageCustomer(_custSelect);
                }
                case "3" -> menu = false;
                default -> throw new IllegalStateException("Unexpected value: " + selection);
            }
        }
    }
    public void makeOrder(ShippingAddress _address, Customer _customer) {
        var _cart = new ArrayList<merchandiseItem>();
        var menu = true;
        while (menu) {
            Scanner menuSelect = new Scanner(System.in);
            System.out.println("Select from the following items to add to your order:\n1. Shirt"
                    + "\n2. Can of Whoopass\n3. A Dull Kazoo\n4. Quit");
            String selection = menuSelect.nextLine();
            switch (selection) {
                case "1":
                    _cart.add(new merchandiseItem("Shirt", 3.50, ItemType.Clothing));
                    break;
                case "2":
                    _cart.add(new merchandiseItem("Can of Whoopass", 100.00, ItemType.WICFood));
                    break;
                case "3":
                    _cart.add(new merchandiseItem("A Dull Kazoo", 0.50, ItemType.GeneralMerchandise));
                    break;
                case "4":
                    menu = false;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + selection);
            }

        }
        Orders.add(new Order(_address, _customer, _cart));
    }
    public Store() throws IOException {
        var customerFile = "Customers.txt";
        String all_customers = Files.readString(Paths.get(customerFile));
        String[] customerList = all_customers.split(",");
        for (String s : customerList) {
            Customers.add(new BusinessCustomer(s));
        }
    }
    public void addCustomer(){
        Scanner nameSelect = new Scanner(System.in);
        System.out.println("What is the customer's name?");
        String _custName = nameSelect.nextLine();
        var menu = true;
        while (menu) {
            Scanner menuSelect = new Scanner(System.in);
            System.out.println("Select Customer Type:\n1. Business"
                    + "\n2. Residential\n3. Tax Exempt\n4. Quit");
            String selection = menuSelect.nextLine();
            switch (selection) {
                case "1": Customers.add(new BusinessCustomer(_custName));
                    break;
                case "2": Customers.add(new ResidentialCustomer(_custName));
                    break;
                case "3": Customers.add(new TaxExemptCustomer(_custName));
                    break;
                case "4":
                    menu = false;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + selection);
            }

        }

    }
    public Customer selectCustomer(){
        //Select a customer
        //return customer
        int _max = Customers.size();
        System.out.println("Please enter an integer from the following list of customers to select:");
        for(var i = 0; i < _max; i++)
        {
            System.out.println(i + ". " + Customers.get(i).getName());
        }
        Scanner custSelect = new Scanner(System.in);
        String _choice = custSelect.nextLine();
        int _int_choice = Integer.parseInt(_choice);
        return Customers.get(_int_choice);

    }
    public void manageCustomer(Customer _selected_customer){
        //Start menu loop
            //add address
            //make order
        var menu = true;
        while (menu) {
            Scanner menuSelect = new Scanner(System.in);
            System.out.println("Select from the following options:\n1. Add Address"
                    + "\n2. Make Order \n3. Quit");
            //Add address list display

            String selection = menuSelect.nextLine();
            switch (selection) {
                case "1"://add new customer address
                    Scanner add_menuSelect_ln1 = new Scanner(System.in);
                    System.out.println("Please enter the new address line 1:");
                    String newAddress_ln1 = add_menuSelect_ln1.nextLine();
                    Scanner add_menuSelect_ln2 = new Scanner(System.in);
                    System.out.println("Please enter the new address line 2:");
                    String newAddress_ln2 = add_menuSelect_ln2.nextLine();
                    Scanner add_menuSelect_city = new Scanner(System.in);
                    System.out.println("Please enter the City:");
                    String newAddress_city = add_menuSelect_city.nextLine();
                    Scanner add_menuSelect_state = new Scanner(System.in);
                    System.out.println("Please enter the State:");
                    String newAddress_state = add_menuSelect_state.nextLine();
                    Scanner add_menuSelect_zip = new Scanner(System.in);
                    System.out.println("Please enter the Zip Code:");
                    String newAddress_zip = add_menuSelect_zip.nextLine();
                    _selected_customer.addAddress(newAddress_ln1, newAddress_ln2, newAddress_city,
                            newAddress_state, newAddress_zip);
                    break;
                case "2"://make order for customer
                    var shipAdd = _selected_customer.getAddress();
                    makeOrder(shipAdd, _selected_customer);
                    break;
                case "3":
                    menu = false;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + selection);
            }
        }
    }
}
