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

respon1 = WS.sendRequest(findTestObject('Comments/GET - Comments with id'))

WS.verifyResponseStatusCode(respon1, 200, FailureHandling.STOP_ON_FAILURE)

assert respon1.getStatusCode() == 200

WS.verifyElementPropertyValue(respon1, 'postId', 1, FailureHandling.STOP_ON_FAILURE)

WS.verifyElementPropertyValue(respon1, 'id', 1, FailureHandling.STOP_ON_FAILURE)

WS.verifyElementPropertyValue(respon1, 'name', 'id labore ex et quam laborum', FailureHandling.STOP_ON_FAILURE)

WS.verifyElementPropertyValue(respon1, 'email', 'Eliseo@gardner.biz', FailureHandling.STOP_ON_FAILURE)

WS.verifyElementPropertyValue(respon1, 'body', 'laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium', 
    FailureHandling.STOP_ON_FAILURE)

