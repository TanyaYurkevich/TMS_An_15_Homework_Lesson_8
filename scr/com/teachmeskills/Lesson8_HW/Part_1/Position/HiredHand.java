package com.teachmeskills.Lesson8_HW.Part_1.Position;

public class HiredHand implements IPosition {
    private String Name;
    private String Surname;

    @Override
    public void PrintPosition() {
        System.out.println("Должность: рабочий.");
    }
}