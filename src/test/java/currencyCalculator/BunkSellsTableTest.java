package currencyCalculator;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BunkSellsTableTest {

    private final String HOME_PAGE = "https://www.luminor.lv/en/currency-rates";
    private final By USD_BANK_SELLS = By.xpath("//tr[1]/td[3]");
    private final By GBP_BANK_SELLS = By.xpath("//tr[2]/td[3]");
    private final By NOK_BANK_SELLS = By.xpath("//tr[3]/td[3]");
    private final By AUD_BANK_SELLS = By.xpath("//tr[4]/td[3]");
    private final By BYN_BANK_SELLS = By.xpath("//tr[5]/td[3]");
    private final By CAD_BANK_SELLS = By.xpath("//tr[6]/td[3]");
    private final By CHF_BANK_SELLS = By.xpath("//tr[7]/td[3]");
    private final By CNY_BANK_SELLS = By.xpath("//tr[8]/td[3]");
    private final By CZK_BANK_SELLS = By.xpath("//tr[9]/td[3]");
    private final By DKK_BANK_SELLS = By.xpath("//tr[10]/td[3]");
    private final By HKD_BANK_SELLS = By.xpath("//tr[11]/td[3]");
    private final By ILS_BANK_SELLS = By.xpath("//tr[12]/td[3]");
    private final By JPY_BANK_SELLS = By.xpath("//tr[13]/td[3]");
    private final By KZT_BANK_SELLS = By.xpath("//tr[14]/td[3]");
    private final By PLN_BANK_SELLS = By.xpath("//tr[15]/td[3]");
    private final By RUB_BANK_SELLS = By.xpath("//tr[16]/td[3]");
    private final By SEK_BANK_SELLS = By.xpath("//tr[17]/td[3]");
    private final By SGD_BANK_SELLS = By.xpath("//tr[18]/td[3]");

    private BankSellsCurrencyValues bankSellsCurrencyValues = new BankSellsCurrencyValues();

    @Test
    public void checkTableBankSells() {
        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(HOME_PAGE);

        WebElement usdValue = driver.findElement(USD_BANK_SELLS);
        Assert.assertEquals(bankSellsCurrencyValues.getUsd(), Double.valueOf(usdValue.getText()), 0.0001);

        WebElement gbpValue = driver.findElement(GBP_BANK_SELLS);
        Assert.assertEquals(bankSellsCurrencyValues.getGbp(), Double.valueOf(gbpValue.getText()), 0.0001);

        WebElement nokValue = driver.findElement(NOK_BANK_SELLS);
        Assert.assertEquals(bankSellsCurrencyValues.getNok(), Double.valueOf(nokValue.getText()), 0.0001);

        WebElement audValue = driver.findElement(AUD_BANK_SELLS);
        Assert.assertEquals(bankSellsCurrencyValues.getAud(), Double.valueOf(audValue.getText()), 0.0001);

        WebElement bynValue = driver.findElement(BYN_BANK_SELLS);
        Assert.assertEquals(bankSellsCurrencyValues.getByn(), Double.valueOf(bynValue.getText()), 0.0001);

        WebElement cadValue = driver.findElement(CAD_BANK_SELLS);
        Assert.assertEquals(bankSellsCurrencyValues.getCad(), Double.valueOf(cadValue.getText()), 0.0001);

        WebElement chfValue = driver.findElement(CHF_BANK_SELLS);
        Assert.assertEquals(bankSellsCurrencyValues.getChf(), Double.valueOf(chfValue.getText()), 0.0001);

        WebElement cnyValue = driver.findElement(CNY_BANK_SELLS);
        Assert.assertEquals(bankSellsCurrencyValues.getCny(), Double.valueOf(cnyValue.getText()), 0.0001);

        WebElement czkValue = driver.findElement(CZK_BANK_SELLS);
        Assert.assertEquals(bankSellsCurrencyValues.getCzk(), Double.valueOf(czkValue.getText()), 0.0001);

        WebElement dkkValue = driver.findElement(DKK_BANK_SELLS);
        Assert.assertEquals(bankSellsCurrencyValues.getDkk(), Double.valueOf(dkkValue.getText()), 0.0001);

        WebElement hkdValue = driver.findElement(HKD_BANK_SELLS);
        Assert.assertEquals(bankSellsCurrencyValues.getHkd(), Double.valueOf(hkdValue.getText()), 0.0001);

        WebElement ilsValue = driver.findElement(ILS_BANK_SELLS);
        Assert.assertEquals(bankSellsCurrencyValues.getIls(), Double.valueOf(ilsValue.getText()), 0.0001);

        WebElement jpyValue = driver.findElement(JPY_BANK_SELLS);
        Assert.assertEquals(bankSellsCurrencyValues.getJpy(), Double.valueOf(jpyValue.getText()), 0.0001);

        WebElement kztValue = driver.findElement(KZT_BANK_SELLS);
        Assert.assertEquals(bankSellsCurrencyValues.getKzt(), Double.valueOf(kztValue.getText()), 0.0001);

        WebElement plnValue = driver.findElement(PLN_BANK_SELLS);
        Assert.assertEquals(bankSellsCurrencyValues.getPln(), Double.valueOf(plnValue.getText()), 0.0001);

        WebElement rubValue = driver.findElement(RUB_BANK_SELLS);
        Assert.assertEquals(bankSellsCurrencyValues.getRub(), Double.valueOf(rubValue.getText()), 0.0001);

        WebElement sekValue = driver.findElement(SEK_BANK_SELLS);
        Assert.assertEquals(bankSellsCurrencyValues.getSek(), Double.valueOf(sekValue.getText()), 0.0001);

        WebElement sgdValue = driver.findElement(SGD_BANK_SELLS);
        Assert.assertEquals(bankSellsCurrencyValues.getSgd(), Double.valueOf(sgdValue.getText()), 0.0001);

    }
}
