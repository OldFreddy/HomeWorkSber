package newTests;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class TestClass {

    @BeforeClass
    public static void checkOs() throws Exception {
        Assume.assumeTrue(System.getProperty("os.name").toLowerCase().contains("windows"));
    }

    @Parameterized.Parameter(0)
    public int a;
    @Parameterized.Parameter(1)
    public int b;

    @Parameterized.Parameter(2)
    public int res;

    @Parameterized.Parameters
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{{1, 1, 2}, {4, 2, 6}, {123, -123, 0}, {1, 1, 3}});
    }

    private int calc(int a, int b) {
        return a + b;
    }


    @Test

    public void testParam() {
        Assert.assertEquals(res, calc(a, b));
    }
}
