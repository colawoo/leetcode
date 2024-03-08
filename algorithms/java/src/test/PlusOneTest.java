package test;

import org.junit.Assert;
import org.junit.Test;
import solution.PlusOne;

public class PlusOneTest {

    @Test
    public void testPlusOne() {
        PlusOne p = new PlusOne();
        int[] ans1 = p.plusOne(new int[]{1, 2, 3});
        Assert.assertArrayEquals(new int[]{1, 2, 4}, ans1);
        int[] ans2 = p.plusOne(new int[]{4, 3, 2, 1});
        Assert.assertArrayEquals(new int[]{4, 3, 2, 2}, ans2);
        int[] ans3 = p.plusOne(new int[]{9});
        Assert.assertArrayEquals(new int[]{1, 0}, ans3);
        int[] ans4 = p.plusOne(new int[]{1, 2, 9});
        Assert.assertArrayEquals(new int[]{1, 3, 0}, ans4);
    }
}
