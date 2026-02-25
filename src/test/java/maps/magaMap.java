package maps;

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

    @FindBy(xpath = "//*[@id=\"home\"]/header/section/div[1]/div/div[2]")
    public WebElement headerActionUser;

    // =========================
    // CAMPOS INICIAIS
    // =========================

    @FindBy(id = "input-component")
    public WebElement inputComponent;

    @FindBy(id = "input-login")
    public WebElement inputLogin;

    @FindBy(css = "button[data-testid='signup']")
    public WebElement clickMake;

    // =========================
    // DADOS PESSOAIS
    // =========================

    @FindBy(name = "fullName")
    public WebElement inputName;

    @FindBy(name = "birthDate")
    public WebElement inputBirth;

    @FindBy(name = "password")
    public WebElement inputPassword;

    @FindBy(name = "cpf")
    public WebElement inputCpf;

    // =========================
    // ENDEREÇO
    // =========================

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

    // =========================0
    // CHECKBOX E BOTÃO FINAL
    // =========================

    @FindBy(css = ".checked--icon")
    public WebElement acceptTerms;

    @FindBy(css = ".continueButton")
    public WebElement clickContinue;

    @FindBy(css = "span.SelectEmailOrSms-text-info")
    public WebElement validSmsMessage;
}