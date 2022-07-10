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

//untuk looping edit data sesuai dengan data yang ada di excel.
for (def rowNum = 1; rowNum <= findTestData('Profile').getRowNumbers(); rowNum++) {
    if (findTestData('Profile').getValue('ACTIVE', rowNum) == 'Y') {
        
        Mobile.tap(findTestObject('Object Repository/Cek Profile/android.widget.TextView - EDIT'), GlobalVariable.timeOUT)
		Mobile.verifyElementVisible(findTestObject('Object Repository/Cek Profile/VERIF SCREEN - User Profile'), GlobalVariable.timeOUT, FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Object Repository/Cek Profile/android.widget.RelativeLayout'), GlobalVariable.timeOUT)
        Mobile.clearText(findTestObject('Object Repository/Cek Profile/android.widget.EditText - Your Name'), GlobalVariable.timeOUT)
        Mobile.setText(findTestObject('Object Repository/Cek Profile/android.widget.EditText'), findTestData('Profile').getValue('Nama', rowNum), GlobalVariable.timeOUT)

        Mobile.tap(findTestObject('Object Repository/Cek Profile/android.widget.Button - OK'), GlobalVariable.timeOUT)

        Mobile.tap(findTestObject('Object Repository/Cek Profile/android.widget.RelativeLayout (1)'), GlobalVariable.timeOUT)
        Mobile.clearText(findTestObject('Object Repository/Cek Profile/android.widget.EditText - your.emailgmail.com'), GlobalVariable.timeOUT)
        Mobile.setText(findTestObject('Object Repository/Cek Profile/android.widget.EditText'), findTestData('Profile').getValue('Email', rowNum), GlobalVariable.timeOUT)

        Mobile.tap(findTestObject('Object Repository/Cek Profile/android.widget.Button - OK'), GlobalVariable.timeOUT)

        Mobile.tap(findTestObject('Object Repository/Cek Profile/android.widget.RelativeLayout (2)'), GlobalVariable.timeOUT)
        Mobile.clearText(findTestObject('Object Repository/Cek Profile/android.widget.EditText - 628123456789'), GlobalVariable.timeOUT)
        Mobile.setText(findTestObject('Object Repository/Cek Profile/android.widget.EditText'), findTestData('Profile').getValue('HP', rowNum), GlobalVariable.timeOUT)

        Mobile.tap(findTestObject('Object Repository/Cek Profile/android.widget.Button - OK'), GlobalVariable.timeOUT)

        Mobile.tap(findTestObject('Object Repository/Cek Profile/android.widget.RelativeLayout (3)'), GlobalVariable.timeOUT)
        Mobile.clearText(findTestObject('Object Repository/Cek Profile/android.widget.EditText - Your Address'), GlobalVariable.timeOUT)
        Mobile.setText(findTestObject('Object Repository/Cek Profile/android.widget.EditText'), findTestData('Profile').getValue('Alamat', rowNum), GlobalVariable.timeOUT)

        Mobile.tap(findTestObject('Object Repository/Cek Profile/android.widget.Button - OK'), GlobalVariable.timeOUT)
		
		Mobile.tap(findTestObject('Object Repository/Cek Profile/android.widget.ImageButton'), GlobalVariable.timeOUT)

        Mobile.verifyElementText(findTestObject('Cek Profile/TextView - Nama'), findTestData('Profile').getValue('Nama', rowNum), FailureHandling.STOP_ON_FAILURE)
        Mobile.verifyElementText(findTestObject('Cek Profile/TextView - Email'), findTestData('Profile').getValue('Email', rowNum), FailureHandling.STOP_ON_FAILURE)
        Mobile.verifyElementText(findTestObject('Cek Profile/TextView - HP'), findTestData('Profile').getValue('HP', rowNum), FailureHandling.STOP_ON_FAILURE)
        Mobile.verifyElementText(findTestObject('Cek Profile/TextView - Alamat'), findTestData('Profile').getValue('Alamat',  rowNum), FailureHandling.STOP_ON_FAILURE)

    }
}

//Mobile.closeApplication()
