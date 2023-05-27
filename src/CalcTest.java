import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    @Test
    void test(){
        assertEquals("2", Main.calc("1 + 1"));
        assertEquals("4", Main.calc("2 + 2"));
        assertEquals("6", Main.calc("3 + 3"));
        assertEquals("8", Main.calc("4 + 4"));
        assertEquals("10", Main.calc("5 + 5"));
        assertEquals("12", Main.calc("6 + 6"));
        assertEquals("14", Main.calc("7 + 7"));
        assertEquals("16", Main.calc("8 + 8"));
        assertEquals("18", Main.calc("9 + 9"));
        assertEquals("20", Main.calc("10 + 10"));
        assertEquals("0", Main.calc("1 - 1"));
        assertEquals("0", Main.calc("2 - 2"));
        assertEquals("0", Main.calc("3 - 3"));
        assertEquals("0", Main.calc("4 - 4"));
        assertEquals("0", Main.calc("5 - 5"));
        assertEquals("0", Main.calc("6 - 6"));
        assertEquals("0", Main.calc("7 - 7"));
        assertEquals("0", Main.calc("8 - 8"));
        assertEquals("0", Main.calc("9 - 9"));
        assertEquals("0", Main.calc("10 - 10"));
        assertEquals("1", Main.calc("1 / 1"));
        assertEquals("1", Main.calc("2 / 2"));
        assertEquals("1", Main.calc("3 / 3"));
        assertEquals("1", Main.calc("4 / 4"));
        assertEquals("1", Main.calc("5 / 5"));
        assertEquals("1", Main.calc("6 / 6"));
        assertEquals("1", Main.calc("7 / 7"));
        assertEquals("1", Main.calc("8 / 8"));
        assertEquals("1", Main.calc("9 / 9"));
        assertEquals("1", Main.calc("10 / 10"));
        assertEquals("1", Main.calc("1 * 1"));
        assertEquals("4", Main.calc("2 * 2"));
        assertEquals("9", Main.calc("3 * 3"));
        assertEquals("16", Main.calc("4 * 4"));
        assertEquals("25", Main.calc("5 * 5"));
        assertEquals("36", Main.calc("6 * 6"));
        assertEquals("49", Main.calc("7 * 7"));
        assertEquals("64", Main.calc("8 * 8"));
        assertEquals("81", Main.calc("9 * 9"));
        assertEquals("100", Main.calc("10 * 10"));



    }

}