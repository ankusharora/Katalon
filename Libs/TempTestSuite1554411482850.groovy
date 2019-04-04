import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/TS_Regression_Test')

suiteProperties.put('name', 'TS_Regression_Test')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\ktran\\Katalon Studio\\cloud_test2\\Reports\\TS_Regression_Test\\20190404_135802\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/TS_Regression_Test', suiteProperties, [new TestCaseBinding('Test Cases/Login_Tests/TC2_Login_Invalid', 'Test Cases/Login_Tests/TC2_Login_Invalid',  null), new TestCaseBinding('Test Cases/Login_Tests/TC1_Login_Valid', 'Test Cases/Login_Tests/TC1_Login_Valid',  null), new TestCaseBinding('Test Cases/Sites/Add Site/TC4_Add_One_Site', 'Test Cases/Sites/Add Site/TC4_Add_One_Site',  null), new TestCaseBinding('Test Cases/Sites/Add Site/TC5_Add_Multiple_Sites', 'Test Cases/Sites/Add Site/TC5_Add_Multiple_Sites',  null), new TestCaseBinding('Test Cases/Sites/Add Site/TC6_Add_Duplicate_Site', 'Test Cases/Sites/Add Site/TC6_Add_Duplicate_Site',  null), new TestCaseBinding('Test Cases/Sites/Delete Site/TC8_Delete_Multiple_Sites', 'Test Cases/Sites/Delete Site/TC8_Delete_Multiple_Sites',  null), new TestCaseBinding('Test Cases/Logout/TC3_Logout', 'Test Cases/Logout/TC3_Logout',  null)])
