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

//WebUI.openBrowser('')

//WebUI.navigateToUrl('http://ec2-54-148-80-155.us-west-2.compute.amazonaws.com:8080/Sites/#/site')

WebUI.click(findTestObject('Page_HomePage/Site/Add Site/a_Add Site'))

WebUI.click(findTestObject('Page_HomePage/Site/Add Site/label_Enter Site Name'))

WebUI.setText(findTestObject('Page_HomePage/Site/Add Site/input__siteName'), findTestData("Sites/TD_Sites").getValue(1,1))

WebUI.click(findTestObject('Page_HomePage/Site/Add Site/label_Enter Address'))

WebUI.setText(findTestObject('Page_HomePage/Site/Add Site/input_Enter Site Name_address'), findTestData("Sites/TD_Sites").getValue(2,1))

WebUI.click(findTestObject('Page_HomePage/Site/Add Site/label_Enter City'))

WebUI.setText(findTestObject('Page_HomePage/Site/Add Site/input_Enter Address_city'), findTestData("Sites/TD_Sites").getValue(3,1))

WebUI.click(findTestObject('Page_HomePage/Site/Add Site/label_Enter State'))

WebUI.setText(findTestObject('Page_HomePage/Site/Add Site/input_Enter City_state'), findTestData("Sites/TD_Sites").getValue(4,1))

WebUI.click(findTestObject('Page_HomePage/Site/Add Site/a_NEXT'))

WebUI.setText(findTestObject('Page_HomePage/Site/Add Site/input_NEXT_country'), findTestData("Sites/TD_Sites").getValue(5,1))

WebUI.click(findTestObject('Page_HomePage/Site/Add Site/label_Enter ZIP Code'))

WebUI.setText(findTestObject('Page_HomePage/Site/Add Site/input_Enter Country_ZIP'), findTestData("Sites/TD_Sites").getValue(6,1))

WebUI.click(findTestObject('Page_HomePage/Site/Add Site/label_Enter Contact Name'))

WebUI.setText(findTestObject('Page_HomePage/Site/Add Site/input_Enter ZIP Code_cName'), findTestData("Sites/TD_Sites").getValue(7,1))

WebUI.click(findTestObject('Page_HomePage/Site/Add Site/label_Enter Location Phone Number'))

WebUI.setText(findTestObject('Page_HomePage/Site/Add Site/input_Enter Contact Name_locationPhone'), findTestData("Sites/TD_Sites").getValue(8,1))

WebUI.click(findTestObject('Page_HomePage/Site/Add Site/a_NEXT_1'))

WebUI.click(findTestObject('Page_HomePage/Site/Add Site/a_Next (1)'))

WebUI.click(findTestObject('Page_HomePage/Site/Add Site/a_Copy to all'))

WebUI.verifyElementPresent(findTestObject('Page_HomePage/Site/Add Site/div_Success'), 20)

WebUI.click(findTestObject('Page_HomePage/Site/Add Site/a_Next_1 (1)'))

WebUI.click(findTestObject('Page_HomePage/Site/Add Site/a_Finish'))

WebUI.verifyElementPresent(findTestObject('Page_HomePage/Site/Add Site/div_Success'), 20)

WebUI.delay(2)

