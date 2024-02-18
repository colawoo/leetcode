package test;

import org.junit.Assert;
import org.junit.Test;
import solution.RemoveElement;

public class RemoveElementTest {

    @Test
    public void testRemoveElement() {

        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        RemoveElement r = new RemoveElement();
        int len = r.removeElementM1(nums, val);

        Assert.assertEquals(5, len);

    }

}
