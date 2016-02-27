package test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SiteSearch {
private WebDriver driver;


@Before

public void setUp() throws Exception {
System.setProperty("webdriver.chrome.driver","C:\\tmp\\chromedriver.exe");

driver = new ChromeDriver();
driver.get("http://www.yahoo.co.jp");
System.out.println("ページ: " + driver.getTitle());


driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

}

@Test
public void test() throws Exception {

}


@Rule

public ErrorCollector collector = new ErrorCollector();

@Test

public void test1() throws Exception {
}

@After

public void tearDown() throws Exception {

driver.quit();
}

}
