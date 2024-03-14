package Lc69_Sqrtx;

import org.junit.Assert;
import org.junit.Test;

public class SqrtxTest {

    @Test
    public void testSolution1() {
        Sqrtx s = new Sqrtx();
        int ans1 = s.solution1(4);
        Assert.assertEquals(2, ans1);
        int ans2 = s.solution1(8);
        Assert.assertEquals(2, ans2);
        int ans3 = s.solution1(5);
        Assert.assertEquals(2, ans3);
    }

    @Test
    public void testSolution2() {
        Sqrtx s = new Sqrtx();
        int ans1 = s.solution2(4);
        Assert.assertEquals(2, ans1);
        int ans2 = s.solution2(8);
        Assert.assertEquals(2, ans2);
        int ans3 = s.solution2(5);
        Assert.assertEquals(2, ans3);
        int ans4 = s.solution2(0);
        Assert.assertEquals(0, ans4);
    }
}
