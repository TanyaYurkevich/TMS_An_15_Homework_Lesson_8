package com.teachmeskills.Lesson8_HW.Part_1.Position;

public class  Accountant implements IPosition {
    private String Name;
    private String Surname;

    @Override
    public void PrintPosition() {
        System.out.println("Должность: бухгалтер.");
    }
}

