package Lc35_SearchInsertPosition;

import org.junit.Assert;
import org.junit.Test;

public class SearchInsertPositionTest {

    @Test
    public void testSearchInsert() {
        SearchInsertPosition s = new SearchInsertPosition();
        int ans1 = s.searchInsert(new int[]{1, 3, 5, 6}, 5);
        Assert.assertEquals(2, ans1);
        int ans2 = s.searchInsert(new int[]{1, 3, 5, 6}, 2);
        Assert.assertEquals(1, ans2);
        int ans3 = s.searchInsert(new int[]{1, 3, 5, 6}, 7);
        Assert.assertEquals(4, ans3);
    }
}
