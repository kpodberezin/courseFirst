package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by user on 30.10.2016.
 */
public class PointTests {

    @Test
    public void testDistance() {
        Point point = new Point(1, 2);
        Point p2 = new Point(2, 2);
        Assert.assertEquals(point.distanceTo(p2),1.0,"Функкция distanceTo должна вернуть корректное значение");
    }

    @Test
    public void testDistanceLessZero() {
        Point point = new Point(-1, 2);
        Point p2 = new Point(2, 2);
        Assert.assertEquals(point.distanceTo(p2),3.0,"Функкция distanceTo должна вернуть корректное значение");
    }

    @Test
    public void testZero() {
        Point point = new Point(0, 0);
        Point p2 = new Point(0, 0);
        Assert.assertEquals(point.distanceTo(p2),0.0,"Функкция distanceTo должна вернуть корректное значение");
    }
}
