package users;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import org.testng.asserts.*;
import pomRepository.HomePage;

import pomRepository.TaskPage;

public class TC_CreateNewTasks_015 extends Base_Class{
	
	@Test
	public void Tasks() {
		ExcelUtil excelutility=new ExcelUtil();
		String name = excelutility.readAnyDataFromExcelInString("Sheet1", 3, 0);
		String projectname = excelutility.readAnyDataFromExcelInString("Sheet1", 4, 0);
		String sname = excelutility.readAnyDataFromExcelInString("Sheet1", 5, 0);
		String s1name = excelutility.readAnyDataFromExcelInString("Sheet1", 6, 0);
		String s2name = excelutility.readAnyDataFromExcelInString("Sheet1", 7, 0);
		String s3name = excelutility.readAnyDataFromExcelInString("Sheet1", 8, 0);
		String s4name = excelutility.readAnyDataFromExcelInString("Sheet1", 9, 0);
//		String expectedHomePageTitle = excelutility.readStringDataFromExcel("Sheet1",15,0);
//		String expectedTaskPageTitle = excelutility.readStringDataFromExcel("Sheet1",16,0);
	
		
		

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
	    taskpage.getClickonnewtask().click();
	    taskpage.getClickondropdownbutton1().click();
	    taskpage.getSelectnewcustomer().click();
	    taskpage.getEntercustomername().click();
	    taskpage.getEntercustomername().sendKeys(name);
	    taskpage.getEnterprojectname().click();
	  
	   WebDriverWait wait1 = new WebDriverWait(driver, 20);
	   wait1.until(ExpectedConditions.elementToBeClickable(taskpage.getEnterprojectname()));
	    taskpage.getEnterprojectname().sendKeys(projectname);
	    taskpage.getClickonentertaskname11().click();
	    taskpage.getClickonentertaskname11().sendKeys(sname);
	    taskpage.getClickonentertaskname22().click();
	    taskpage.getClickonentertaskname22().sendKeys(s1name);
	    taskpage.getClickonentertaskname33().click();
	    taskpage.getClickonentertaskname33().sendKeys(s2name);
	   
//	   taskpage.getClickonentertaskname4().click();
//	    taskpage.getClickonentertaskname4().sendKeys(s3name);
	    taskpage.getClickonentertaskname5().click();
	    taskpage.getClickonentertaskname5().sendKeys(s4name);
	      taskpage.getClickontypeofworkcheckbox().click();
	      taskpage.getClickoncreatetask().click();
	}
	
}
