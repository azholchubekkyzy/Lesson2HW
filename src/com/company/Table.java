package com.company;

final class Table extends School {

    private int lengthLegs;
    private int width;
    private String colors;
    private Blackboard blackboard;

    public Table(String name, String address, int lengthLegs, int width, String colors, int number, Colors color, Blackboard blackboard) {
        super(name, address, number, color);
        this.lengthLegs = lengthLegs;
        this.width = width;
        this.colors = colors;
        this.blackboard = blackboard;

    }
    public String getColors(){
        return colors;
    }
    public int getWidth(){
        return width;
    }
    public int getLengthLegs(){
        return lengthLegs;
    }
    @Override
    public String upDate () {
        return "  длина ножек, " + lengthLegs +
                " ширина стола, " + width +
                " цвет " + getColors() +
                " номер, " + getNumber()  +
                " цвет, " + getColor() +
                " доска, " + blackboard;
    }
    public void veryGood (int width, int lengthLegs){
        System.out.println(" ширина стола, " + width + " высота ножек, " + lengthLegs);
    }
}


