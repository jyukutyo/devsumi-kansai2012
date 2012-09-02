/*
 * (c)FURYU CORP. 2012. All rights reserved.
 *
 * $Id$
 */
package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestShare {

    protected static WebDriver driver;

    @BeforeTest
    @Parameters({"driverName"})
    public static void createDriver(@Optional("firefox") String driverName) {
        driver = new FirefoxDriver();
    }

    @AfterTest
    public static void closeDriver() {
        driver.close();
    }

}
