package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*
        Button button=new Button(new Event("Hello there!"));
        button.something.happening();
        button=new Button(new Event("Genreal Kenobi!"));
        button.something.happening();
        button=new Button(new Event("U are the brave one!"));
        button.something.happening();
        */

        Random rand = new Random();


        Row row= new Row(rand.nextInt(7)+3);
        row.arr.print();
        row.arr.hellothere();

    }
}
