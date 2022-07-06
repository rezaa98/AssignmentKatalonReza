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
Mobile.startExistingApplication(GlobalVariable.bundleID)

Mobile.waitForElementPresent(findTestObject('Object Repository/Cek Profile/Verify Screen - E-Commerce Android App'), GlobalVariable.timeOUT, 
    FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementNotExist(findTestObject('Object Repository/Cek Profile/Verify Screen - E-Commerce Android App'), 
    GlobalVariable.timeOUT, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Object Repository/Checkout/Button Back'), GlobalVariable.timeOUT)
}

Mobile.tap(findTestObject('Object Repository/Cek Category/Button Menu Category'), GlobalVariable.timeOUT)

Mobile.verifyElementExist(findTestObject('Object Repository/Cek Category/Screen Verif - Category'), GlobalVariable.timeOUT, 
    FailureHandling.STOP_ON_FAILURE)

//Mobile.tap(findTestObject('Object Repository/Cek Category/Button Search'), GlobalVariable.timeOUT)
//Mobile.setText(findTestObject('Object Repository/Cek Category/Text Field- Search'), 'Electronics', GlobalVariable.timeOUT)
device_Height = Mobile.getDeviceHeight()

device_Width = Mobile.getDeviceWidth()

int startX = device_Width / 2

int endX = startX

int startY = device_Height * 0.30

int endY = device_Height * 0.70

Mobile.swipe(startX, endY, endX, startY)

Mobile.tap(findTestObject('Object Repository/Cek Category/Category - Electronics  Gadgets'), GlobalVariable.timeOUT)

Mobile.waitForElementPresent(findTestObject('Object Repository/Cek Category/Screen Verif - Electronics  Gadgets'), GlobalVariable.timeOUT)

Mobile.verifyElementExist(findTestObject('Object Repository/Cek Category/Screen Verif - Electronics  Gadgets'), GlobalVariable.timeOUT, 
    FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Cek Category/CONTENT - Samsung Galaxy S10 - Black'), GlobalVariable.timeOUT)

Mobile.verifyElementExist(findTestObject('Object Repository/Cek Category/CONTENT - U17 USB Portable M3 HUmidifier Air Purifier LED Night Light 200ML'), 
    GlobalVariable.timeOUT)

Mobile.verifyElementExist(findTestObject('Object Repository/Cek Category/CONTENT - Apple watch series 3 GPS 42mm Black'), 
    GlobalVariable.timeOUT)

Mobile.verifyElementExist(findTestObject('Object Repository/Cek Category/CONTENT - Mini Digital Speaker TD-V26 USB FM Radio SD TF Card MP3 - Red'), 
    GlobalVariable.timeOUT)

Mobile.tap(findTestObject('Object Repository/Cek Category/Button BACK'), GlobalVariable.timeOUT)

Mobile.swipe(startX, startY, endX, endY)

Mobile.verifyElementExist(findTestObject('Object Repository/Cek Category/Screen Verif - Category'), GlobalVariable.timeOUT, 
    FailureHandling.STOP_ON_FAILURE)

//Mobile.tap(findTestObject('Object Repository/Cek Category/Button Search'), GlobalVariable.timeOUT)
//Mobile.setText(findTestObject('Object Repository/Cek Category/Text Field- Search'), 'Home', GlobalVariable.timeOUT)
Mobile.swipe(startX, endY, endX, startY)

Mobile.tap(findTestObject('Object Repository/Cek Category/Category - Home  Furniture'), GlobalVariable.timeOUT)

Mobile.waitForElementPresent(findTestObject('Object Repository/Cek Category/Screen Verif- Home  Furniture'), GlobalVariable.timeOUT)

Mobile.verifyElementExist(findTestObject('Object Repository/Cek Category/Screen Verif- Home  Furniture'), GlobalVariable.timeOUT, 
    FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Cek Category/CONTENT2 - Bathroom Toilet Wall Shelves A289'), 
    GlobalVariable.timeOUT)

Mobile.verifyElementExist(findTestObject('Object Repository/Cek Category/CONTENT2 - Copper Light 3 Battery Warm White - Fairy Light Battery'), 
    GlobalVariable.timeOUT)

Mobile.verifyElementExist(findTestObject('Object Repository/Cek Category/CONTENT2 - Bed Mosquito Net KL200  200 x 200 cm'), 
    GlobalVariable.timeOUT)

Mobile.verifyElementExist(findTestObject('Object Repository/Cek Category/CONTENT2 - Robot Vacuum Cleaner Wellcomm Home 2.0'), 
    GlobalVariable.timeOUT)

Mobile.verifyElementExist(findTestObject('Object Repository/Cek Category/CONTENT2 - Multifunction Stand Hanger'), GlobalVariable.timeOUT)

Mobile.tap(findTestObject('Object Repository/Cek Category/Button BACK'), GlobalVariable.timeOUT)

Mobile.swipe(startX, startY, endX, endY)

Mobile.verifyElementExist(findTestObject('Object Repository/Cek Category/Screen Verif - Category'), GlobalVariable.timeOUT, 
    FailureHandling.STOP_ON_FAILURE)

