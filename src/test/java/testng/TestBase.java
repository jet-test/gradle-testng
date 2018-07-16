package testng;

public abstract class TestBase {
    protected void content(String name) throws InterruptedException {
        System.out.println("This is some test output from " + name);
        Thread.sleep((long) (Math.random() * 100));
    }
}
