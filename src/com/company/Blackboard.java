package com.company;

public class Blackboard {
    Blackboard blackboard;

    public Blackboard(Blackboard blackboard) {
        this.blackboard = blackboard;
    }

    public Blackboard getBlackboard() {
        return blackboard;
    }
    public Blackboard (String blackboard){}
}
