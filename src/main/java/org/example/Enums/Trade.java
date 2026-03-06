package org.example.Enums;

public class Trade {
    public TradeType type;
    public int amount;

    public Trade(TradeType type, int amount) {
        this.type = type;
        this.amount = amount;
    }
}