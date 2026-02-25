package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class magaMap {

    private WebDriver driver;

    public magaMap(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "header-search-input")
    public WebElement inputSearch;

    @FindBy(xpath = "//a[@data-testid='product-card-container']")
    public WebElement clickProduct;

    @FindBy(id = "buyButton")
    public WebElement clickToBuy;

    @FindBy(xpath = "//*[@id='servicos']/section/div/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/button")
    public WebElement clickInclude;

    @FindBy(xpath = "//*[@id=\"home\"]/header/section/div[1]/div/div[2]")
    public WebElement headerActionUser;

    @FindBy(id = "input-component")
    public WebElement inputComponent;

    @FindBy(id = "input-login")
    public WebElement inputLogin;

    @FindBy(css = "button[data-testid='signup']")
    public WebElement clickCreate;

    @FindBy(name = "fullName")
    public WebElement inputName;

    @FindBy(name = "birthDate")
    public WebElement inputBirth;

    @FindBy(name = "password")
    public WebElement inputPassword;

    @FindBy(name = "cpf")
    public WebElement inputCpf;

    @FindBy(name = "zipcode")
    public WebElement inputCep;

    @FindBy(css = ".buttonWithin")
    public WebElement btnOk;

    @FindBy(name = "address")
    public WebElement inputAddress;

    @FindBy(name = "number")
    public WebElement inputNumber;

    @FindBy(name = "neighbourhood")
    public WebElement inputNeighbourhood;

    @FindBy(name = "reference")
    public WebElement inputReference;

    @FindBy(name = "telephone")
    public WebElement inputTelephone;

    @FindBy(xpath = "//label[@for='CheckboxGroup-privacyCheck']")
    public WebElement acceptTerms;

    @FindBy(css = ".continueButton")
    public WebElement clickContinue;

    @FindBy(css = "span.SelectEmailOrSms-text-info")
    public WebElement validSmsMessage;
}