*** Settings ***
Library    SeleniumLibrary
# André Henrique de Oliveira Paulo
*** Variables ***
${SITE}             https://www.saucedemo.com/
${NAVEGADOR}        Chrome
${CAMPO_USUARIO}    id=user-name
${USUARIO}          standard_user
${CAMPO_SENHA}      id=password
${SENHA}            secret_sauce
${BOTAO_LOGIN}      id=login-button
${PRODUTO}          id=add-to-cart-sauce-labs-bike-light
${CARRINHO}         css=.shopping_cart_link
${CHECKOUT}         id=checkout
${CAMPO_NOME}       id=first-name
${NOME}             Benjamin
${CAMPO_SOBRENOME}  id=last-name
${SOBRENOME}        Macedo
${CAMPO_ZIPCODE}    id=postal-code
${ZIPCODE}          11070160
${CONTINUAR}        id=continue
${FINISH}           id=finish

*** Keywords ***
Acessar a loja SauceDemo
    Open Browser      ${SITE}                 ${NAVEGADOR}
    Maximize Browser Window
Fazer Login
    Input Text        ${CAMPO_USUARIO}        ${USUARIO}
	Input Text        ${CAMPO_SENHA}          ${SENHA}
    Click Element     ${BOTAO_LOGIN}
Selecionar Produto
    Click Element      ${PRODUTO}
Checar carrinho
    Click Element      ${CARRINHO}
Concluir Compra
    Click Element       ${CHECKOUT}
Informar dados pessoais
    Input Text        ${CAMPO_NOME}           ${NOME}
    Input Text        ${CAMPO_SOBRENOME}      ${SOBRENOME}
    Input Text        ${CAMPO_ZIPCODE}        ${ZIPCODE}
    Click Element     ${CONTINUAR}
Encerrar Operação
    Click Element      ${FINISH}
    Close Browser