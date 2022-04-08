package com.company;

import java.util.Objects;

public class Auto {

    private final String model;
    private final String manufacturer;
    private final int year;

    public Auto(String model, String manufacturer, int year) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;

    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auto)) return false;
        Auto auto = (Auto) o;
        return year == auto.year && Objects.equals(model, auto.model) && Objects.equals(manufacturer, auto.manufacturer);
    }

    public int hashCode() {
        return Objects.hash(model, manufacturer, year);
    }

    public String toString() {
        return "[Model: " + model + ", Manufacturer: " + manufacturer + ", Year: " + year + " ]";
    }

    public int getYear() {
        return year;
    }
}





















