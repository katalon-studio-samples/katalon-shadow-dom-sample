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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://books-pwakit.appspot.com/')

WebUI.verifyElementText(findTestObject('Object Repository/OR Books/Page_Books/a_BOOKS'), 'BOOKS')

WebUI.setText(findTestObject('Object Repository/OR Books/Page_Books/inputinput'), 'automation')

WebUI.click(findTestObject('Object Repository/OR Books/Page_automation - Books/svg'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('OR Books/Page_automation - Books/h2_The Automation'))

WebUI.verifyElementText(findTestObject('Object Repository/OR Books/Page_The Automation Advantage Embrace/div_Bhaskar Ghosh, Rajendra Prasad, Gayathri Pallail - 2021'), 
    'Bhaskar Ghosh, Rajendra Prasad, Gayathri Pallail - 2021')

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('OR Books/Page_The Automation Advantage Embrace/h3_ISBN'), 10)

WebUI.verifyElementText(findTestObject('Object Repository/OR Books/Page_The Automation Advantage Embrace/li_Business  Economics'), 
    'Business & Economics')

WebUI.verifyElementText(findTestObject('Object Repository/OR Books/Page_The Automation Advantage Embrace/li_ISBN_10 1260473309'), 
    'ISBN_10: 1260473309')

WebUI.verifyElementText(findTestObject('Object Repository/OR Books/Page_The Automation Advantage Embrace/li_ISBN_13 9781260473308'), 
    'ISBN_13: 9781260473308')

WebUI.closeBrowser()

