import org.junit.jupiter.api.*;

import java.sql.Array;

public class Testare {


//    @BeforeAll si @AfterAll - metodele cu aceasta adnotare trebuie sa fie statice;
//    @DisplayName - poti introduce explicatii si ii schimba denumirea;
    public static void initializare() {
        System.out.println("clasa testare");

    }

    @Test
    @DisplayName("descriere test 2 + reguli")
    public void primulTest() {
        System.out.println("test1");

    }

    @Test
    public void alDoileaTest() {
        System.out.println("test2");
    }

    @Test
    public void testIsTrue(){
        boolean result = true;
        Assertions.assertTrue(result);
    }

    @Test
    public void testIsFalse() {
        boolean result = false;
        Assertions.assertFalse(result, "adafag");
    }

    @Test
    public void testIsNotNull() {
        String text = "acb";
        Assertions.assertNotNull(text, "verifica text");
        System.out.println(text);
    }
    @Test
    public void testIsNull() {
        String text = null;
        Assertions.assertNull(text);
    }

    @Test
    public void testArraysEquals() {
        Assertions.assertArrayEquals(new int[] {5, 6}, new int[] {5, 6});
    }


}
