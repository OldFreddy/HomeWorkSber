package newTests;

import org.junit.Assert;
import org.junit.Test;

import java.util.Objects;

public class MyClassTest {


    @Test
    public void test1() {
        MyClass myClass = new MyClass();

        Assert.assertEquals(8, myClass.getSomNum(4));
        Assert.assertNotEquals(7, myClass.getSomNum(4));
        Assert.assertTrue(Objects.equals(8, myClass.getSomNum(4)));

    }

    @Test(expected = IllegalArgumentException.class)
    public void test2() {
        MyClass myClass = new MyClass();

        myClass.getSomNum(0);
    }
}
