package com.company;

public class Classroom extends School {

    private String forLesson;
    private int floor;

    public Classroom(String name, String address, String forLesson, int floor, int number, Colors color) {
        super(name, address, number, color);
        this.forLesson = forLesson;
        this.floor = floor;
    }

    public String getForLesson() {
        return forLesson;
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public String upDate() {
        return " имя " + getName() + " номер, " + getNumber() + " адрес, " + getAddress() +
                " для занятия по " + forLesson + " этаж, "
                + floor + " цвет, " + getColor();
    }

    public void veryGood(int floor) {
        System.out.println(" этаж, " + floor);

    }

    public final void veryGood(String forLesson) {
        System.out.println(" для занятия по " + forLesson);


    }

}