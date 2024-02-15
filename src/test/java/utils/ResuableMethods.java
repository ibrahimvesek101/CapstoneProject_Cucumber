package utils;

import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;

import java.time.Duration;

public class ResuableMethods {



    public static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    public static Actions actions =new Actions(Driver.getDriver());

    public static Faker faker = new Faker();

    private static int timeout = 5;







    //locate tıklar
    public static void click(WebElement element) {
        actions.scrollToElement(element).perform();
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    //locate elemanına text gönderir
    public static void sendKeys(WebElement element, String text) {
        actions.scrollToElement(element).perform();
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(text);
    }


    //========Switching Window=====//
    public static void switchToWindow(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }

    //========Hover Over=====//
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    /**HARD WAIT WITH THREAD.SLEEP
     * waitFor(5);  => waits for 5 second
     */
    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    //===============Explicit Wait==============//
    public static WebElement waitForVisibility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }


    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }



    public static void clickWithTimeOut(WebElement element, int timeout) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            } catch (WebDriverException e) {
                waitFor(1);
            }
        }
    }
    public static void waitForPageToLoad(long timeout) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        try {
            System.out.println("Waiting for page to load...");
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
            wait.until(expectation);
        } catch (Throwable error) {
            System.out.println(
                    "Timeout waiting for Page Load Request to complete after " + timeout + " seconds");
        }
    }


    /**
     * Clicks on an element using JavaScript
     */
    public static void jsClick(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
    }

    public static void jsScrollInto(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static Boolean isPageLoaded(WebDriver driver) {
        return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
    }


    private static WebDriverWait waits() {
        return new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
    }

    public static void clickStale(WebElement element) {
        int attempts = 0;
        boolean isDone = false;
        while (!isDone && attempts < 3) {
            try {
                waits().until(ExpectedConditions.elementToBeClickable(element)).click();
                isDone = true;
            } catch (StaleElementReferenceException e) {
                attempts++;
            }
        }
    }




    public static String getAlertText() {
        return waits().until(ExpectedConditions.alertIsPresent()).getText();
        //return _driver.switchTo().alert().getText();
    }

    public static WebElement verifyElement(WebElement element) {
        int attempts = 0;
        boolean isDone = false;
        WebElement result = null;
        while (!isDone && attempts < 3) {
            try {
                result = waits().until(ExpectedConditions.visibilityOf(element));
                result.isEnabled();
                isDone = true;
            } catch (StaleElementReferenceException e) {
                attempts++;
            }
        }
        return result;
    }


}


