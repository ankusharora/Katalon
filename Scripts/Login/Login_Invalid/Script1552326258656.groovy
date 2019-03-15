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

WebUI.setText(findTestObject('Login/Page_Delphi/input_Username'), 
    'kaylat')

WebUI.setText(findTestObject('Login/Page_Delphi/input_Password'), 
    'invalid')

WebUI.click(findTestObject('Login/Page_Delphi/a_Login'))

WebUI.click(findTestObject('Object Repository/Login/Page_Delphi/div_Invalid username or password'))

WebUI.verifyElementPresent(findTestObject('Login/Page_Delphi/div_Invalid username or password'), 0)
