package Lc119_PascalTriangleII;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PascalTriangleIITest {

    @Test
    public void test() {
        PascalTriangleII p = new PascalTriangleII();
        List<Integer> ans1 = p.getRow(3);
        Assert.assertEquals("[1,3,3,1]", print(ans1));
        List<Integer> ans2 = p.getRow(0);
        Assert.assertEquals("[1]", print(ans2));
        List<Integer> ans3 = p.getRow(1);
        Assert.assertEquals("[1,1]", print(ans3));

    }

    private String print(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i < list.size() - 1) {
                sb.append(",");
            }
        }
        return sb.append("]").toString();
    }
}
