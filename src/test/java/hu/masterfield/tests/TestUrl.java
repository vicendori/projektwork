package hu.masterfield.tests;


import org.junit.jupiter.api.Test;

public class TestUrl extends BaseTest {
    @Test
    public void testUrl() throws InterruptedException {
        driver.get(baseURL);
        Thread.sleep(2000);
    }
}
