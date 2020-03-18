package plusOne;

import org.junit.Assert;
import org.junit.Test;

public class TestPlusOne {

    @Test
    public void testPlusOne() {

        int[] digits = {1,2,3};
        PlusOne p = new PlusOne();
        int[] arr = p.plusOneM1(digits);

        Assert.assertArrayEquals(new int[]{1,2,4}, arr);

    }

    @Test
    public void testPlusOneT1() {

        int[] digits = {9,9};
        PlusOne p = new PlusOne();
        int[] arr = p.plusOneM1(digits);

        Assert.assertArrayEquals(new int[]{1,0,0}, arr);

    }
}
