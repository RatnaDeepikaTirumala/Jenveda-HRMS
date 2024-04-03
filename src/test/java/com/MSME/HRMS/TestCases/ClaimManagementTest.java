package com.MSME.HRMS.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MSME.HRMS.Base.BaseClass;
import com.MSME.HRMS.PageObjects.ClaimManagemntPage;
import com.MSME.HRMS.PageObjects.HomePage;
import com.MSME.HRMS.PageObjects.LoginPage;
import com.MSME.HRMS.Util.TestUtil;

public class ClaimManagementTest extends BaseClass {
	
	LoginPage loginPage;
	HomePage homePage;
	ClaimManagemntPage claimManagemntPage;
	
	String SheetName="claimManagement";

	public  ClaimManagementTest()
	{
		super();
	}
	
	@BeforeMethod
	public ClaimManagemntPage setUp() throws Throwable
	{
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.Login(prop.getProperty("tenantname"), prop.getProperty("username"), prop.getProperty("password"));
	    return claimManagemntPage=homePage.ClaimMngtIcon();
		
	}
	
	@DataProvider
	public Object[] [] getHRMSTestData()
	{
		Object[][] data=TestUtil.getTestData(SheetName);
		return data;
		
	}
	@Test(enabled = false, dataProvider = "getHRMSTestData")
	public void AddClaim( String EditClaimNum, String EmployeeName, String ClaimName, String ProjectName, String FromDate, String ToDate, String Amount, String Remarks, String ViewClaimNumber, String ApprovedAmount, String Reason) throws Throwable
	{
		homePage.ClaimMngtIcon();
		claimManagemntPage.addClaimMngt(EmployeeName, ClaimName, ProjectName, FromDate, ToDate, Amount, Remarks);
		Thread.sleep(3000);
	}
	
	@Test(enabled = false, dataProvider="getHRMSTestData")
	public void EditClaimMngt( String editClaimNumber, String employeeName, String claimName, String ProjectName, String fromDate, String toDate, String amount, String Remarks, String ViewClaimNumber, String ApprovedAmount, String Reason) throws Throwable
	{
		claimManagemntPage.editClaim( editClaimNumber, fromDate, toDate,amount, Remarks);
	}
	
	@Test(priority = 1, dataProvider = "getHRMSTestData")
	public void ViewClaimMngt(String EditClaimNumber, String EmployeeName, String ClaimName, String ProjectName, String FromDate, String ToDate, String Amount, String Remarks, String ViewClaimNumber, String ApprovedAmount, String Reason) throws Throwable
	{
		claimManagemntPage.viewClaimMngt(ViewClaimNumber, ApprovedAmount, Reason);
	}
	
	@Test(enabled = false)
	public  void GetAddedClaim()
	{
		claimManagemntPage.getNewAddClaimNumber();
	}
	
	
	  @AfterMethod 
	  public void tearDown() 
	  {
		  driver.quit();
	  }
	 
	 
}
