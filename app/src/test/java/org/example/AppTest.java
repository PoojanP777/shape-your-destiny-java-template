package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testCircle() {
        Circle c = new Circle(5);
        assertEquals(Math.PI * 25, c.getArea(), 0.01);
        assertEquals(2 * Math.PI * 5, c.getPerimeter(), 0.01);
    }

    @Test
    void testRectangle() {
        Rectangle r = new Rectangle(4, 5);
        assertEquals(20, r.getArea(), 0.01);
        assertEquals(18, r.getPerimeter(), 0.01);
    }

    @Test
    void testRightTriangle() {
        RightTriangle rt = new RightTriangle(3, 4);
        assertEquals(6, rt.getArea(), 0.01);
        assertEquals(12, rt.getPerimeter(), 0.01);
    }

    @Test
    void testSquare() {
        Square s = new Square(4);
        assertEquals(16, s.getArea(), 0.01);
        assertEquals(16, s.getPerimeter(), 0.01);
    }

    @Test
    void testIsoscelesRightTriangle() {
        IsoscelesRightTriangle irt = new IsoscelesRightTriangle(5);
        assertEquals(12.5, irt.getArea(), 0.01);
        assertEquals(5 + 5 + Math.sqrt(50), irt.getPerimeter(), 0.01);
    }

    @Test
    void testPolygonImplementations() {
        PolygonRectangle pr = new PolygonRectangle(4, 5);
        assertEquals(4, pr.numberOfSides());

        PolygonSquare ps = new PolygonSquare(4);
        assertEquals(4, ps.numberOfSides());

        PolygonRightTriangle prt = new PolygonRightTriangle(3, 4);
        assertEquals(3, prt.numberOfSides());

        PolygonIsoscelesRightTriangle pirt = new PolygonIsoscelesRightTriangle(5);
        assertEquals(3, pirt.numberOfSides());
    }
}

