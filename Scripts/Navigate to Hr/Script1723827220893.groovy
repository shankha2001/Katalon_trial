import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://apps.powerapps.com/play/e/e26ea34a-0824-eb20-94b9-e1a7ba4aa2d2/a/92634e1c-9476-4fca-b087-d2542c51dc29?connections=premiuhttps://apps.powerapps.com/play/e/e26ea34a-0824-eb20-94b9-e1a7ba4aa2d2/a/92634e1c-9476-4fca-b087-d2542c51dc29?connections=premiuhttps://apps.powerapps.com/play/e/e26ea34a-0824-eb20-94b9-e1a7ba4aa2d2/a/92634e1c-9476-4fca-b087-d2542c51dc29?connections=premium')

WebUI.setText(findTestObject('Object Repository/TimeSheet/Page_Sign in to your account/input_Sign in_loginfmt'), 'shankhadwip_t@pursuitsoftware.com')

WebUI.click(findTestObject('Object Repository/TimeSheet/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.waitForElementPresent(findTestObject('TimeSheet/Page_Sign in to your account/input_Enter password_passwd'), 3000)

WebUI.setText(findTestObject('Object Repository/TimeSheet/Page_Sign in to your account/input_Enter password_passwd'), 'S@ru0898')

WebUI.click(findTestObject('Object Repository/TimeSheet/Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/TimeSheet/Page_Sign in to your account/input_Do this to reduce the number of times_edee07'))

WebUI.click(findTestObject('Object Repository/TimeSheet/Page_Sign in to your account/input_concat(Don, , t show this again)_idBtn_Back'))

WebUI.waitForElementClickable(findTestObject('TimeSheet/Page_Timesheet - Power Apps/div_Item 3_appmagic-button middle center'), 
    60000)

WebUI.click(findTestObject('Object Repository/TimeSheet/Page_Timesheet - Power Apps/div_Item 3_appmagic-button middle center'))

WebUI.waitForElementPresent(findTestObject('TimeSheet/Page_Timesheet - Power Apps/div_This Week_appmagic-toggleSwitch-on'), 
    10000)

WebUI.click(findTestObject('Object Repository/TimeSheet/Page_Timesheet - Power Apps/div_This Week_appmagic-toggleSwitch-on'))

sleep(5000)

WebUI.closeBrowser()

