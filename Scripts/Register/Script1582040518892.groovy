import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging.student.cakap.com/login/register/email')

WebUI.setText(findTestObject('Page_Cakap Student  Dashboard/input_Email_inputemail'), 'rahman.nasu@yahoo.com')

WebUI.click(findTestObject('Page_Cakap Student  Dashboard/label_Male'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Cakap Student  Dashboard/input_First Name_inputfirst'), 'Rahman')

WebUI.setText(findTestObject('Page_Cakap Student  Dashboard/input_Last Name_inputlast'), 'Nasution')

WebUI.setText(findTestObject('Page_Cakap Student  Dashboard/input_Password_inputpassword'), '1234567890')

WebUI.setText(findTestObject('Page_Cakap Student  Dashboard/input_Confirm Password_inputconfirmpass'), '1234567890')

WebUI.click(findTestObject('Page_Cakap Student  Dashboard/button_SIGN UP'))

