package org.example;

// Abstract base class
abstract class Shape {
    abstract double getArea();
    abstract double getPerimeter();
}

// Circle class
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle class
class Rectangle extends Shape {
    protected double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }

    @Override
    double getPerimeter() {
        return 2 * (length + width);
    }
}

// Right Triangle class
class RightTriangle extends Shape {
    protected double base, height;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double getArea() {
        return 0.5 * base * height;
    }

    @Override
    double getPerimeter() {
        return base + height + Math.sqrt(base * base + height * height);
    }
}

// Square class (inherits from Rectangle)
class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

// Isosceles Right Triangle class (inherits from RightTriangle)
class IsoscelesRightTriangle extends RightTriangle {
    public IsoscelesRightTriangle(double leg) {
        super(leg, leg);
    }
}

// Polygon interface
interface Polygon {
    int numberOfSides();
}

// Implementing Polygon interface in relevant classes
class PolygonRectangle extends Rectangle implements Polygon {
    public PolygonRectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public int numberOfSides() {
        return 4;
    }
}

class PolygonSquare extends Square implements Polygon {
    public PolygonSquare(double side) {
        super(side);
    }

    @Override
    public int numberOfSides() {
        return 4;
    }
}

class PolygonRightTriangle extends RightTriangle implements Polygon {
    public PolygonRightTriangle(double base, double height) {
        super(base, height);
    }

    @Override
    public int numberOfSides() {
        return 3;
    }
}

class PolygonIsoscelesRightTriangle extends IsoscelesRightTriangle implements Polygon {
    public PolygonIsoscelesRightTriangle(double leg) {
        super(leg);
    }

    @Override
    public int numberOfSides() {
        return 3;
    }
}

public class App {
    public static void main(String[] args) {
        System.out.println("You can write a driver program for your code here!");
    }
}
