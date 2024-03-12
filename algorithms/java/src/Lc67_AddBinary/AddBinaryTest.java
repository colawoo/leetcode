package Lc67_AddBinary;

import org.junit.Assert;
import org.junit.Test;

public class AddBinaryTest {

    @Test
    public void test() {
        AddBinary a = new AddBinary();
        String ans1 = a.addBinary("11", "1");
        Assert.assertEquals("100", ans1);
        String ans2 = a.addBinary("1010", "1011");
        Assert.assertEquals("10101", ans2);
    }
}
