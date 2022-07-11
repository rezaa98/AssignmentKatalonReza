import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.comment('Story: Book an appointment')

WebUI.comment('Given that the user has logged into their account')

WebUI.openBrowser(GlobalVariable.G_SiteURL)

WebUI.callTestCase(findTestCase('Login Test Cases/Login'), [('Username') : 'John Doe', ('Password') : 'ThisIsNotAPassword'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.comment('And Appointment page is displayed')

if (true) {
    WebUI.selectOptionByLabel(findTestObject('Page_CuraAppointment/lst_Facility'), 'Tokyo CURA Healthcare Center', false)

    WebUI.check(findTestObject('Page_CuraAppointment/chk_Medicare'))

    WebUI.check(findTestObject('Page_CuraAppointment/chk_Readmission'))
}

WebUI.comment('When he not fills all valid information in Appointment page')

WebUI.click(findTestObject('Page_CuraAppointment/btn_BookAppointment'))

WebUI.verifyTextPresent('Make Appointment', false, FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Then he should not be able to book a new appointment')

WebUI.takeScreenshot()

WebUI.closeBrowser()

