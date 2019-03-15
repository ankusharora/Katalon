import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://ec2-54-148-80-155.us-west-2.compute.amazonaws.com:8080/Sites/#/login')

String startPage = WebUI.getUrl()

assert startPage == "http://ec2-54-148-80-155.us-west-2.compute.amazonaws.com:8080/Sites/#/login"

WebUI.setText(findTestObject('Login/Page_Delphi/input_Username'),
	Username)

WebUI.setText(findTestObject('Login/Page_Delphi/input_Password'),
	Password)

WebUI.click(findTestObject('Login/Page_Delphi/a_Login'))

WebUI.delay(2)

String signedInPage = WebUI.getUrl()

assert signedInPage == "http://ec2-54-148-80-155.us-west-2.compute.amazonaws.com:8080/Sites/#/site"

WebUI.click(findTestObject('Login/Page_SignedIn/i_Add Site_upDownIcon'))

WebUI.delay(1)

WebUI.click(findTestObject('Login/Page_SignedIn/a_Sign Out'))

WebUI.closeBrowser()



