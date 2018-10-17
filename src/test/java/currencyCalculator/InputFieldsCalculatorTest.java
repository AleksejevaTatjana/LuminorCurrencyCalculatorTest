package currencyCalculator;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InputFieldsCalculatorTest {
    private final String HOME_PAGE = "https://www.luminor.lv/en/currency-rates";
    private final By SELL_INPUT_FIELD = By.id("currency-sell-textfield");
    private final By BUY_INPUT_FIELD = By.id("currency-buy-textfield");
    private final By BUY_DROPDOWN_MENU = By.xpath("//select[@id='currency-buy-select']//option");
    private final By BUY_EUR = By.xpath("//select[@id='currency-buy-select']/option[1]");
    private final By BUY_GBP = By.xpath("//select[@id='currency-buy-select']/option[3]");
    private final By BUY_NOK = By.xpath("//select[@id='currency-buy-select']/option[4]");
    private final By BUY_AUD = By.xpath("//select[@id='currency-buy-select']/option[5]");
    private final By BUY_BYN = By.xpath("//select[@id='currency-buy-select']/option[6]");
    private final By BUY_CAD = By.xpath("//select[@id='currency-buy-select']/option[7]");
    private final By BUY_CHF = By.xpath("//select[@id='currency-buy-select']/option[8]");
    private final By BUY_CNY = By.xpath("//select[@id='currency-buy-select']/option[9]");
    private final By BUY_CZK = By.xpath("//select[@id='currency-buy-select']/option[10]");
    private final By BUY_DKK = By.xpath("//select[@id='currency-buy-select']/option[11]");
    private final By BUY_HKD = By.xpath("//select[@id='currency-buy-select']/option[12]");
    private final By BUY_ILS = By.xpath("//select[@id='currency-buy-select']/option[13]");
    private final By BUY_JPY = By.xpath("//select[@id='currency-buy-select']/option[14]");
    private final By BUY_KZT = By.xpath("//select[@id='currency-buy-select']/option[15]");
    private final By BUY_PLN = By.xpath("//select[@id='currency-buy-select']/option[16]");
    private final By BUY_RUB = By.xpath("//select[@id='currency-buy-select']/option[17]");
    private final By BUY_SEK = By.xpath("//select[@id='currency-buy-select']/option[18]");
    private final By BUY_SGD = By.xpath("//select[@id='currency-buy-select']/option[19]");

    BankBuysCurrencyValues bankBuysCurrencyValues = new BankBuysCurrencyValues();
    WebDriver driver;

    @Test
    public void checkIBuyInputField() {
        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(HOME_PAGE);

        WebElement sellInputField = driver.findElement(SELL_INPUT_FIELD);
        sellInputField.click();
        sellInputField.sendKeys(Keys.BACK_SPACE);
        sellInputField.sendKeys(Keys.BACK_SPACE);
        sellInputField.sendKeys(Keys.BACK_SPACE);
        sellInputField.sendKeys(Keys.BACK_SPACE);
        sellInputField.sendKeys("1");

        WebElement buyInputField = driver.findElement(BUY_INPUT_FIELD);
        Assert.assertEquals(bankBuysCurrencyValues.getUsd(), Double.valueOf(buyInputField.getAttribute("value")), 0.01);

        WebElement selectValue = driver.findElement(BUY_DROPDOWN_MENU);

        selectValue.click();
        WebElement selectEUR = driver.findElement(BUY_EUR);
        selectEUR.click();
        Assert.assertEquals(bankBuysCurrencyValues.getEur(), Double.valueOf(buyInputField.getAttribute("value")), 0.01);

        selectValue.click();
        WebElement selectGBP = driver.findElement(BUY_GBP);
        selectGBP.click();
        Assert.assertEquals(bankBuysCurrencyValues.getGbp(), Double.valueOf(buyInputField.getAttribute("value")), 0.01);

        selectValue.click();
        WebElement selectNOK = driver.findElement(BUY_NOK);
        selectNOK.click();
        Assert.assertEquals(bankBuysCurrencyValues.getNok(), Double.valueOf(buyInputField.getAttribute("value")), 0.01);

        selectValue.click();
        WebElement selectAUD = driver.findElement(BUY_AUD);
        selectAUD.click();
        Assert.assertEquals(bankBuysCurrencyValues.getAud(), Double.valueOf(buyInputField.getAttribute("value")), 0.01);

        selectValue.click();
        WebElement selectBYN = driver.findElement(BUY_BYN);
        selectBYN.click();
        Assert.assertEquals(bankBuysCurrencyValues.getByn(), Double.valueOf(buyInputField.getAttribute("value")), 0.01);

        selectValue.click();
        WebElement selectCAD = driver.findElement(BUY_CAD);
        selectCAD.click();
        Assert.assertEquals(bankBuysCurrencyValues.getCad(), Double.valueOf(buyInputField.getAttribute("value")), 0.01);

        selectValue.click();
        WebElement selectCHF = driver.findElement(BUY_CHF);
        selectCHF.click();
        Assert.assertEquals(bankBuysCurrencyValues.getChf(), Double.valueOf(buyInputField.getAttribute("value")), 0.01);

        selectValue.click();
        WebElement selectCNY = driver.findElement(BUY_CNY);
        selectCNY.click();
        Assert.assertEquals(bankBuysCurrencyValues.getCny(), Double.valueOf(buyInputField.getAttribute("value")), 0.01);

        selectValue.click();
        WebElement selectCZK = driver.findElement(BUY_CZK);
        selectCZK.click();
        Assert.assertEquals(bankBuysCurrencyValues.getCzk(), Double.valueOf(buyInputField.getAttribute("value")), 0.01);

        selectValue.click();
        WebElement selectDKK = driver.findElement(BUY_DKK);
        selectDKK.click();
        Assert.assertEquals(bankBuysCurrencyValues.getDkk(), Double.valueOf(buyInputField.getAttribute("value")), 0.01);

        selectValue.click();
        WebElement selectHKD = driver.findElement(BUY_HKD);
        selectHKD.click();
        Assert.assertEquals(bankBuysCurrencyValues.getHkd(), Double.valueOf(buyInputField.getAttribute("value")), 0.01);

        selectValue.click();
        WebElement selectILS = driver.findElement(BUY_ILS);
        selectILS.click();
        Assert.assertEquals(bankBuysCurrencyValues.getIls(), Double.valueOf(buyInputField.getAttribute("value")), 0.01);

        selectValue.click();
        WebElement selectJPY = driver.findElement(BUY_JPY);
        selectJPY.click();
        Assert.assertEquals(bankBuysCurrencyValues.getJpy(), Double.valueOf(buyInputField.getAttribute("value")), 0.01);

        selectValue.click();
        WebElement selectKZT = driver.findElement(BUY_KZT);
        selectKZT.click();
        Assert.assertEquals(bankBuysCurrencyValues.getKzt(), Double.valueOf(buyInputField.getAttribute("value")), 0.01);

        selectValue.click();
        WebElement selectPLN = driver.findElement(BUY_PLN);
        selectPLN.click();
        Assert.assertEquals(bankBuysCurrencyValues.getPln(), Double.valueOf(buyInputField.getAttribute("value")), 0.01);

        selectValue.click();
        WebElement selectRUB = driver.findElement(BUY_RUB);
        selectRUB.click();
        Assert.assertEquals(bankBuysCurrencyValues.getRub(), Double.valueOf(buyInputField.getAttribute("value")), 0.01);

        selectValue.click();
        WebElement selectSEK = driver.findElement(BUY_SEK);
        selectSEK.click();
        Assert.assertEquals(bankBuysCurrencyValues.getSek(), Double.valueOf(buyInputField.getAttribute("value")), 0.01);

        selectValue.click();
        WebElement selectSGD = driver.findElement(BUY_SGD);
        selectSGD.click();
        Assert.assertEquals(bankBuysCurrencyValues.getSgd(), Double.valueOf(buyInputField.getAttribute("value")), 0.01);
    }
}
