package searchInsertPosition;

import org.junit.Assert;
import org.junit.Test;

public class TestSearchInsertPosition {

    @Test
    public void testSearchInsert() {

        int[] nums = {1,3,5,6};
        int target = 5;

        SearchInsertPosition s = new SearchInsertPosition();
        int i = s.searchInsert(nums, target);
        Assert.assertEquals(2, i);

    }

    @Test
    public void testSearchInsertE1() {

        int[] nums = {1,3,5,6};
        int target = 2;

        SearchInsertPosition s = new SearchInsertPosition();
        int i = s.searchInsert(nums, target);
        Assert.assertEquals(1, i);

    }
}
