package pomRepository;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

	
		public TaskPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}





@FindBy(xpath = "//div[text()='+ New Customer']")
private WebElement clickonnewcustomerbutton;

public  WebElement getClickonnewcustomerbutton() {
	return clickonnewcustomerbutton;
} 
@FindBy(xpath="//span[text()='Create New Customer']/../../../../../..//input[@placeholder='Enter Customer Name']")
private WebElement Clickonentercustomername;


public WebElement getClickonentercustomername() {
	return Clickonentercustomername;
}


@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
private WebElement Clickonentercustomerdescription;

public WebElement getClickonentercustomerdescription() {
	return Clickonentercustomerdescription;
}

@FindBy(xpath = "(//div[@class='customerImportDivTitle']/..//div[text()='- Select Customer -'])[1]")
private WebElement clickonselectcustomertextfield;


public WebElement getClickonselectcustomertextfield() {
	return clickonselectcustomertextfield;
}






@FindBy(xpath = "//div[@class='customerImportDivTitle']/..//div[text()='Big Bang Company']")
private WebElement clickonbigbangcomapny;


public WebElement getClickonbigbangcomapny() {
	return clickonbigbangcomapny;
}





@FindBy(xpath = "//div[text()='Create Customer']")
private WebElement clickoncreatecustomerbutton;

public WebElement getClickoncreatecustomerbutton() {
	return clickoncreatecustomerbutton;
}





@FindBy(xpath ="//div[text()='Add New']")
private WebElement clickonAddnewbutton;

public  WebElement getClickonAddnewbutton() {
	return clickonAddnewbutton;
}
@FindBy(xpath = "//div[text()='+ New Project']")
private WebElement clickonAddnewproject;

public WebElement getClickonAddnewproject() {
	return clickonAddnewproject;
}
@FindBy(xpath = "//span[text()='Create New Project']/../../../../../..//input[@placeholder='Enter Project Name']")
private  WebElement clickonenterprojectname;



public WebElement getClickonenterprojectname() {
	return clickonenterprojectname;
}

@FindBy(xpath = "//span[text()='Create New Project']/../../../../../..//div[text()='-- Please Select Customer to Add Project for  --']")
private WebElement clickcustomerfileld;



public WebElement getClickcustomerfileld() {
	return clickcustomerfileld;
}
@FindBy(xpath = "(//div[text()='Customer:']/..//div[text()='Galaxy Corporation'])[1]")
private WebElement clickgalaxy;

public WebElement getClickgalaxy() {
	return clickgalaxy;
}
@FindBy(xpath = "//div[text()='Customer:']/..//div[@class='dropdownButton']")
private WebElement selectdropdownbutton;




public WebElement getSelectdropdownbutton() {
	return selectdropdownbutton;
}





@FindBy(xpath = "(//div[text()='Customer:']/..//div[text()='-- New Customer --'])[2]")
private WebElement clicknewcustomer1;




public WebElement getClicknewcustomer1() {
	return clicknewcustomer1;
}





@FindBy(xpath = "(//div[text()='Capstone project'])[1]")
private WebElement clickoncapstoneproject;

public WebElement getClickoncapstoneproject() {
	return clickoncapstoneproject;
}
@FindBy(xpath = "(//textarea[@class='textarea'])[9]")
private WebElement clickonprojectdescription;

public WebElement getClickonprojectdescription() {
	return clickonprojectdescription;
}
@FindBy(xpath = "(//input[@placeholder='Enter task name'])[1]")
private WebElement clickonentertaskname1;



public WebElement getClickonentertaskname1() {
	return clickonentertaskname1;
}

@FindBy(xpath = "(//input[@placeholder='Enter task name'])[2]")
private WebElement clickonentertaskname2;

public WebElement getClickonentertaskname2() {
	return clickonentertaskname2;
}
@FindBy(xpath = "(//input[@placeholder='Enter task name'])[3]")
private WebElement clickonentertaskname3;

public WebElement getClickonentertaskname3() {
	return clickonentertaskname3;
}
@FindBy(xpath = "(//div[@class='components_button_label'])[17]")
private WebElement clickoncreateprojectbutton;

public WebElement getClickoncreateprojectbutton() {
	return clickoncreateprojectbutton;
}





@FindBy(xpath = "//div[text()='+ New Tasks']")
private WebElement clickonnewtask;

public WebElement getClickonnewtask() {
	return clickonnewtask;
}
@FindBy(xpath = "//div[text()='- Select Customer -']")
private WebElement clickonselectcustomer;

public WebElement getClickonselectcustomer() {
	return clickonselectcustomer;
}





@FindBy(xpath = "(//div[text()='Select Customer and Project to Add Tasks for']/..//div[@class='dropdownButton'])[1]")
private WebElement clickondropdownbutton1;

public WebElement getClickondropdownbutton1() {
	return clickondropdownbutton1;
}

@FindBy(xpath = "//div[text()='Select Customer and Project to Add Tasks for']/.. //div[text()='- New Customer -']")
private WebElement selectnewcustomer;



public WebElement getSelectnewcustomer() {
	return selectnewcustomer;
}


@FindBy(xpath = "//div[text()='Select Customer and Project to Add Tasks for']/..//input[@placeholder=\"Enter Customer Name\"]")
private WebElement entercustomername;


public WebElement getEntercustomername() {
	return entercustomername;
}

@FindBy(xpath = "//div[text()='Select Customer and Project to Add Tasks for']/..//input[@placeholder='Enter Project Name']")
private WebElement enterprojectname;



public WebElement getEnterprojectname() {
	return enterprojectname;
}





@FindBy(xpath = "//div[contains(@class,'projectSelector')]/..//div[@class='dropdownButton']")
private WebElement clickondropdownbutton;

public WebElement getClickondropdownbutton() {
	return clickondropdownbutton;
}

@FindBy(xpath = "(//div[text()='Flight operations'])[3]")
private WebElement selectflightoperations;

public WebElement getSelectflightoperations() {
	return selectflightoperations;
}

@FindBy(xpath = "(//input[@class='inputFieldWithPlaceholder'])[1]")
private WebElement clickonentertaskname11;




public WebElement getClickonentertaskname11() {
	return clickonentertaskname11;
}


@FindBy(xpath = "(//input[@class='inputFieldWithPlaceholder'])[3]")
private WebElement clickonentertaskname22;




public WebElement getClickonentertaskname22() {
	return clickonentertaskname22;
}


@FindBy(xpath = "(//input[@class='inputFieldWithPlaceholder'])[5]")
private WebElement clickonentertaskname33;



public WebElement getClickonentertaskname33() {
	return clickonentertaskname33;
}


@FindBy(xpath = "(//input[@class='inputFieldWithPlaceholder'])[7]")
private WebElement clickonentertaskname4;

public WebElement getClickonentertaskname4() {
	return clickonentertaskname4;
}

@FindBy(xpath = "(//input[@class='inputFieldWithPlaceholder'])[9]")
private WebElement clickonentertaskname5;

public WebElement getClickonentertaskname5() {
	return clickonentertaskname5;
}


@FindBy(xpath = "//div[text()='New tasks']/../..//span[@class='checkmark checkMark']")
private WebElement clickontypeofworkcheckbox;

public WebElement getClickontypeofworkcheckbox() {
	return clickontypeofworkcheckbox;
}

@FindBy (xpath = "//div[text()='Create Tasks']")
private WebElement clickoncreatetask;

public WebElement getClickoncreatetask() {
	return clickoncreatetask;
}
}




