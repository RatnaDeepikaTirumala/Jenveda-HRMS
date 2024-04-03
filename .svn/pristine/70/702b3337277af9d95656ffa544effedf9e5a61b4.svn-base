package com.MSME.HRMS.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MSME.HRMS.Base.BaseClass;

public class ClaimManagemntPage extends BaseClass{
	
	ControlFunctionalities cf= new ControlFunctionalities();

	@FindBy(xpath="//a[text()='Claim Management']")
	public WebElement claimMngtHdr;
	
	@FindBy(xpath="//div[@class='k-widget k-grid']")
	public WebElement claimMngtGrid;
	
	@FindBy(xpath="//span[contains(@class,'icon add-permi')]")
	public WebElement addIcon;
	
	@FindBy(xpath="//div[@data-tip='Edit']")
	public WebElement editIcon;
	
	@FindBy(xpath="//div[@data-tip='View']")
	public WebElement viewIcon;
	
	@FindBy(xpath="//span[@class='icon md hamburger cursor-pointer active']")
	public WebElement gridViewIcon;
	
	@FindBy(xpath="//span[@class='icon md menu-icon cursor-pointer']")
	public WebElement menuViewIcon;
	
	@FindBy(xpath="//h1[text()='Apply Claim']")
	public WebElement addPageHdr;
	
	@FindBy(xpath="//h5[text()='Clear Data']")
	public WebElement clearDataLink;
	
	@FindBy(xpath="//select[@name='employeeId']")
	public WebElement empNameCmb;
	
	@FindBy(xpath="//select[@name='claimTypeId']")
	public WebElement claimTypeCmb;
	
	@FindBy(xpath="//select[@name='projectId']")
	public WebElement projectCmb;
	
	@FindBy(xpath="//input[@name='fromDate']")
	public WebElement fromDateTxtbx;
	
	@FindBy(xpath="//input[@name='toDate']")
	public WebElement toDateTxtBx;
	
	@FindBy(xpath="//input[@name='amount']")
	public WebElement amountTxtBx;
	
	@FindBy(xpath="//input[@name='approvedAmount']")
	public WebElement approvedAmountTxtBx;
	
	@FindBy(xpath="//button[text()='Apply Claim']")
	public WebElement applyBtn;
	
	@FindBy(xpath="//h1[text()='Edit Claim']")
	public WebElement editClaimPageHdr;
	
	@FindBy(xpath="//span[text()='Submitted']/preceding-sibling::h1")
	public WebElement submittedClaimStateHdr;
	
	@FindBy(xpath="(//span[text()='Processed'])[11]")
	public WebElement processedStateClaimHdr;
	
	@FindBy(xpath="//h1[text()='View Claim']/following-sibling::span[text()='Processed']")
	public WebElement viewProcessedHdr;
	
	@FindBy(xpath="(//span[text()='Cancelled'])[2]")
	public WebElement cancelledStateClaimHdr;
	
	@FindBy(xpath="//h1[text()='View Claim']/following-sibling::span[text()='Approved']")
	public WebElement viewApproveHdr;
	
	@FindBy(xpath="//h1[text()='Edit Claim']/following-sibling::span[text()='Rejected']")
	public WebElement rejectedClaimHdr;
	
	@FindBy(xpath="//span[text()='Approved']/preceding-sibling::h1")
	public WebElement approvedClaimHdr;
	
	@FindBy(xpath="//textarea[@name='remarks']")
	public WebElement remarkstxtBx;
	
	@FindBy(xpath="//button[text()='Cancel Claim']")
	public WebElement cancelClaimBtn;
	
	@FindBy(xpath="//button[@class='w-full btn-13 custom-btn mt-3 gap-1']")
	public WebElement cancelBtn;
	
	@FindBy(xpath="//span[text()='Claim Limit :']/../..//span[2]")
	public WebElement claimLimit;
	
	@FindBy(xpath="//h1[text()='View Claim']")
	public WebElement viewPageHdr;
	
	@FindBy(xpath="//span[@class='k-icon k-i-arrow-s']")
	public WebElement recordPerPageCmb;
	
	@FindBy(xpath="//div[contains(@class,'grid lg:grid-cols-3 xl:grid')]")
	public WebElement menuGrid;
	
	@FindBy(xpath="//button[text()='All']")
	public WebElement allButton;
	
	@FindBy(xpath="//button[@class='w-full btn-14 cvf custom-btn']")
	public WebElement verifiedBtn;
	
	@FindBy(xpath="//button[text()='Approved']")
	public WebElement approvedBtn;
	
	@FindBy(xpath="//button[text()='Processed']")
	public WebElement processedBtn;
	
	@FindBy(xpath="//button[text()='Rejected']")
	public WebElement rejectedBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter Employee Name']")
	public WebElement searchBar;
	
