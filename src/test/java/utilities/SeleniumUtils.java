//package apiTest.APITests;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import utilities.Driver;
//
//public class SeleniumUtils {
//    private static WebDriverWait wait;
//
//    public static void pause(int seconds){
//
//        try {
//            Thread.sleep(seconds*1000);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//    }
//
//    public static WebElement explicitWaitVisibilityOf(WebElement element, int secondsForWait){
//        wait = new WebDriverWait(Driver.getDriver(),secondsForWait);
//        return wait.until(ExpectedConditions.visibilityOf(element));
//    }
//
//    public static WebElement explicitWaitClickable(WebElement element, int secondsForWait){
//        wait = new WebDriverWait(Driver.getDriver(),secondsForWait);
//        return wait.until(ExpectedConditions.elementToBeClickable(element));
//    }
//}