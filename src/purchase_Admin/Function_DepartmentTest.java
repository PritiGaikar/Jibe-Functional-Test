package purchase_Admin;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Function.WebDriverPass;

public class Function_DepartmentTest extends WebDriverPass{


	protected ExtentReports report;
	protected ExtentTest test;
	
	Function_Department w = new Function_Department();
	

   @Test(priority=29)
  public void FunctionDepartment() throws Exception {
	   test=report.startTest("Function Department");	  
	   w.FunctionDepartment(driver);
	   Assert.assertTrue(true);
	  test.log(LogStatus.PASS, "Purchase-->Admin-->Function Department"); 
	  System.out.println("Function Department URL open successfully");
  }
   @Test(priority=30) 
   public void NegativeTestAddFunctionDepartment() throws Exception {
 	   test=report.startTest("Negative Test Add Function Department");	  
 	   w.NegativeTestAddFunctionDepartment(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Negative Test Add Function Department"); 
 	 System.out.println("Negative Test Case for Add Function Department is executed successfully");
   }
   @Test(priority=31) 
   public void AddFunctionDepartment() throws Exception {
 	   test=report.startTest("Add Function Department");	  
 	   w.AddFunctionDepartment(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Add Function Department"); 
 	 System.out.println("Positive Test Case for Add Function Department is executed successfully");
 	 
   }
   
   @Test(priority=32)   
   public void EditFunctionDepartment() throws Exception {
 	   test=report.startTest("Edit Function Department");	  
 	   w.EditFunctionDepartment(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Edit Function Department"); 
 	 System.out.println("Edit Function Department is executed successfully ");
 	
   }
   
 @Test(priority=33)
   
   public void DeleteFunctionDepartment() throws Exception {
 	   test=report.startTest("Delete Function Department");	  
 	   w.DeleteFunctionDepartment(driver);
 	   Assert.assertTrue(true);
 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Delete Function Department"); 
 	 System.out.println("Delete Function Department is executed successfully ");
 	
   }
   
   @AfterMethod
  	public void afterMethod(ITestResult result) {
  	    if (result.getStatus() == ITestResult.FAILURE) {
  	        test.log(LogStatus.FAIL, "Test failed " + result.getThrowable());
  	    } else if (result.getStatus() == ITestResult.SKIP) {
  	        test.log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
  	    } else {
  	        test.log(LogStatus.PASS, "Test passed");
  	    }
  	    report.endTest(test);
  	    report.flush();
  }
   @BeforeSuite
   public void beforeSu() {
	   report = LOTestingLabList.getReporter(path.concat("Report\\Purchase_Admin_Report.html"));		 }
   
 /*  @AfterSuite
  public void afterSu() {
       report.close();
   }*/
}

