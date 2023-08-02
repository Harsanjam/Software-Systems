package coe318.lab4;
public class Account {
    
    private String name;
    private int number;
    private double balance;
    
    public Account (String owner, int account, double initialBalance){
        name = owner;
        number = account;
        balance = initialBalance;
    }
    
    public int getNumber(){
        return number;
    }
    
    public String getName(){
        return name;
    }
    
    public double getBalance(){
        return balance;
    }
    
    boolean deposit (double amount){
        if (amount > 0){
            balance = balance + amount;
            return true;
        }
        
        else {
           return false; 
        }
    }
    
    boolean withdraw (double amount){
        if (balance >= amount && amount > 0){
            balance = balance - amount;
            return true;
        }
        
        else {
            return false;
        }
    }
    
    @Override
public String toString() {//DO NOT MODIFY
return "(" + getName() + ", " + getNumber() + ", " + String.format("$%.2f", getBalance()) + ")";
}
    
}
