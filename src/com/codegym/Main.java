package com.codegym;

public class Main {

    public static void main(String[] args) {
	Point2D point2D = new Point2D(48,30);
    point2D.setXY(20,40);
    point2D.getXY();
        System.out.println(point2D);


    Point3D point3D = new Point3D(50,30,60);
    point3D.setXYZ(20,30,30);
        System.out.println(point3D);

    }
}
