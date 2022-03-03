package users;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.HomePage;

import pomRepository.TaskPage;

public class TC_CreateNewCustomer_014 extends Base_Class{
	
	@Test
	public void Tasks() {
		ExcelUtil excelutility=new ExcelUtil();
		String name = excelutility.readAnyDataFromExcelInString("Sheet1", 0, 0);
		String description=excelutility.readAnyDataFromExcelInString("Sheet1", 1,0);
//		String expectedHomePageTitle=excelutility.readAnyDataFromExcelInString("Sheet1", 15,0);
//		String expectedTaskPageTitle=excelutility.readAnyDataFromExcelInString("Sheet1", 16,0);
//		
//		Assert.assertEquals(driver.getTitle(), expectedHomePageTitle, "Home Page is not displayed");
//		Reporter.log("Home Page is displayed", true);
//	    
		
	    HomePage home =  new HomePage(driver);
	    home.getClickOnTasksButton().click();
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    String expectedTaskPageTitle = excelutility.readAnyDataFromExcelInString("Sheet1", 16, 0);
	    wait.until(ExpectedConditions.titleContains(expectedTaskPageTitle));
	    String actualTaskPageTitle = driver.getTitle();
	    Assert.assertEquals(actualTaskPageTitle, expectedTaskPageTitle, "Task Page is not displayed");
		Reporter.log("Task Page is displayed", true);
    
	    TaskPage taskpage = new TaskPage(driver);
	    taskpage.getClickonAddnewbutton().click();
	    taskpage.getClickonnewcustomerbutton().click();
	    taskpage.getClickonentercustomername().sendKeys(name);
	    taskpage.getClickonentercustomerdescription().sendKeys(description);
	    taskpage.getClickonselectcustomertextfield().click();
	    taskpage.getClickonbigbangcomapny().click();
	    taskpage.getClickoncreatecustomerbutton().click();

		
	}
}

