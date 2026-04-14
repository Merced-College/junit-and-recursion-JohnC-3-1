import org.junit.Test;
import static org.junit.Assert.*;

public class TestJUnint {
    @Test
    public void testCount8_1() {
        assertEquals(4, TestingRecursion.count8(8818));
    }

    @Test
    public void testCount8_2() {
        assertEquals(2, TestingRecursion.count8(818));
    }

    @Test
    public void testCount8_3() {
        assertEquals(1, TestingRecursion.count8(8));
    }

    @Test
    public void testCount8_4() {
        assertEquals(0, TestingRecursion.count8(0));
    }

    @Test
    public void testCount8_5() {
        assertEquals(1, TestingRecursion.count8(810));
    }


    @Test
    public void testCountHi_1() {
        assertEquals(1, TestingRecursion.countHi("hi"));
    }

    @Test
    public void testCountHi_2() {
        assertEquals(0, TestingRecursion.countHi("Hi"));
    }

    @Test
    public void testCountHi_3() {
        assertEquals(2, TestingRecursion.countHi("hixhi"));
    }

    @Test
    public void testCountHi_4() {
        assertEquals(3, TestingRecursion.countHi("hihihihx"));
    }

    @Test
    public void testCountHi_5() {
        assertEquals(2, TestingRecursion.countHi("xhixhix"));
    }


    @Test
    public void testCountHi2_1() {
        assertEquals(1, TestingRecursion.countHi2("hi"));
    }

    @Test
    public void testCountHi2_2() {
        assertEquals(0, TestingRecursion.countHi2("Hi"));
    }

    @Test
    public void testCountHi2_3() {
        assertEquals(1, TestingRecursion.countHi2("hixhi"));
    }

    @Test
    public void testCountHi2_4() {
        assertEquals(3, TestingRecursion.countHi2("hihihihx"));
    }

    @Test
    public void testCountHi2_5() {
        assertEquals(0, TestingRecursion.countHi2("xhixhix"));
    }


    @Test
    public void testStrCount_1() {
        assertEquals(2, TestingRecursion.strCount("catcowcat", "cat"));
    }

    @Test
    public void testStrCount_2() {
        assertEquals(1, TestingRecursion.strCount("catcowcat", "cow"));
    }

    @Test
    public void testStrCount_3() {
        assertEquals(0, TestingRecursion.strCount("catcowcat", "dog"));
    }

    @Test
    public void testStrCount_4() {
        assertEquals(2, TestingRecursion.strCount("dogcatdog", "dog"));
    }

    @Test
    public void testStrCount_5() {
        assertEquals(1, TestingRecursion.strCount("dogcatdog", "cat"));
    }


    @Test
    public void testStringClean_1() {
        assertEquals("yza", TestingRecursion.stringClean("yyzzza"));
    }

    @Test
    public void testStringClean_2() {
        assertEquals("abcd", TestingRecursion.stringClean("abbbcdd"));
    }

    @Test
    public void testStringClean_3() {
        assertEquals("Helo", TestingRecursion.stringClean("Hello"));
    }

    @Test
    public void testStringClean_4() {
        assertEquals("banana", TestingRecursion.stringClean("banana"));
    }

    @Test
    public void testStringClean_5() {
        assertEquals("Misisipi", TestingRecursion.stringClean("Mississippi"));
    }
}