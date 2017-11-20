package ClassThree;

import java.util.Scanner;

/**
 * Created by dela on 11/20/17.
 */

abstract class Shape {
    abstract double getArea();
    abstract double getPeri();
}

class Circle extends Shape {
    private double r;

    public Circle() { }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double getArea() {
        if(r < 0){
            return 0;
        }
        return Math.PI * r * r;
    }

    @Override
    double getPeri() {
        if(r < 0){
            return 0;
        }
        return Math.PI * r * 2;
    }
}

class Rectangle extends Shape {
    private double h;
    private double w;

    public Rectangle() { }

    public Rectangle(double h, double w) {
        this.h = h;
        this.w = w;
    }

    @Override
    double getArea() {
        if(h < 0 || w < 0){
            return 0;
        }
        return h * w;
    }

    @Override
    double getPeri() {
        if(h < 0 || w < 0){
            return 0;
        }
        return 2 * (h + w);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle(scanner.nextDouble());
        Rectangle rectangle = new Rectangle(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("Circle area=" + circle.getArea() + ", peri=" + circle.getPeri());
        System.out.println("Rectangle area=" + rectangle.getArea() + ", peri=" + rectangle.getPeri());
    }
}