	@FindBy(xpath="//p[text()='Verified']/..//h1")
	public WebElement verifiedTab;
	
	@FindBy(xpath="//p[text()='Approved']/..//h1")
	public WebElement approvedTab;
	
	@FindBy(xpath="//p[text()='Processed']/..//h1")
	public WebElement processedTab;
	
	@FindBy(xpath="//p[text()='Rejected']/..//h1")
	public WebElement rejectedTab;
	
	@FindBy(xpath="//div[@class='error-msg flex justify-between align-top mt-2.5 mb-7']']")
	public WebElement errorTag;
	
    @FindBy(xpath="//span[@class='k-select']")
    public WebElement pagePerDownCmb;
    
    @FindBy(xpath="//li[text()='All']")
	 public WebElement all;
	
	@FindBy(xpath="//button[text()=' Verify']")
	public WebElement verifyBtn;
    
    @FindBy(xpath="//button[@class='w-full btn-14 cvf custom-btn']")
    public WebElement approveBtn;
    
    @FindBy(xpath="//textarea[@name='reason']")
    public WebElement reasonTxtBx;
    
    @FindBy(xpath="//button[text()=' Process']")
    public WebElement processBtn;
    
    @FindBy(xpath="//h1[text()='View Claim']/following-sibling::span[text()='Cancelled']")
    public WebElement viewCancelHdr;
    
    @FindBy(xpath="//h1[text()='View Claim']/following-sibling::span[text()='Verified']")
    public WebElement viewVerifiedClaimHdr;
    
   // @FindBy(xpath="//button[@class='w-full btn-14 cvf custom-btn']")
    //public WeElement approveBtn;
    
	String SubmitClaimState="Submitted";
    String CancelClaimState;
    String RejectedState;
    String ProcessedState;
	
	public ClaimManagemntPage()
	{
	  PageFactory.initElements(driver, this);
	}
	
	public boolean verifiyClaimMngtHdr() throws Throwable
	{
		Thread.sleep(3000);
		return claimMngtHdr.isDisplayed();
	}
	
	public boolean verifiyGrid() throws InterruptedException
	{
		Thread.sleep(3000);
		return claimMngtGrid.isDisplayed();
	}
	
	public void verifiyError()
	{
		if(errorTag.isDisplayed()==true)
		{
			System.out.println(errorTag.getText());
		}
		else
		{
			System.out.println("---------------No Error Found------------");
			return;
		}
	}
	
	public void addClaimMngt(String employeeName, String claimName, String ProjectName, String fromDate, String toDate, String amount, String Remarks) throws Throwable
	{
		cf.selectElement(addIcon, 3000);
		Thread.sleep(3000);
		if(addPageHdr.isDisplayed()==true)
		{
			cf.setValue(empNameCmb, employeeName, 3000);
			cf.setValue(claimTypeCmb, claimName, 3000);
			Thread.sleep(3000);
			cf.setValue(projectCmb, ProjectName, 3000);
			cf.setValue(fromDateTxtbx, fromDate, 3000);
			Thread.sleep(3000);
			cf.setValue(toDateTxtBx, toDate, 3000);
			cf.setValue(amountTxtBx, amount, 3000);
			Thread.sleep(3000);
            cf.setValue(remarkstxtBx, Remarks, 3000);
            Thread.sleep(3000);
            applyBtn.click();
        	Thread.sleep(3000);
			verifiyError();
			Thread.sleep(3000);
			if(claimMngtHdr.isDisplayed())
			{
				System.out.println("---------------Apply-Claim-Test-Pass--------------");
			}
		}
		
	}
	
