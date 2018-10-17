package currencyCalculator;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EurReferenceTableTest {
    private final String HOME_PAGE = "https://www.luminor.lv/en/currency-rates";

    private final By USD_EUR_REF_RATE = By.xpath("//tr[1]/td[4]");
    private final By GBP_EUR_REF_RATE = By.xpath("//tr[2]/td[4]");
    private final By NOK_EUR_REF_RATE = By.xpath("//tr[3]/td[4]");
    private final By AUD_EUR_REF_RATE = By.xpath("//tr[4]/td[4]");
    private final By BYN_EUR_REF_RATE = By.xpath("//tr[5]/td[4]");
    private final By CAD_EUR_REF_RATE = By.xpath("//tr[6]/td[4]");
    private final By CHF_EUR_REF_RATE = By.xpath("//tr[7]/td[4]");
    private final By CNY_EUR_REF_RATE = By.xpath("//tr[8]/td[4]");
    private final By CZK_EUR_REF_RATE = By.xpath("//tr[9]/td[4]");
    private final By DKK_EUR_REF_RATE = By.xpath("//tr[10]/td[4]");
    private final By HKD_EUR_REF_RATE = By.xpath("//tr[11]/td[4]");
    private final By ILS_EUR_REF_RATE  = By.xpath("//tr[12]/td[4]");
    private final By JPY_EUR_REF_RATE  = By.xpath("//tr[13]/td[4]");
    private final By KZT_EUR_REF_RATE = By.xpath("//tr[14]/td[4]");
    private final By PLN_EUR_REF_RATE = By.xpath("//tr[15]/td[4]");
    private final By RUB_EUR_REF_RATE = By.xpath("//tr[16]/td[4]");
    private final By SEK_EUR_REF_RATE = By.xpath("//tr[17]/td[4]");
    private final By SGD_EUR_REF_RATE = By.xpath("//tr[18]/td[4]");

    private EurReferenceRateValues eurReferenceRateValues = new EurReferenceRateValues();

    @Test
    public void checkTableEurReferenceRate() {
        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(HOME_PAGE);

        WebElement usdValue = driver.findElement(USD_EUR_REF_RATE);
        Assert.assertEquals(eurReferenceRateValues.getUsd(), Double.valueOf(usdValue.getText()),0.0001);

        WebElement gbpValue = driver.findElement(GBP_EUR_REF_RATE);
        Assert.assertEquals(eurReferenceRateValues.getGbp(), Double.valueOf(gbpValue.getText()),0.0001);

        WebElement nokValue = driver.findElement(NOK_EUR_REF_RATE);
        Assert.assertEquals(eurReferenceRateValues.getNok(), Double.valueOf(nokValue.getText()),0.0001);

        WebElement audValue = driver.findElement(AUD_EUR_REF_RATE);
        Assert.assertEquals(eurReferenceRateValues.getAud(), Double.valueOf(audValue.getText()),0.0001);

        WebElement bynValue = driver.findElement(BYN_EUR_REF_RATE);
        Assert.assertEquals(eurReferenceRateValues.getByn(), Double.valueOf(bynValue.getText()),0.0001);

        WebElement cadValue = driver.findElement(CAD_EUR_REF_RATE);
        Assert.assertEquals(eurReferenceRateValues.getCad(), Double.valueOf(cadValue.getText()),0.0001);

        WebElement chfValue = driver.findElement(CHF_EUR_REF_RATE);
        Assert.assertEquals(eurReferenceRateValues.getChf(), Double.valueOf(chfValue.getText()),0.0001);

        WebElement cnyValue = driver.findElement(CNY_EUR_REF_RATE);
        Assert.assertEquals(eurReferenceRateValues.getCny(), Double.valueOf(cnyValue.getText()),0.0001);

        WebElement czkValue = driver.findElement(CZK_EUR_REF_RATE);
        Assert.assertEquals(eurReferenceRateValues.getCzk(), Double.valueOf(czkValue.getText()),0.0001);

        WebElement dkkValue = driver.findElement(DKK_EUR_REF_RATE);
        Assert.assertEquals(eurReferenceRateValues.getDkk(), Double.valueOf(dkkValue.getText()),0.0001);

        WebElement hkdValue = driver.findElement(HKD_EUR_REF_RATE);
        Assert.assertEquals(eurReferenceRateValues.getHkd(), Double.valueOf(hkdValue.getText()),0.0001);

        WebElement ilsValue = driver.findElement(ILS_EUR_REF_RATE);
        Assert.assertEquals(eurReferenceRateValues.getIls(), Double.valueOf(ilsValue.getText()),0.0001);

        WebElement jpyValue = driver.findElement(JPY_EUR_REF_RATE);
        Assert.assertEquals(eurReferenceRateValues.getJpy(), Double.valueOf(jpyValue.getText()),0.0001);

        WebElement kztValue = driver.findElement(KZT_EUR_REF_RATE);
        Assert.assertEquals(eurReferenceRateValues.getKzt(), Double.valueOf(kztValue.getText()),0.0001);

        WebElement plnValue = driver.findElement(PLN_EUR_REF_RATE);
        Assert.assertEquals(eurReferenceRateValues.getPln(), Double.valueOf(plnValue.getText()),0.0001);

        WebElement rubValue = driver.findElement(RUB_EUR_REF_RATE);
        Assert.assertEquals(eurReferenceRateValues.getRub(), Double.valueOf(rubValue.getText()),0.0001);

        WebElement sekValue = driver.findElement(SEK_EUR_REF_RATE);
        Assert.assertEquals(eurReferenceRateValues.getSek(), Double.valueOf(sekValue.getText()),0.0001);

        WebElement sgdValue = driver.findElement(SGD_EUR_REF_RATE);
        Assert.assertEquals(eurReferenceRateValues.getSgd(), Double.valueOf(sgdValue.getText()),0.0001);

      }
}
