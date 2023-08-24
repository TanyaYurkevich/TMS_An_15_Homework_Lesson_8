package com.teachmeskills.Lesson8_HW.Part_1.Position;

public class Runner {
    public static void main(String[] args) {
        Accountant accountant = new Accountant();
        accountant.PrintPosition();

        Director director = new Director();
        director.PrintPosition();

        HiredHand hiredHand = new HiredHand();
        hiredHand.PrintPosition();

    }
}
