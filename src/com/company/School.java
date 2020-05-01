package com.company;

public class School {
    private int number;
    private String name;
    private String address;
    private Colors color;

    public School (String name, String address, int number, Colors color) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    public String getName () {
        return name;
    }

    public String getAddress () {
        return address;
    }

    public String upDate () {
        return " имя " + name + " номер " + number + " адрес " + address + " цвет " + color;
    }

}
