package org.example.Enums;

public class Transaction {
    public String type;
    public int amount;
    public int id;

    public Transaction(int id,String type, int amount) {
        this.type = type;
        this.amount = amount;
        this.id = id;
    }
}