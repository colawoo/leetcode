package test;

import org.junit.Assert;
import org.junit.Test;
import solution.PlusOne;

public class PlusOneTest {

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
