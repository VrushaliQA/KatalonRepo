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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://pl-qa-pantheon-mock.eks.qritive.com/signin')

WebUI.setText(findTestObject('Object Repository/Page_Pantheon/input_Email_ant-input style__TextInputWrapp_ced313'), 'testingpurposesel@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Pantheon/input_Password_ant-input'), '03ZG93lrBnMy0VKFZPeiCg==')

WebUI.click(findTestObject('Object Repository/Page_Pantheon/span_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Pantheon/svg'))

WebUI.click(findTestObject('Object Repository/Page_Pantheon/div_'))

WebUI.setText(findTestObject('Object Repository/Page_Pantheon/input_People_rc_select_0'), 'testing')

WebUI.click(findTestObject('Object Repository/Page_Pantheon/div_testingpurpose2412rediffmail.com'))

WebUI.click(findTestObject('Object Repository/Page_Pantheon/button_Share'))

WebUI.click(findTestObject('Object Repository/Page_Pantheon/svg'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Pantheon/div_testingpurpose2412rediffmail.com'), 'testingpurpose2412@rediffmail.com')

WebUI.click(findTestObject('Object Repository/Page_Pantheon/svg_1'))

WebUI.closeBrowser()

