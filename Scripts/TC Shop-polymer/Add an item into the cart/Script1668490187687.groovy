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

WebUI.navigateToUrl('https://shop.polymer-project.org/')

WebUI.verifyElementText(findTestObject('Object Repository/OR Shop-polymer/Page_Mens Outerwear - SHOP/a_SHOP'), 'SHOP')

WebUI.click(findTestObject('Object Repository/OR Shop-polymer/Page_Home - SHOP/a_Shop Now'))

WebUI.verifyElementText(findTestObject('Object Repository/OR Shop-polymer/Page_Mens Outerwear - SHOP/h1_Mens Outerwear'), 
    'Men\'s Outerwear')

WebUI.doubleClick(findTestObject('Object Repository/OR Shop-polymer/Page_Mens Tech Shell Full-Zip - SHOP/div_Mens Tech Shell Full-Zip'))

WebUI.click(findTestObject('Object Repository/OR Shop-polymer/Page_Mens Tech Shell Full-Zip - SHOP/button_Add to Cart'))

WebUI.verifyElementText(findTestObject('Object Repository/OR Shop-polymer/Page_Mens Tech Shell Full-Zip - SHOP/div_Added to cart'), 
    'Added to cart')

WebUI.click(findTestObject('Object Repository/OR Shop-polymer/Page_Mens Tech Shell Full-Zip - SHOP/a_View Cart'))

WebUI.click(findTestObject('Object Repository/OR Shop-polymer/Page_Your cart - SHOP/a_Checkout'))

WebUI.setText(findTestObject('Object Repository/OR Shop-polymer/Page_Checkout - SHOP/input_accountEmail'), 'mohit@katalon.com')

WebUI.setText(findTestObject('Object Repository/OR Shop-polymer/Page_Checkout - SHOP/input_ccName'), 'Mohit')

WebUI.setText(findTestObject('Object Repository/OR Shop-polymer/Page_Checkout - SHOP/input_ccNumber'), '1234567898763456')

WebUI.setText(findTestObject('Object Repository/OR Shop-polymer/Page_Checkout - SHOP/input_accountPhone'), '9876543215')

WebUI.setText(findTestObject('Object Repository/OR Shop-polymer/Page_Checkout - SHOP/input_shipAddress'), 'Address')

WebUI.setText(findTestObject('Object Repository/OR Shop-polymer/Page_Checkout - SHOP/input_shipCity'), 'City')

WebUI.setText(findTestObject('Object Repository/OR Shop-polymer/Page_Checkout - SHOP/input_ccCVV'), '255')

WebUI.setText(findTestObject('Object Repository/OR Shop-polymer/Page_Checkout - SHOP/input_shipState'), 'noida')

WebUI.setText(findTestObject('Object Repository/OR Shop-polymer/Page_Checkout - SHOP/input_shipZip'), '123456')

WebUI.click(findTestObject('Object Repository/OR Shop-polymer/Page_Checkout - SHOP/input_button'))

WebUI.verifyElementText(findTestObject('Object Repository/OR Shop-polymer/Page_Checkout - SHOP/p_Demo checkout process complete'), 
    'Demo checkout process complete.')

WebUI.click(findTestObject('Object Repository/OR Shop-polymer/Page_Checkout - SHOP/a_Finish'))

WebUI.closeBrowser()

