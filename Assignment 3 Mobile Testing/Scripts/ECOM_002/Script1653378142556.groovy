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
Mobile.waitForElementPresent(findTestObject('Object Repository/Cek Profile/Verify Screen - E-Commerce Android App'), GlobalVariable.timeOUT, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementNotExist(findTestObject('Object Repository/Cek Profile/Verify Screen - E-Commerce Android App'), GlobalVariable.timeOUT, FailureHandling.OPTIONAL)) {
	Mobile.tap(findTestObject('Object Repository/Checkout/Button Back'), GlobalVariable.timeOUT)
}

Mobile.tap(findTestObject('Object Repository/Cek Profile/android.widget.ImageView'), GlobalVariable.timeOUT)
Mobile.verifyElementVisible(findTestObject('Object Repository/Cek Profile/VERIF SCREEN - Profile'), GlobalVariable.timeOUT, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Cek Profile/MENU - ORDER HISTORY'), GlobalVariable.timeOUT)
Mobile.delay(GlobalVariable.timeOUT)
Mobile.verifyElementVisible(findTestObject('Object Repository/Cek Profile/VERIF SCREEN - Order History'), GlobalVariable.timeOUT, FailureHandling.STOP_ON_FAILURE)

device_Height = Mobile.getDeviceHeight()
device_Width = Mobile.getDeviceWidth()

int pointH = device_Height/2
int pointW = device_Width/2

// akan menjalankan fungsi IF ketika order history kosong
	if (Mobile.verifyElementNotExist(findTestObject('Object Repository/Cek Profile/ORDER HISTORY 1'), GlobalVariable.timeOUT, FailureHandling.OPTIONAL)) {
		Mobile.verifyElementExist(findTestObject('Object Repository/Cek Profile/ORDER HISTORY - ZONK IMG'), GlobalVariable.timeOUT, FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.verifyElementExist(findTestObject('Object Repository/Cek Profile/ORDER HISTORY - ZONK TEXT'), GlobalVariable.timeOUT, FailureHandling.CONTINUE_ON_FAILURE)
	}
// akan menjalankan fungsi else if ketika order history berisi 1
	else if (Mobile.verifyElementNotExist(findTestObject('Object Repository/Cek Profile/ORDER HISTORY 2'), GlobalVariable.timeOUT, FailureHandling.OPTIONAL)) { 
		Mobile.verifyElementExist(findTestObject('Object Repository/Cek Profile/ORDER HISTORY 1'), GlobalVariable.timeOUT)
		Mobile.tap(findTestObject('Object Repository/Cek Profile/ORDER HISTORY 1'), GlobalVariable.timeOUT)
		Mobile.verifyElementExist(findTestObject('Checkout/VERIF TANGGAL ORDER - Tanggal Order'), GlobalVariable.timeOUT, FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.tapAtPosition(pointW, pointH)
	}
//akan menjalankan fungsi else ketika oder history lebih dari 1
	else {
		Mobile.verifyElementExist(findTestObject('Object Repository/Cek Profile/ORDER HISTORY 1'), GlobalVariable.timeOUT)
		Mobile.verifyElementExist(findTestObject('Object Repository/Cek Profile/ORDER HISTORY 2'), GlobalVariable.timeOUT)
		Mobile.tap(findTestObject('Object Repository/Cek Profile/ORDER HISTORY 1'), GlobalVariable.timeOUT)
		Mobile.verifyElementExist(findTestObject('Checkout/VERIF TANGGAL ORDER - Tanggal Order'), GlobalVariable.timeOUT, FailureHandling.CONTINUE_ON_FAILURE)
		Mobile.tapAtPosition(pointW, pointH)
	}

Mobile.tap(findTestObject('Object Repository/Cek Profile/android.widget.ImageButton'), GlobalVariable.timeOUT)

//Mobile.closeApplication()
