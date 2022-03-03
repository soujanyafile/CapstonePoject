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

public class TC_CreateNewProject_018 extends Base_Class{

	@Test
	public void Tasks() {
		ExcelUtil excelutility=new ExcelUtil();
		String pname = excelutility.readAnyDataFromExcelInString("Sheet1", 10, 0);
		String pdescription = excelutility.readAnyDataFromExcelInString("Sheet1", 11, 0);
		String entertask1 = excelutility.readAnyDataFromExcelInString("Sheet1", 12, 0);
		String entertask2= excelutility.readAnyDataFromExcelInString("Sheet1", 13, 0);
		String entertask3 = excelutility.readAnyDataFromExcelInString("Sheet1", 14, 0);
		
		
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
	    taskpage.getClickonAddnewproject().click();
	    taskpage.getClickonenterprojectname().click();
	    taskpage.getClickonenterprojectname().sendKeys(pname);
	   // taskpage.getClickcustomerfileld().click();
	   // taskpage.getClickgalaxy().click();
	taskpage.getSelectdropdownbutton().click(); 
	taskpage.getClickgalaxy().click();
	   // taskpage.getClicknewcustomer1().click();
	    
	  taskpage.getClickonprojectdescription().click();
	  taskpage.getClickonprojectdescription().sendKeys(pdescription);
	  taskpage.getClickonentertaskname1().click();
	  taskpage.getClickonentertaskname1().sendKeys(entertask1);
	  taskpage.getClickonentertaskname2().click();
	  taskpage.getClickonentertaskname2().sendKeys(entertask2);
	  taskpage.getClickonentertaskname3().click();
	  taskpage.getClickonentertaskname3().sendKeys(entertask3 );
	  taskpage.getClickoncreateprojectbutton().click();
	  
	    
	    
	    
	}
}
