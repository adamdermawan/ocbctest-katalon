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

WebUI.maximizeWindow()

//test case start
WebUI.navigateToUrl('https://www.ruangmom.com/')

WebUI.delay(10)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/mom_register/Page_Informasi Kehamilan dan Keuangan bagi Ibu Hamil - RuangMom/div_Ingin mendapatkan informasi terbaru dari RuangmomAktifkan notifikasi sekarang.AktifkanLain kali'), 
    20)) {
    WebUI.click(findTestObject('Object Repository/mom_register/Page_Informasi Kehamilan dan Keuangan bagi Ibu Hamil - RuangMom/button_Lain kali'))
}

if (WebUI.verifyElementPresent(findTestObject('Object Repository/mom_register/Page_Informasi Kehamilan dan Keuangan bagi Ibu Hamil - RuangMom/verif2'), 
    20)) {
    WebUI.click(findTestObject('Object Repository/mom_login/Page_Informasi Kehamilan dan Keuangan bagi Ibu Hamil - RuangMom/a_Masuk di sini'))
}

WebUI.click(findTestObject('Object Repository/forgot_password/Page_Masuk ke Akun/a_Lupa kata sandi'))

WebUI.setText(findTestObject('Object Repository/forgot_password/Page_Lupa Password  Ruangmom/input_E-mail_form_forgot_password_email'), 
    'ayuadisti1998@gmail.com')

WebUI.click(findTestObject('Object Repository/forgot_password/Page_Lupa Password  Ruangmom/button_Ganti kata sandi baru'))

WebUI.verifyElementPresent(findTestObject('Object Repository/forgot_password/Page_Lupa Password  Ruangmom/h1_E-mail penggantian kata sandi sudah terkirim'), 
    0)

WebUI.closeBrowser()

