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

//String appFile = GlobalVariable.androidAPP
//Mobile.startApplication(appFile, true)
WebUI.comment('Start Aplication Ecommerce Android')

Mobile.startExistingApplication(GlobalVariable.bundleID)

Mobile.waitForElementPresent(findTestObject('Object Repository/Cek Profile/Verify Screen - E-Commerce Android App'), GlobalVariable.timeOUT, 
    FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Run If statement')

if (Mobile.verifyElementNotExist(findTestObject('Object Repository/Cek Profile/Verify Screen - E-Commerce Android App'), 
    GlobalVariable.timeOUT, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Object Repository/Checkout/Button Back'), GlobalVariable.timeOUT)
}

Mobile.tap(findTestObject('Object Repository/Cek Help/Button Menu Help'), GlobalVariable.timeOUT)

Mobile.verifyElementVisible(findTestObject('Object Repository/Cek Help/VERIFY SCREEN - Help'), GlobalVariable.timeOUT, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Cek Help/MENU HELP - How to order'), GlobalVariable.timeOUT)

Mobile.verifyElementVisible(findTestObject('Object Repository/Cek Help/VERIFY SCREEN - How to order'), GlobalVariable.timeOUT, 
    FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Cek Help/CONTENT TITLE- How To Order'), GlobalVariable.timeOUT, 
    FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Cek Help/CONTENT - How To Order'), GlobalVariable.timeOUT, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Cek Help/BUTTON BACK'), GlobalVariable.timeOUT)

Mobile.verifyElementVisible(findTestObject('Object Repository/Cek Help/VERIFY SCREEN - Help'), GlobalVariable.timeOUT, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Cek Help/MENU HELP - Payment'), GlobalVariable.timeOUT)

Mobile.verifyElementVisible(findTestObject('Object Repository/Cek Help/VERIFY SCREEN - Payment'), GlobalVariable.timeOUT, 
    FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Cek Help/CONTENT1 - Payment'), GlobalVariable.timeOUT, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Cek Help/CONTENT2 - Payment'), GlobalVariable.timeOUT, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Cek Help/CONTENT3 - Payment'), GlobalVariable.timeOUT, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Cek Help/BUTTON BACK'), GlobalVariable.timeOUT)

Mobile.verifyElementVisible(findTestObject('Object Repository/Cek Help/VERIFY SCREEN - Help'), GlobalVariable.timeOUT, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Cek Help/MENU HELP - Shipping'), GlobalVariable.timeOUT)

Mobile.verifyElementVisible(findTestObject('Object Repository/Cek Help/VERIFY SCREEN - Shipping'), GlobalVariable.timeOUT, 
    FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Cek Help/CONTENT1 - Shipping'), GlobalVariable.timeOUT, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Cek Help/CONTENT2 - Shipping'), GlobalVariable.timeOUT, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Cek Help/BUTTON BACK'), GlobalVariable.timeOUT)

Mobile.verifyElementVisible(findTestObject('Object Repository/Cek Help/VERIFY SCREEN - Help'), GlobalVariable.timeOUT, FailureHandling.STOP_ON_FAILURE)

