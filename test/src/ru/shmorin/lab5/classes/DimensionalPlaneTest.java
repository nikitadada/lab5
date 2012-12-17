package ru.shmorin.lab5.classes;
import org.junit.Test;
import ru.shmorin.lab5.DimensionalPlane;


import static org.junit.Assert.*;
public class DimensionalPlaneTest {

    @Test
    public void testDimension() {
        System.out.println("Проверка метода dimension()");
        DimensionalPlane p = new DimensionalPlane(3, 4, 2, 1, 3);
        assertEquals(4, p.dimension(), 0.00001);
    }
}
