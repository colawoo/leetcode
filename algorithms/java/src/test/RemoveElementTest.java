package test;

import org.junit.Assert;
import org.junit.Test;
import solution.RemoveElement;

public class RemoveElementTest {

    @Test
    public void testSolution1() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        RemoveElement r = new RemoveElement();
        int len = r.solution1(nums, val);
        Assert.assertEquals(5, len);
    }

    @Test
    public void testSolution1_1() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        RemoveElement r = new RemoveElement();
        int len = r.solution1_1(nums, val);
        Assert.assertEquals(5, len);
    }

    @Test
    public void testSolution2() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        RemoveElement r = new RemoveElement();
        int len = r.solution2(nums, val);
        Assert.assertEquals(5, len);
    }
}
