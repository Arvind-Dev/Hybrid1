package com.Hybrid.hybrid.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;

import com.Hybrid.hybrid.Keywords;
import com.Hybrid.hybrid.util.DataUtil;
import com.Hybrid.hybrid.util.ExtentManager;
import com.Hybrid.hybrid.util.Xls_Reader;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseTest {
	public ExtentReports rep = ExtentManager.getInstance();
	public ExtentTest test;
	public Keywords app;
	public Xls_Reader xls ;
	public String testName;
	
	@AfterMethod
	public void quit(){
		if(rep!=null){
			rep.endTest(test);
			rep.flush();
		}
		// quit 
		if(app!=null)
			app.getGenericKeyWords().closeBrowser();
	}
	
	@DataProvider
	public Object[][] getData(){
		return DataUtil.getData(xls, testName);
	}
}
