package ru.shmorin.lab5.classes;
import org.junit.Test;
import ru.shmorin.lab5.Line;


import static org.junit.Assert.*;
public class LineTest {

    @Test
    public void testDimension() {
        System.out.println("Проверка метода dimension()");
        Line p = new Line(3, 4, 2);
        assertEquals(2, p.dimension(), 0.00001);
    }
}
