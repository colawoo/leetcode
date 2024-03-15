package Lc70_ClimbingStairs;

import org.junit.Assert;
import org.junit.Test;

public class ClimbingStairsTest {

    @Test
    public void testSolution1() {
        ClimbingStairs c = new ClimbingStairs();
        int ans1 = c.solution1(2);
        Assert.assertEquals(2, ans1);
        int ans2 = c.solution1(3);
        Assert.assertEquals(3, ans2);
        int ans3 = c.solution1(45);
        Assert.assertEquals(1836311903, ans3);
    }

    @Test
    public void testSolution2() {
        ClimbingStairs c = new ClimbingStairs();
        int ans1 = c.solution2(2);
        Assert.assertEquals(2, ans1);
        int ans2 = c.solution2(3);
        Assert.assertEquals(3, ans2);
        int ans3 = c.solution2(45);
        Assert.assertEquals(1836311903, ans3);
    }
}
