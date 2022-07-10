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

WebUI.comment('Story: Book an appointment')

WebUI.comment('Given that the user has logged into their account')

WebUI.openBrowser(GlobalVariable.G_SiteURL)

WebUI.callTestCase(findTestCase('Login Test Cases/Login'), [('Username') : 'John Doe', ('Password') : 'ThisIsNotAPassword'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.comment('And Appointment page is displayed')

if (true) {
    WebUI.selectOptionByLabel(findTestObject('Page_CuraAppointment/lst_Facility'), 'Hongkong CURA Healthcare Center', false)

    WebUI.check(findTestObject('Page_CuraAppointment/chk_Medicaid'))

    WebUI.setText(findTestObject('Page_CuraAppointment/txt_VisitDate'), '10/08/2022')

    WebUI.setText(findTestObject('Page_CuraAppointment/txt_Comment'), 'test2')
}

WebUI.comment('When he fills in valid information in Appointment page')

WebUI.click(findTestObject('Page_CuraAppointment/btn_BookAppointment'))

WebUI.verifyTextPresent('Appointment Confirmation', false)

WebUI.comment('Then he should be able to book a new appointment')

if (true) {
    WebUI.verifyMatch('Hongkong CURA Healthcare Center', WebUI.getText(findTestObject('Page_AppointmentConfirmation/lbl_Facility')), 
        false)

    WebUI.verifyMatch('Medicaid', WebUI.getText(findTestObject('Page_AppointmentConfirmation/lbl_Program')), false)

    WebUI.verifyMatch('30/08/2022', WebUI.getText(findTestObject('Page_AppointmentConfirmation/lbl_VisitDate')), false)

    WebUI.verifyMatch('test2', WebUI.getText(findTestObject('Page_AppointmentConfirmation/lbl_Comment')), false)
}

WebUI.takeScreenshot()

WebUI.closeBrowser()

