package com.company;

public class Button
{
    Event something;

    Button (Event happening){
        this.something=happening;
    }

}

interface Click {
    void happening();
}

class Event implements Click {

    private String action;

    public void happening(){

        System.out.println(this.action);
    }

    public Event(String S){
        this.action=S;
    }

}