	public void editClaim( String editClaimNumber,String fromDate, String toDate, String amount, String Remarks) throws Throwable
	{
		pagePerDownCmb.click();
		all.click();
	    allButton.click();
	    Thread.sleep(3000);
	    selectClaimMngtCheckBx(editClaimNumber).click();
	    editIcon.click();
	    Thread.sleep(3000);
		if(cf.iselementExists(submittedClaimStateHdr)==true)
		{
			cf.waitforElement(submittedClaimStateHdr, 3000);
			cf.setValue(fromDateTxtbx, fromDate, 3000);
			cf.setValue(toDateTxtBx, toDate, 3000);
			Thread.sleep(3000);
			cf.setValue(amountTxtBx, amount, 3000);
			cf.setValue(remarkstxtBx, Remarks, 3000);
			Thread.sleep(3000);
			applyBtn.click();
			Thread.sleep(3000);
			if(verifiyClaimMngtHdr())
			{
				System.out.println("--------------The Submitted State Claim is Tested------------");
                return;		
			}
		}
		else if  (cf.iselementExists(cancelledStateClaimHdr)==true) 
		{
			Thread.sleep(3000);
			cancelBtn.click();
			Thread.sleep(3000);
			if(claimMngtGrid.isDisplayed())
			{
				System.out.println("-----------The Cancelled State Claim is Tested-------------");
	            return;		
			}
		}
		else if (cf.iselementExists(processedStateClaimHdr)==true)
		 {
			 Thread.sleep(3000);
			 cancelBtn.click();
			 Thread.sleep(3000);
			 verifiyError();
			 if(claimMngtHdr.isDisplayed())
			 {
				 System.out.println("----------The Processed State Claim is Tested-----------");
			     return;
			 }
		 }
		  if  (cf.iselementExists(rejectedClaimHdr)==true)
		 {
				Thread.sleep(3000);
				cancelBtn.click();
				Thread.sleep(3000);
				if(claimMngtGrid.isDisplayed())
				{
					System.out.println("-----------The Rejected State Claim is Tested-------------");
		            return;		
		 
				}
		 }
		  
		 if(cf.iselementExists(approvedClaimHdr)==true)
		 {
			 Thread.sleep(3000);
				cancelBtn.click();
				Thread.sleep(3000);
				if(claimMngtGrid.isDisplayed())
				{
					System.out.println("-----------The Rejected State Claim is Tested-------------");
		            return;		
		 
				}
		 }
	}
	
	public void viewClaimMngt(String viewClaimNumber, String approvedAmount, String reason) throws Throwable
	{
		pagePerDownCmb.click();
		all.click();
		Thread.sleep(3000);
		processedTab.click();
		Thread.sleep(3000);
	    selectClaimMngtCheckBx(viewClaimNumber).click();
	    Thread.sleep(3000);
	    viewIcon.click();
	    if (cf.iselementExists(submittedClaimStateHdr)==true) 
	    {
			cf.setValue(approvedAmountTxtBx, approvedAmount, 3000);
			cf.setValue(reasonTxtBx, reason, 3000);
			cf.selectElement(verifiedBtn, 3000);
			verifiyClaimMngtHdr();
			System.out.println("-------The Submitted Claim is Verified--------");
			return;
		}
	    else if(cf.iselementExists(viewVerifiedClaimHdr)==true)
	    {
	    	System.out.println("hhhhhhhhhhhhhh");
	    	cf.setValue(approvedAmountTxtBx, approvedAmount, 3000);
			cf.setValue(reasonTxtBx, reason, 3000);
			cf.selectElement(approveBtn, 3000);
			verifiyClaimMngtHdr();
			System.out.println("-------The Verifed Claim is Verified--------");
			return;
	    }
	    else if(cf.iselementExists(viewCancelHdr)==true)
	   {
	    	System.out.println("--------The Cancelled Claim is Viewed--------");
		   cancelBtn.click();
		   verifiyClaimMngtHdr();
		   System.out.println("--------The Cancelled Claim is Viewed--------");
		   return;
	   }
	   
	    else  if(cf.iselementExists(viewProcessedHdr)==true)
	   {
	    	  System.out.println("--------The Processed Claim is Viewed--------");
	    	cancelBtn.click();
		   verifiyClaimMngtHdr();
		   System.out.println("--------The Processed Claim is Viewed--------");
		   return;
	   }
	   
	    else  if(cf.iselementExists(rejectedClaimHdr)==true)
	   {
	    	 System.out.println("--------The Rejected Claim is Viewed--------");
		   cancelBtn.click();
		   verifiyClaimMngtHdr();
		   System.out.println("--------The Rejected Claim is Viewed--------");
		   return;
	   }
	   
	    else  if(cf.iselementExists(viewApproveHdr)==true)
	   {
	    	System.out.println("--------The Approve-------");
	    	processBtn.click();
		   verifiyClaimMngtHdr();
		   System.out.println("--------The Approved Claim is Viewed--------");
		   return;
	   }
	   
	}
	
	public WebElement verifiyClaimState(String EditClaimNumber, long timeout)
	{
		return driver.findElement(By.xpath("//td[text()='"+EditClaimNumber+"']/following-sibling::td[7]//div//div//span"));
	}
	
	public WebElement selectClaimMngtCheckBx(String ClaimMngtNumber)
	{
		return driver.findElement(By.xpath("//td[text()='"+ClaimMngtNumber+"']/preceding-sibling::td//div[@class='text-center']"));
		 
	}
	
	String AddClaimNumber;
	
	public void getNewAddClaimNumber()
	{
		AddClaimNumber=driver.findElement(By.xpath("//tr[@class='k-master-row' and @aria-rowindex='2']/..//td[2]")).getText();
	    System.out.println(AddClaimNumber);
		return;
	}
}
