package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class Product {
     private int productId;
     private String name;
     private double price;

     public int getProductId() {
         return productId;
     }

     public void setProductId(int productId) {
         this.productId = productId;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public double getPrice() {
         return price;
     }

     public void setPrice(double price) {
         this.price = price;
     }

     public Product(int productId, String name, double price) {
         this.productId = productId;
         this.name = name;
         this.price = price;
     }
     public static ArrayList<Product> getInventory(){
         ArrayList<Product> inventory = new ArrayList<>();
         String fileName= "src/main/resources/inventory.csv";
         try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
             String line; //blank line does not read first because we have headers
             while ((line = br.readLine()) != null) {
                 String[] parts = line.split("\\|");
                 int id = Integer.parseInt(parts[0]);
                 String name = parts[1];
                 double price = Double.parseDouble(parts[2]);
                 Product product = new Product(id, name, price);
                 inventory.add(product);
             }

         } catch(IOException e){
             System.out.println("Error reading inventory file: "+ e.getMessage());

         }
         return inventory;
     }
     //method to list all products


 }
