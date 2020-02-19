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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging.student.cakap.com/login')

WebUI.setText(findTestObject('Page_Cakap Student  Login/input_E-mail_text-center fill ng-untouched ng-pristine ng-invalid'), 
    'rahman.nasu@yahoo.com')

WebUI.setText(findTestObject('Page_Cakap Student  Login/input_Password_text-center fill ng-untouched ng-pristine ng-invalid'), 
    '1234567890')

WebUI.click(findTestObject('Page_Cakap Student  Login/button_LOGIN'))

WebUI.delay(10)

WebUI.click(findTestObject('Page_Cakap Student  Dashboard/span_Mandarin Course'))

WebUI.click(findTestObject('Page_Cakap Student  Dashboard/div_NEXT_backdrop full-screen'))

WebUI.setText(findTestObject('Page_Cakap Student  Dashboard/input_Zimbabwe (263)_input-phone'), '82138327830')

WebUI.click(findTestObject('Page_Cakap Student  Dashboard/button_START LEARNING'))

WebUI.delay(10)

