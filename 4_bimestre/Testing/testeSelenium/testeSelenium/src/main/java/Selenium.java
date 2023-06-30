public class Selenium {

    WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");

    WebElement campoUsuario = driver.findElement(By.id("user-name"));
        campoUsuario.sendKeys("standard_user");

    WebElement campoSenha = driver.findElement(By.id("password"));
        campoSenha.sendKeys("secret_sauce");

    WebElement botaoLogin = driver.findElement(By.id("login-button"));
        botaoLogin.click();

    WebElement botaoAdicionarAoCarrinho01 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        botaoAdicionarAoCarrinho01.click();

    WebElement botaoAdicionarAoCarrinho02 = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        botaoAdicionarAoCarrinho02.click();

    WebElement linkCarrinho  = driver.findElement(By.className("shopping_cart_link"));
        linkCarrinho.click();

    WebElement botaoCheckOut = driver.findElement(By.id("checkout"));
        botaoCheckOut.click();
        
    WebElement botaoCheckOut = driver.findElement(By.id("checkout"));
        botaoCheckOut.click();

    //WebElement campoFirstName = driver.findElement(By.id("first-Name")); ===> não funciona pelo ID
    WebElement campoFirstName = driver.findElement(By.name("firstName"));
        campoFirstName.sendKeys("Teste");

    //WebElement campoLastName = driver.findElement(By.id("last-Name")); ===> não funciona pelo ID
    WebElement campoLastName = driver.findElement(By.name("lastName"));
        campoLastName.sendKeys("Teste");

    //WebElement campoPostalCode = driver.findElement(By.id("postal-code")); ===> não funciona pelo ID
    WebElement campoPostalCode = driver.findElement(By.name("postalCode"));
        campoPostalCode.sendKeys("123123");

    WebElement botaoContinue = driver.findElement(By.id("continue"));
        botaoContinue.click();

    WebElement botaoFinish = driver.findElement(By.id("finish"));
        botaoFinish.click();

}
