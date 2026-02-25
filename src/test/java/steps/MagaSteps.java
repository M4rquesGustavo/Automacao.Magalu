package steps;

import core.Driver;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import pages.MagaPage;
import org.openqa.selenium.WebDriver;

public class MagaSteps {

    private WebDriver driver;
    private MagaPage page;

    public MagaSteps() {
        driver = Driver.getDriver();
        page = new MagaPage(driver);
    }

    @Given("que estou na tela inicial")
    public void estouNaTelaInicial() {
        driver.get("https://www.magazineluiza.com.br/?partner_id=974&utm_source=google&utm_medium=cpc&utm_campaign=google_eco_per_ven_brd_all_sor_4p_brand-desk&utm_term=974&utm_content=none_roa_amp_none_none_tod_none&gclsrc=aw.ds&gad_source=1&gad_campaignid=1062954936&gbraid=0AAAAAD4zZmTMqkOx3JoxvoukzlEXfj-zX&gclid=EAIaIQobChMIxY79mtnlkgMVLYNaBR1Sjg_REAAYASAAEgIw_fD_BwE");
    }

    @When("clico no botão de criar conta")
    public void clicarHeaderUsuario() {
        page.clicarHeaderUsuario();
    }

    @And("digito meu email")
    public void digitoMeuEmail() {
        page.digitarEmail("gustavo.teste@email.com");
    }

    @And("clico em criar conta")
    public void clicoEmCriarConta() {
        page.clicarCriarContaInicial();
    }

    @And("preencho os dados pessoais")
    public void preenchoDadosPessoais() {
        page.preencherNome("Gustavo Teste");
        page.preencherDataNascimento("01/01/2000");
        page.preencherCpf("60738034002");
        page.preencherSenha("Senha123");
    }

    @And("preencho o endereço")
    public void preenchoEndereco() {
        page.preencherCep("68515000");
        page.confirmarCep();
        page.preencherEndereco("rua123");
        page.preencherNumero("123");
        page.preencherBairro("Centro");
        page.preencherReferencia("Casa da arvore");
        page.preencherTelefone("11999999999");
    }

    @And("aceito os termos")
    public void aceitoOsTermos() {
        page.aceitarTermos();
    }

    @Then("o cadastro deve ser realaizado com sucesso")
    public void oCadastroDeveSerRealaizadoComSucesso() {
        page.clicarContinuar();

        String mensagem = page.obterMensagemValidacao();

        System.out.println("Mensagem exibida: " + mensagem);

        Assert.isTrue(
                mensagem.contains("Selecione um contato"),
                "Mensagem esperada não foi exibida!"
        );
    }
}