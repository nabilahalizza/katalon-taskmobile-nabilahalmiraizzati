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

//Mobile.startApplication('Apk/Solodroid_A3.apk', false)
//
//Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
Mobile.verifyElementExist(findTestObject('recent-tab'), 0)

Mobile.tap(findTestObject('recent-tab'), 0)

//Mobile.verifyElementExist(findTestObject('Samsung-btn'), 0)
Mobile.tap(findTestObject('Samsung-btn'), 0)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('addcart-btn'), 0)

Mobile.tap(findTestObject('addcart-btn'), 0)

Mobile.setText(findTestObject('numorder-field'), '1', 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('ok-btn'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('cart-btn'), 0)

Mobile.verifyElementExist(findTestObject('shopcart-txt'), 0)

Mobile.closeApplication()

