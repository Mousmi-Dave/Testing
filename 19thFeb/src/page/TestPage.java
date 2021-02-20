package page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import base.testbase;

public class TestPage extends testbase {

	@FindBy(xpath = "//*[@id=\"menu-item-40\"]/a") // Click Shop menu
	WebElement submit;
	@FindBy(xpath = "//*[@id=\"content\"]/nav/a") // Click on homebtn
	WebElement homebtn;
	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	WebElement link1;// first image

	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]")

	WebElement link2;
	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/ul[1]/li[1]/a[1]")
	WebElement link3;
	// Slide
	@FindBys(value = { @FindBy(xpath ="//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[1]/div[1]")})
	public List<WebElement> slider;

	@FindBy(xpath = "//*[@id=\"product-160\"]/div[2]/form/button")
	WebElement basketbtn;
	@FindBy(xpath = "//*[@id=\"product-160\"]/div[3]/ul/li[1]/a")
	WebElement des;
	@FindBy(xpath = "//*[@id=\"product-160\"]/div[3]/ul/li[2]/a")
	WebElement review;

	public TestPage() {
		init();
		PageFactory.initElements(driver, this);

	}

	public void click1() {
		submit.click();
	}

	public void click2() {
		homebtn.click();
	}

	public void click3() {
		link1.click();

	}

	public void click4() {
		link2.click();
	}

	public void click5() {
		link3.click();
	}

	public void Slide2() {
		((WebElement) slider).click();

	}

	public void Add_in_basket() {
		basketbtn.click();
	}

	public void description() {
		des.click();
	}

	public void reviews() {
		review.click();
	}

	public String getTitle() {
		return driver.getTitle();
	}
}
