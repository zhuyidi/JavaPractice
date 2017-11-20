package ClassThree;

import java.util.Scanner;

/**
 * Created by dela on 11/18/17.
 */

class Point{
    private double x;
    private double y;

    public Point() {}

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point o){
        return Math.sqrt(Math.pow(this.x - o.x, 2) + Math.pow(this.y - o.y, 2));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

class Point3D extends Point{
    private double z;

    public Point3D() {}

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double distance(Point3D o){
        return Math.sqrt(Math.pow(super.getX() - o.getX(), 2) + Math.pow(super.getY() - o.getY(), 2)
                + Math.pow(this.z - o.z, 2));
    }
}

public class Main1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Point point1 = new Point(scanner.nextDouble(), scanner.nextDouble());
        Point point2 = new Point(scanner.nextDouble(), scanner.nextDouble());
        Point3D point3D1 = new Point3D(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        Point3D point3D2 = new Point3D(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());

        System.out.println("plane d=" + point1.distance(point2));
        System.out.println("space d=" + point3D1.distance(point3D2));
    }
}
