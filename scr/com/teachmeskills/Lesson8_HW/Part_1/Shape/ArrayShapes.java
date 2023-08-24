package com.teachmeskills.Lesson8_HW.Part_1.Shape;

public class ArrayShapes {
    public static void main(String[] args) {
        CommonShape commonShape = new Rectangle(5, 7);
        CommonShape commonShape1 = new Triangle(5, 4, 4, 4);
        CommonShape commonShape2 = new Triangle(7, 8, 9, 7);
        CommonShape commonShape3 = new Circle(5);
        CommonShape commonShape4 = new Circle(3);

        CommonShape[] Array = new CommonShape[5];
        Array[0] = commonShape;
        Array[1] = commonShape1;
        Array[2] = commonShape2;
        Array[3] = commonShape3;
        Array[4] = commonShape4;

        for (CommonShape S : Array) {
            System.out.println("Площадь фигуры равна: " + S.getAreaShape());
        }

        double sum = 0;
        for (int i = 0; i < Array.length; i++) {
            double P = Array[i].getPerimeterShape();
            sum += P;
        }

            System.out.println("\n"+"Сумма периметров равна: " + sum);
        }
    }


