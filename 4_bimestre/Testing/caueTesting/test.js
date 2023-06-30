const { By, Builder } = require('selenium-webdriver');

const firstTest = async () => {
    let driver = await new Builder().forBrowser('chrome').build();

    try {
        await driver.get('https://www.saucedemo.com/');

        let fieldUser = await driver.findElement(By.id('user-name'));
        let fieldPass = await driver.findElement(By.id('password'));
        let btnLogin = await driver.findElement(By.id('login-button'));

        await fieldUser.sendKeys('standard_user');
        await fieldPass.sendKeys('secret_sauce');
        await btnLogin.click();

        let btnItems = await driver.findElements(By.className('btn_inventory'));

        btnItems.forEach( async (e) => await e.click())

        let btnCart = await driver.findElement(By.id('shopping_cart_container'));

        await btnCart.click();

        let btnCheckout = await driver.findElement(By.id('checkout'));

        await btnCheckout.click();

        let fieldFirstName = await driver.findElement(By.id('first-name'));
        let fieldLastName = await driver.findElement(By.id('last-name'));
        let fieldZipCode = await driver.findElement(By.id('postal-code'));
        let btnContinue = await driver.findElement(By.id('continue'));

        await fieldFirstName.sendKeys('Jane');
        await fieldLastName.sendKeys('Doe');
        await fieldZipCode.sendKeys('99999-999');
        await btnContinue.click();

        let btnFinish = await driver.findElement(By.id('finish'));

        await btnFinish.click();

        console.log('Finalizado!');

    } catch(err) {
        console.log(err);
    } finally {
        driver.quit();
    }
}

firstTest();