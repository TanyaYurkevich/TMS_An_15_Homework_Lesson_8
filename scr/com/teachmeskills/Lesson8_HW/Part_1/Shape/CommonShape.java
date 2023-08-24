package com.teachmeskills.Lesson8_HW.Part_1.Shape;

    public sealed abstract class CommonShape permits Circle, Rectangle, Triangle {
        public abstract double getPerimeterShape();
        public abstract double getAreaShape();

    }


