package com.example.demo.domain;

public class CryptoCurrency {
    private int rank;
    private String name;
    private String symbol;
    private double price;
    private double change24h;
    private double volume24h;
    private double marketCap;

    public CryptoCurrency() {
    }

    public CryptoCurrency(int rank, String name, String symbol, double price, double change24h, double volume24h, double marketCap) {
        this.rank = rank;
        this.name = name;
        this.symbol = symbol;
        this.price = price;
        this.change24h = change24h;
        this.volume24h = volume24h;
        this.marketCap = marketCap;
    }

    // Getters and setters
    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getChange24h() {
        return change24h;
    }

    public void setChange24h(double change24h) {
        this.change24h = change24h;
    }

    public double getVolume24h() {
        return volume24h;
    }

    public void setVolume24h(double volume24h) {
        this.volume24h = volume24h;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(double marketCap) {
        this.marketCap = marketCap;
    }

    // toString() method for easy printing and debugging
    @Override
    public String toString() {
        return "CryptoCurrency{" +
                "rank=" + rank +
                ", name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", price=" + price +
                ", change24h=" + change24h +
                ", volume24h=" + volume24h +
                ", marketCap=" + marketCap +
                '}';
    }
}
