package com.example.beach.features.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0016\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001d"}, d2 = {"Lcom/example/beach/features/model/Flight;", "Ljava/io/Serializable;", "price", "", "airline", "", "departure_date", "arrival_date", "departure_airport", "arrival_airport", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAirline", "()Ljava/lang/String;", "setAirline", "(Ljava/lang/String;)V", "getArrival_airport", "setArrival_airport", "getArrival_date", "setArrival_date", "getDeparture_airport", "setDeparture_airport", "getDeparture_date", "setDeparture_date", "getPrice", "()I", "setPrice", "(I)V", "convertDate", "dateTime", "app_debug"})
public class Flight implements java.io.Serializable {
    private int price;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String airline;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String departure_date;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String arrival_date;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String departure_airport;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String arrival_airport;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String convertDate(@org.jetbrains.annotations.NotNull()
    java.lang.String dateTime) {
        return null;
    }
    
    public final int getPrice() {
        return 0;
    }
    
    public final void setPrice(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAirline() {
        return null;
    }
    
    public final void setAirline(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeparture_date() {
        return null;
    }
    
    public final void setDeparture_date(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getArrival_date() {
        return null;
    }
    
    public final void setArrival_date(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeparture_airport() {
        return null;
    }
    
    public final void setDeparture_airport(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getArrival_airport() {
        return null;
    }
    
    public final void setArrival_airport(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public Flight(int price, @org.jetbrains.annotations.NotNull()
    java.lang.String airline, @org.jetbrains.annotations.NotNull()
    java.lang.String departure_date, @org.jetbrains.annotations.NotNull()
    java.lang.String arrival_date, @org.jetbrains.annotations.NotNull()
    java.lang.String departure_airport, @org.jetbrains.annotations.NotNull()
    java.lang.String arrival_airport) {
        super();
    }
}