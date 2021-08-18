import static org.junit.Assert.*;

import org.junit.Test;


public class RekursionenTest {

    Rekursionen r = new Rekursionen();

    @Test
    public void testMinimum() {
        int[] x = new int[]{14,19,56,2,37,45,89};
        assertEquals(2, r.minimum(x));
    }

    @Test
    public void testGgT() {
        assertEquals(15, r.ggT(105, 45));
    }

    @Test
    public void testBin�rdarstellung() {
        assertEquals("10101001", r.bin�rdarstellung(149));
    }

}
