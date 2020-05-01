package com.company;

public class Main {

    public static void main(String[] args) {
        Classroom objectA = new Classroom(" Баластан, ", " ортосай, ", " биологии, ", 3, 12, Colors.RED);
        objectA.veryGood(3);
        System.out.println(objectA.upDate());
        System.out.println("_________________________");

        Table  objectB = new Table(" парта ", " ортосай ", 5, 50, " белый ",12, Colors.WHITE, new Blackboard(" белый "));
        objectB.veryGood(20,50);

        System.out.println(objectB.upDate());

        Table objectC = new Table (" парта ", " ортосай ", 20, 80, " коричневый, ", 12, Colors.BROWN, new Blackboard(" коричневый "));
        objectC.veryGood(25,100);

        System.out.println(objectC.upDate());









    }
}
