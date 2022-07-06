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

Mobile.startExistingApplication(GlobalVariable.bundleID)
Mobile.waitForElementPresent(findTestObject('Object Repository/Cek Profile/Verify Screen - E-Commerce Android App'), GlobalVariable.timeOUT, FailureHandling.STOP_ON_FAILURE)

for (def rowNum = 1; rowNum <= findTestData('Order').getRowNumbers(); rowNum++) {
	if (findTestData('Order').getValue('ORDER', rowNum) == 'Y') {
		
		Mobile.tap(findTestObject('Object Repository/Checkout/ICON SEARCH'), GlobalVariable.timeOUT)
		Mobile.setText(findTestObject('Object Repository/Checkout/SEARCH TEXT FIELD'), findTestData('Order').getValue('keyword', rowNum), GlobalVariable.timeOUT)
		Mobile.tap(findTestObject('Object Repository/Checkout/IMG1 - SEARCH'), GlobalVariable.timeOUT)
		
		Mobile.tap(findTestObject('Object Repository/Checkout/BUTTON - ADD TO CART'), GlobalVariable.timeOUT)
		
		Mobile.setText(findTestObject('Object Repository/Checkout/Number of Order field'), findTestData('Order').getValue('quantity', rowNum), GlobalVariable.timeOUT)
		Mobile.tap(findTestObject('Object Repository/Checkout/Number of Order field - ADD'), GlobalVariable.timeOUT)
		
		Mobile.tap(findTestObject('Object Repository/Checkout/Icon Cart'), GlobalVariable.timeOUT)
		
		if (Mobile.verifyElementExist(findTestObject('Object Repository/Checkout/CART4'), GlobalVariable.timeOUT, FailureHandling.OPTIONAL)) {
			def text1 = Mobile.getText(findTestObject('Object Repository/Checkout/TEXT4'), 0)
			Mobile.verifyMatch(text1, findTestData('Order').getValue('Product', rowNum), true, FailureHandling.STOP_ON_FAILURE)
		}
		
		else if (Mobile.verifyElementExist(findTestObject('Object Repository/Checkout/CART3'), GlobalVariable.timeOUT, FailureHandling.OPTIONAL)) {
			def text2 = Mobile.getText(findTestObject('Object Repository/Checkout/TEXT3'), 0)
			Mobile.verifyMatch(text2, findTestData('Order').getValue('Product', rowNum), true, FailureHandling.STOP_ON_FAILURE)
		}
		
		else if (Mobile.verifyElementExist(findTestObject('Object Repository/Checkout/CART2'), GlobalVariable.timeOUT, FailureHandling.OPTIONAL)) {
			def text3 = Mobile.getText(findTestObject('Object Repository/Checkout/TEXT2'), 0)
			Mobile.verifyMatch(text3, findTestData('Order').getValue('Product', rowNum), true, FailureHandling.STOP_ON_FAILURE)
		}
		
		else if (Mobile.verifyElementExist(findTestObject('Object Repository/Checkout/CART1'), GlobalVariable.timeOUT)) {
			def text4 = Mobile.getText(findTestObject('Object Repository/Checkout/TEXT1'), 0)
			Mobile.verifyMatch(text4, findTestData('Order').getValue('Product', rowNum), true, FailureHandling.STOP_ON_FAILURE)
		}
		
		Mobile.tap(findTestObject('Object Repository/Checkout/Button Back'), GlobalVariable.timeOUT)
		Mobile.tap(findTestObject('Object Repository/Checkout/Button Back in details product'), GlobalVariable.timeOUT)
		Mobile.tap(findTestObject('Object Repository/Checkout/Button Back'), GlobalVariable.timeOUT)
		Mobile.waitForElementPresent(findTestObject('Object Repository/Cek Profile/Verify Screen - E-Commerce Android App'), GlobalVariable.timeOUT, FailureHandling.STOP_ON_FAILURE)
		
	}
}