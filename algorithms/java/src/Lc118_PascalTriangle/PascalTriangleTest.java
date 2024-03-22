package Lc118_PascalTriangle;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PascalTriangleTest {

    @Test
    public void testSolution1() {
        PascalTriangle p = new PascalTriangle();
        List<List<Integer>> ans1 = p.solution1(5);
        Assert.assertEquals("[[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]", print(ans1));
        List<List<Integer>> ans2 = p.solution1(1);
        Assert.assertEquals("[[1]]", print(ans2));
    }

    @Test
    public void testSolution2() {
        PascalTriangle p = new PascalTriangle();
        List<List<Integer>> ans1 = p.solution2(5);
        Assert.assertEquals("[[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]", print(ans1));
        List<List<Integer>> ans2 = p.solution2(1);
        Assert.assertEquals("[[1]]", print(ans2));
    }

    private String print(List<List<Integer>> list) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < list.size(); i++) {
            builder.append("[");
            List<Integer> curList = list.get(i);
            for (int j = 0; j < curList.size(); j++) {
                builder.append(curList.get(j));
                if (j != curList.size() - 1) {
                    builder.append(",");
                }
            }
            builder.append("]");
            if (i != list.size() - 1) {
                builder.append(",");
            }
        }
        return builder.append("]").toString();
    }
}
