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

Mobile.waitForElementPresent(findTestObject('Cek Profile/Verify Screen - E-Commerce Android App'), GlobalVariable.timeOUT, 
    FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementNotExist(findTestObject('Object Repository/Cek Profile/Verify Screen - E-Commerce Android App'), 
    GlobalVariable.timeOUT, FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Object Repository/Checkout/Button Back'), GlobalVariable.timeOUT)
}

Mobile.delay(GlobalVariable.timeOUT)

Mobile.tap(findTestObject('Checkout/Icon CART1'), GlobalVariable.timeOUT)

Mobile.waitForElementPresent(findTestObject('Object Repository/Checkout/Verify SCREEN - Shopping Cart'), GlobalVariable.timeOUT, 
    FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementVisible(findTestObject('Object Repository/Checkout/CEK PRODUCT IN CART'), GlobalVariable.timeOUT, 
    FailureHandling.OPTIONAL)) {
    Mobile.tap(findTestObject('Object Repository/Checkout/BUTTON - CHECKOUT'), GlobalVariable.timeOUT)

    Mobile.verifyElementVisible(findTestObject('Object Repository/Checkout/screen verif - Checkout'), GlobalVariable.timeOUT, 
        FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Object Repository/Checkout/pilih shipping - TNT Express'), GlobalVariable.timeOUT)

    Mobile.tap(findTestObject('Object Repository/Checkout/Shipping - DHL Express'), GlobalVariable.timeOUT)

    Mobile.tap(findTestObject('Object Repository/Checkout/BUTTON - PROCESS CHECKOUT'), GlobalVariable.timeOUT)

    Mobile.waitForElementPresent(findTestObject('Object Repository/Checkout/POPUP CHECKOUT - Process Checkout'), GlobalVariable.timeOUT, 
        FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Object Repository/Checkout/POPUP CHECKOUT - YES'), GlobalVariable.timeOUT)

    Mobile.waitForElementPresent(findTestObject('Object Repository/Checkout/POPUP WAITING CHECKOUT - Please wait'), GlobalVariable.timeOUT, 
        FailureHandling.STOP_ON_FAILURE)

    Mobile.waitForElementPresent(findTestObject('Object Repository/Checkout/POPUP SUKSES ORDER - Congratulation'), GlobalVariable.timeOUT, 
        FailureHandling.STOP_ON_FAILURE)

    if (Mobile.verifyElementNotVisible(findTestObject('Object Repository/Checkout/POPUP SUKSES ORDER - Congratulation'), 
        GlobalVariable.timeOUT, FailureHandling.OPTIONAL)) {
        Mobile.tap(findTestObject('Object Repository/Checkout/BUTTON - PROCESS CHECKOUT'), GlobalVariable.timeOUT)

        Mobile.waitForElementPresent(findTestObject('Object Repository/Checkout/POPUP CHECKOUT - Process Checkout'), GlobalVariable.timeOUT, 
            FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Object Repository/Checkout/POPUP CHECKOUT - YES'), GlobalVariable.timeOUT)

        Mobile.waitForElementPresent(findTestObject('Object Repository/Checkout/POPUP WAITING CHECKOUT - Please wait'), 
            GlobalVariable.timeOUT, FailureHandling.STOP_ON_FAILURE)

        Mobile.waitForElementPresent(findTestObject('Object Repository/Checkout/POPUP SUKSES ORDER - Congratulation'), GlobalVariable.timeOUT, 
            FailureHandling.STOP_ON_FAILURE)
    }
    
    Mobile.tap(findTestObject('Object Repository/Checkout/BUTTON POPUP SUKSES ORDER - OK'), GlobalVariable.timeOUT)

    Mobile.waitForElementPresent(findTestObject('Object Repository/Cek Profile/Verify Screen - E-Commerce Android App'), 
        GlobalVariable.timeOUT, FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.callTestCase(findTestCase('ECOM_007'), [:], FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Object Repository/Checkout/Icon CART1'), GlobalVariable.timeOUT)

    Mobile.tap(findTestObject('Object Repository/Checkout/BUTTON - CHECKOUT'), GlobalVariable.timeOUT)

    Mobile.verifyElementVisible(findTestObject('Object Repository/Checkout/screen verif - Checkout'), GlobalVariable.timeOUT, 
        FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Object Repository/Checkout/pilih shipping - TNT Express'), GlobalVariable.timeOUT)

    Mobile.tap(findTestObject('Object Repository/Checkout/Shipping - DHL Express'), GlobalVariable.timeOUT)

    Mobile.tap(findTestObject('Object Repository/Checkout/BUTTON - PROCESS CHECKOUT'), GlobalVariable.timeOUT)

    Mobile.waitForElementPresent(findTestObject('Object Repository/Checkout/POPUP CHECKOUT - Process Checkout'), GlobalVariable.timeOUT, 
        FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Object Repository/Checkout/POPUP CHECKOUT - YES'), GlobalVariable.timeOUT)

    Mobile.waitForElementPresent(findTestObject('Object Repository/Checkout/POPUP WAITING CHECKOUT - Please wait'), GlobalVariable.timeOUT, 
        FailureHandling.STOP_ON_FAILURE)

    Mobile.waitForElementPresent(findTestObject('Object Repository/Checkout/POPUP SUKSES ORDER - Congratulation'), GlobalVariable.timeOUT, 
        FailureHandling.STOP_ON_FAILURE)

    Mobile.tap(findTestObject('Object Repository/Checkout/BUTTON POPUP SUKSES ORDER - OK'), GlobalVariable.timeOUT)

    Mobile.waitForElementPresent(findTestObject('Object Repository/Cek Profile/Verify Screen - E-Commerce Android App'), 
        GlobalVariable.timeOUT, FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('ECOM_002'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

