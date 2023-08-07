package org.gur;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class demoguru {
public static <webDriver> void main(String[] args) {
	System.setProperty("webdriver.edge.driver",
			"C:\\Users\\SABARINATHAN\\eclipse-workspace\\SeleniumInmakes\\driver\\msedgedriver.exe");

	WebDriver n = new EdgeDriver();
	
	n.get("https://demo.guru99.com/test/drag_drop.html");
	n.manage().window().maximize();
	Actions a = new Actions(n);
	WebElement fn = n.findElement(By.xpath("//a[text()=' BANK ']"));
	WebElement fs = n.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	a.dragAndDrop(fn, fs).perform();
	WebElement r = n.findElement(By.xpath("//a[text()=' 5000 ']"));
	WebElement rs = n.findElement(By.xpath("//li[@class='placeholder']"));
	a.dragAndDrop(r, rs).perform();
	WebElement sa = n.findElement(By.xpath(" //a[text()=' SALES ']"));
	WebElement s = n.findElement(By.xpath("//li[@class='placeholder']"));
	a.dragAndDrop(sa, s).perform();
	WebElement er = n.findElement(By.xpath("//a[text()=' 5000']"));
	WebElement ert = n.findElement(By.xpath("//li[@class='placeholder']"));
	a.dragAndDrop(er,ert).perform();
}
}
