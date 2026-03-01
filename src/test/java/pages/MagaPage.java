package pages;

import maps.magaMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MagaPage {

    private WebDriver driver;
    private magaMap map;

    public MagaPage(WebDriver driver) {
        this.driver = driver;
        this.map = new magaMap(driver);
    }

    private WebDriverWait getWait() {
        return new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private void click(WebElement element) {
        getWait().until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    private void type(WebElement element, String text) {
        getWait().until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(text);
    }

    public void digitarEmail(String email) {
        type(map.inputLogin, email);
    }

    public void clicarCriarContaInicial() {
        click(map.clickMake);
    }


    public void clicarHeaderUsuario() {
        click(map.headerActionUser);
    }

    public void preencherComponente(String componente) {
        type(map.inputComponent, componente);
    }

    public void preencherLogin(String login) {
        type(map.inputLogin, login);
    }

    public void clicarCriarConta() {
        click(map.clickMake);
    }

    public void preencherNome(String nome) {
        type(map.inputName, nome);
    }

    public void preencherDataNascimento(String nascimento) {
        type(map.inputBirth, nascimento);
    }


    public void preencherCpf(String cpf) {
        type(map.inputCpf, cpf);
    }

    public void preencherSenha(String senha) {
        type(map.inputPassword, senha);
    }

    public void preencherCep(String cep) {
        type(map.inputCep, cep);
    }

    public void confirmarCep() {

        By btnOk = By.cssSelector("button.buttonWithin");

        WebElement botao = getWait().until(
                ExpectedConditions.elementToBeClickable(btnOk)
        );

        botao.click();
        
    }

    public void preencherEndereco(String endereco) {type(map.inputAddress, endereco); }

    public void preencherNumero(String numero) {
        type(map.inputNumber, numero);
    }

    public void preencherBairro(String bairro) {
        type(map.inputNeighbourhood, bairro);
    }

    public void preencherReferencia(String referencia) {
        type(map.inputReference, referencia);
    }

    public void preencherTelefone(String telefone) {
        type(map.inputTelephone, telefone);
    }

    public void aceitarTermos() {
        click(map.acceptTerms);
    }

    public void clicarContinuar() {
        click(map.clickContinue);
    }

    public String obterMensagemValidacao() {

        return getWait()
                .until(ExpectedConditions.visibilityOf(map.validSmsMessage))
                .getText();
    }

    public void realizarCadastroCompleto(String nome, String nascimento,
                                         String cpf, String senha,
                                         String cep, String endereco,String numero,
                                         String bairro, String referencia,
                                         String telefone) {

        preencherNome(nome);
        preencherDataNascimento(nascimento);
        preencherSenha(senha);
        preencherCpf(cpf);
        preencherCep(cep);
        confirmarCep();
        preencherEndereco(endereco);
        preencherNumero(numero);
        preencherBairro(bairro);
        preencherReferencia(referencia);
        preencherTelefone(telefone);

        aceitarTermos();
        clicarContinuar();
        obterMensagemValidacao();

    }
}
