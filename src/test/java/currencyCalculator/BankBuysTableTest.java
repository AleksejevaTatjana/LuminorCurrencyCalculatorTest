package currencyCalculator;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BankBuysTableTest {

    private final String HOME_PAGE = "https://www.luminor.lv/en/currency-rates";
    private final By USD_BANK_BUYS = By.xpath("//tr[1]/td[2]");
    private final By GBP_BANK_BUYS = By.xpath("//tr[2]/td[2]");
    private final By NOK_BANK_BUYS = By.xpath("//tr[3]/td[2]");
    private final By AUD_BANK_BUYS = By.xpath("//tr[4]/td[2]");
    private final By BYN_BANK_BUYS = By.xpath("//tr[5]/td[2]");
    private final By CAD_BANK_BUYS = By.xpath("//tr[6]/td[2]");
    private final By CHF_BANK_BUYS = By.xpath("//tr[7]/td[2]");
    private final By CNY_BANK_BUYS = By.xpath("//tr[8]/td[2]");
    private final By CZK_BANK_BUYS = By.xpath("//tr[9]/td[2]");
    private final By DKK_BANK_BUYS = By.xpath("//tr[10]/td[2]");
    private final By HKD_BANK_BUYS = By.xpath("//tr[11]/td[2]");
    private final By ILS_BANK_BUYS = By.xpath("//tr[12]/td[2]");
    private final By JPY_BANK_BUYS = By.xpath("//tr[13]/td[2]");
    private final By KZT_BANK_BUYS = By.xpath("//tr[14]/td[2]");
    private final By PLN_BANK_BUYS = By.xpath("//tr[15]/td[2]");
    private final By RUB_BANK_BUYS = By.xpath("//tr[16]/td[2]");
    private final By SEK_BANK_BUYS = By.xpath("//tr[17]/td[2]");
    private final By SGD_BANK_BUYS = By.xpath("//tr[18]/td[2]");

    private BankBuysCurrencyValues bankBuysCurrencyValues = new BankBuysCurrencyValues();

    @Test
    public void checkTableBankBuys() {
        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(HOME_PAGE);

        WebElement usdValue = driver.findElement(USD_BANK_BUYS);
        Assert.assertEquals(bankBuysCurrencyValues.getUsd(), Double.valueOf(usdValue.getText()), 0.0001);

        WebElement gbpValue = driver.findElement(GBP_BANK_BUYS);
        Assert.assertEquals(bankBuysCurrencyValues.getGbp(), Double.valueOf(gbpValue.getText()), 0.0001);

        WebElement nokValue = driver.findElement(NOK_BANK_BUYS);
        Assert.assertEquals(bankBuysCurrencyValues.getNok(), Double.valueOf(nokValue.getText()), 0.0001);

        WebElement audValue = driver.findElement(AUD_BANK_BUYS);
        Assert.assertEquals(bankBuysCurrencyValues.getAud(), Double.valueOf(audValue.getText()), 0.0001);

        WebElement bynValue = driver.findElement(BYN_BANK_BUYS);
        Assert.assertEquals(bankBuysCurrencyValues.getByn(), Double.valueOf(bynValue.getText()), 0.0001);

        WebElement cadValue = driver.findElement(CAD_BANK_BUYS);
        Assert.assertEquals(bankBuysCurrencyValues.getCad(), Double.valueOf(cadValue.getText()), 0.0001);

        WebElement chfValue = driver.findElement(CHF_BANK_BUYS);
        Assert.assertEquals(bankBuysCurrencyValues.getChf(), Double.valueOf(chfValue.getText()), 0.0001);

        WebElement cnyValue = driver.findElement(CNY_BANK_BUYS);
        Assert.assertEquals(bankBuysCurrencyValues.getCny(), Double.valueOf(cnyValue.getText()), 0.0001);

        WebElement czkValue = driver.findElement(CZK_BANK_BUYS);
        Assert.assertEquals(bankBuysCurrencyValues.getCzk(), Double.valueOf(czkValue.getText()), 0.0001);

        WebElement dkkValue = driver.findElement(DKK_BANK_BUYS);
        Assert.assertEquals(bankBuysCurrencyValues.getDkk(), Double.valueOf(dkkValue.getText()), 0.0001);

        WebElement hkdValue = driver.findElement(HKD_BANK_BUYS);
        Assert.assertEquals(bankBuysCurrencyValues.getHkd(), Double.valueOf(hkdValue.getText()), 0.0001);

        WebElement ilsValue = driver.findElement(ILS_BANK_BUYS);
        Assert.assertEquals(bankBuysCurrencyValues.getIls(), Double.valueOf(ilsValue.getText()), 0.0001);

        WebElement jpyValue = driver.findElement(JPY_BANK_BUYS);
        Assert.assertEquals(bankBuysCurrencyValues.getJpy(), Double.valueOf(jpyValue.getText()), 0.0001);

        WebElement kztValue = driver.findElement(KZT_BANK_BUYS);
        Assert.assertEquals(bankBuysCurrencyValues.getKzt(), Double.valueOf(kztValue.getText()), 0.0001);

        WebElement plnValue = driver.findElement(PLN_BANK_BUYS);
        Assert.assertEquals(bankBuysCurrencyValues.getPln(), Double.valueOf(plnValue.getText()), 0.0001);

        WebElement rubValue = driver.findElement(RUB_BANK_BUYS);
        Assert.assertEquals(bankBuysCurrencyValues.getRub(), Double.valueOf(rubValue.getText()), 0.0001);

        WebElement sekValue = driver.findElement(SEK_BANK_BUYS);
        Assert.assertEquals(bankBuysCurrencyValues.getSek(), Double.valueOf(sekValue.getText()), 0.0001);

        WebElement sgdValue = driver.findElement(SGD_BANK_BUYS);
        Assert.assertEquals(bankBuysCurrencyValues.getSgd(), Double.valueOf(sgdValue.getText()), 0.0001);

    }
}






