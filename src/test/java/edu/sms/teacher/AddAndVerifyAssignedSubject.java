package edu.sms.teacher;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.sms.genericutility.EncryptedDecryptedUtility;
import com.sms.genericutility.ExcelUtility;
import com.sms.genericutility.GetPropertyPath;
import com.sms.genericutility.ListBoxUtility;
import com.sms.genericutility.PropertyUtility;
import com.sms.genericutility.VerificationUtility;
import com.sms.genericutility.WaitUtility;
import com.sms.genericutility.WebDriverUtility;
import com.sms.genericutility.Base.BaseClass;
import com.sms.genericutility.Enums.ExcelKey;
import com.sms.genericutility.Enums.PropertyKey;
import com.sms.objectRepository.elements.AdminHomePage;
import com.sms.objectRepository.elements.AdminSubjectPage;
import com.sms.objectRepository.elements.HomePage;
import com.sms.objectRepository.elements.LoginPage;
import com.sms.objectRepository.elements.TeacherHomePage;
import com.sms.objectRepository.elements.TeacherSubjectPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddAndVerifyAssignedSubject extends BaseClass{
	
	@Test
	public void addAndVerifyAssignedSubject()
	{	
		LoginPage loginpage=new LoginPage(driver);
		AdminSubjectPage adminsubpage=new AdminSubjectPage(driver);
		AdminHomePage adminhomepage=new AdminHomePage(driver);
		HomePage homepage=new HomePage(driver);
		TeacherHomePage teacherhomepage=new TeacherHomePage(driver);
		TeacherSubjectPage teachersubpage=new TeacherSubjectPage(driver);
		
		//Excel info
		String testcasename = "AddAndVerifyAssignedSubject";
		String sheet = ExcelKey.GUARDIAN.getSheetName();
		Map<String, String> map = excel.getExcelData(sheet, testcasename);
		
		// Test Data
		String admin_un = property.getPropertyData(PropertyKey.ADMIN_UN);
		String admin_pwd =edutility.decoding(property.getPropertyData(PropertyKey.ADMIN_PWD));
		String teacher_un = property.getPropertyData(PropertyKey.TEACHER_UN);
		String teacher_pwd = property.getPropertyData(PropertyKey.TEACHER_PWD);
		long timeouts = Long.parseLong(property.getPropertyData(PropertyKey.TIMEOUTS));
		
		String expLogtitle=map.get("expLogtitle");
		String expHometitle=map.get("expHometitle");
		String subjectname=map.get("subject");
		String grade=map.get("grade_dropdown");
		String subject=map.get("subject_dropdown");
		String teacher = map.get("Teacher_dropdown");
		String fee=map.get("fee");
		String eResult=map.get("subject_dropdown");
		
		String login="login";
		String etitle=map.get("expLogtitle");	
		String atitle = driver.getTitle();
		
		SoftAssert a=new SoftAssert();
		a.assertEquals(etitle, atitle);
		//verify.loginPageVerify(etitle, atitle);		
 
		//admin login
		
		loginpage.loginAdmin(admin_un, admin_pwd);
		
		
		String home="home";
	    atitle=driver.getTitle();
		etitle=map.get("expHometitle");
	//	verify.HomePageVerify(etitle, atitle);
		a.assertEquals(etitle, atitle);
		
		
		//add subject 
		
		adminsubpage.clickOnSubjectTab(subjectname);
		
		String sub="Add subject";
	    atitle=driver.getCurrentUrl();
		etitle="http://rmgtestingserver/domain/Student_Management_System/view/subject.php";
	//	verify.pageVerify(etitle, atitle, sub);
		a.assertEquals(etitle, atitle);
		
		
		
		//EXPLICIT WAIT
		adminsubpage.explicitWait1(wait, timeouts, driver);
			
		//click on subject routine
		
		adminhomepage.clickOnSubjectRouteTab();
		adminsubpage.clickOnAddButton();
		
		String dd="Add subject route dropdown";
	    atitle=driver.getCurrentUrl();
		etitle="http://rmgtestingserver/domain/Student_Management_System/view/subject_routing.php";
	//	verify.pageVerify(etitle, atitle, dd);
		a.assertEquals(etitle, atitle);
		
		
		//dropdown addsubject route
		
		adminsubpage.addSubjectRouteDD(dropdown, grade, subject, teacher, fee);
		
		//EXPLICIT WAIT
		adminsubpage.explicitWait2(wait, timeouts, driver);
		
		//admin logout
		
		homepage.adminLogout();
		
		//teacher - kumar 
		loginpage.loginTeacher(teacher_un, teacher_pwd);
			
		teacherhomepage.clickOnSubjectTab();
		
		
		String aResult = teachersubpage.actualSubject();
		
		//teacher logout
		teacherhomepage.logout();
			
		//verify.singleVerify(aResult, eResult);
		a.assertEquals(etitle, atitle);
		
	}

}
