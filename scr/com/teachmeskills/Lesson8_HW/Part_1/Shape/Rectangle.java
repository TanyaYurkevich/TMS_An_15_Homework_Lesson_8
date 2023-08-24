package com.teachmeskills.Lesson8_HW.Part_1.Shape;

public final class Rectangle extends CommonShape{
    private double Width;
    private double Length;

    public Rectangle(double width, double length) {
        Width = width;
        Length = length;
    }

    @Override
    public double getPerimeterShape() {
        double PerRectangle = 2*(Width+Length);
        return PerRectangle;
    }

    @Override
    public double getAreaShape() {
        double ArRectangle = Width*Length;
        return ArRectangle;
    }
}
