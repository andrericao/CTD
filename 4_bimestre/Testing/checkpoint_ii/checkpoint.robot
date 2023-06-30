*** Settings ***
Library     SeleniumLibrary
Resource    ./checkpoint.resource
# André Henrique de Oliveira Paulo
*** Test Cases ***
1 - Processo de compra de uma peça de roupa masculina, feminina ou infantil
    Acessar a loja
    Selecionar categoria feminina
    Selecionar produto feminino
    Selecionar um tamanho e cor e tamanho
    Adicionar ao carrinho de compras
    Ir para pagina de acesso 
    Cadastro
    Preencher dados de billing address e clicar em Save and Continue
    Velocidade de frete
    Selecionar tipo de pagamento e clicar em Save and Continue
    Fazer Logout

2 - Processo de compra de uma peça de roupa masculina, feminina ou infantil
    Acessar Conta
    Selecionar categoria feminina
    Selecionar produto feminino
    Selecionar um tamanho e cor e tamanho
    Adicionar ao carrinho de compras
    Fechar modal e continuar comprando
    Selecionar categoria Masculina
    Selecionar produto masculino
    Adicionar ao carrinho de compras
    Ir para pagina de acesso
    Confimar Endereco Salvo para Compra
    Velocidade de frete
    Selecionar tipo de pagamento e clicar em Save and Continue
    Fazer Logout
    Fechar Google

