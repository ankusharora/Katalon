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

for(int row = 1; row <= findTestData("Sites/TD_Sites").getRowNumbers(); row++){
	WebUI.comment('hi')
	
	WebUI.click(findTestObject('Page_HomePage/Site/Delete Site/delete_button'))
	
	WebUI.click(findTestObject('Page_HomePage/Site/Delete Site/span_Yes'))
	
	WebUI.verifyElementPresent(findTestObject('Page_HomePage/Site/Delete Site/div_Site has been deleted successfully.'), 2)
	
	WebUI.delay(2)
}
