package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Julia.Reshetnikova on 08-Aug-17.
 */
public class MyTestInGradleSuite extends TestBase {

    @Test
    public void test1() throws InterruptedException {
        content("test1");
    }

    @Test
    public void test2() throws InterruptedException {
        content("test2");
    }

    @Test
    public void test3() throws InterruptedException {
        content("test3");
    }

    @Test
    public void test4() throws InterruptedException {
        content("test4");
    }

    @Test
    public void test5_shouldFail() throws InterruptedException {
        content("test5");
        Assert.fail("failed");
    }
}
