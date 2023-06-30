*** Settings ***
Resource    ./prof.resource
Library     SeleniumLibrary

*** Test Cases ***
Processo de compra na loja SauceDemo
    Acessar a loja SauceDemo
    Fazer Login
    Selecionar Produto
    Checar carrinho
    Concluir Compra
    Informar dados pessoais
    Encerrar Operação