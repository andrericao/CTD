*** Settings ***
Library    SeleniumLibrary
# André Henrique de Oliveira Paulo
# A cada repetição do teste mude o email, ao menos um caracter
*** Variables ***
${SITE}                              https://demo.spreecommerce.org
${NAVEGADOR}                         Chrome
${MENU_FEMININO}                     css=.p-0
${SELECIONAR_SUETER}                 css=.p-0:nth-child(1) > .dropdown-menu li:nth-child(4) > .text-uppercase
${SELECIONAR_PRODUTO_FEMININO}       css=#product_70 .product-component-image
${SELECIONAR_COR}                    css=g:nth-child(2) > circle:nth-child(1)
${SELECIONAR_TAMANHO}                css=.select-label
${ADICIONAR_COMPRAS_CARRINHO}        id=add-to-cart-button
${BOTAO_PAGINA_ACESSO}               css=.btn-primary:nth-child(1)
${BOTAO_CADASTRO}                    css=.btn:nth-child(2)
${CAMPO_EMAIL}                       id=spree_user_email
${EMAIL}                             mudeoemailacadateste@devsp.com           
${CAMPO_SENHA}                       id=spree_user_password
${SENHA}                             vQ80So6v0&T9
${CAMPO_REPETIR_SENHA}               id=spree_user_password_confirmation
${BOTAO_SALVAR_CONTINUAR_E_LOGIN}    name=commit
${CAMPO_NOME}                        id=order_bill_address_attributes_firstname
${NOME}                              Alberta Investment
${CAMPO_SOBRENOME}                   id=order_bill_address_attributes_lastname
${SOBRENOME}                         Management Corporation
${CAMPO_ENDERECO}                    id=order_bill_address_attributes_address1
${ENDERECO}                          Jasper Ave. - Canada
${CAMPO_CIDADE}                      id=order_bill_address_attributes_city
${CIDADE}                            Edmonton
${CAMPO_TELEFONE}                    id=order_bill_address_attributes_phone
${TELEFONE}                          587 7772884
${CAMPO_CEP}                         id=order_bill_address_attributes_zipcode
${CEP}                               1100-10830
${BOTAO_TIPO_PAGAMENTO_CHECK}        css=.radio:nth-child(2) .spree-radio-label-custom-input
${BOTAO_MEU_USUARIO}                 css=#account-button > .spree-icon
${BOTAO_LOGOUT}                      css=#link-to-account > .dropdown-item:nth-child(2)
${BOTAO_HOME}                        css=.flex-grow-0 img
${BOTAO_LOGIN}                       css=#link-to-account > .dropdown-item:nth-child(1)
${BOTAO_FECHAR_MODAL}                css=.modal-header .d-none
${MENU_MASCULINO}                    xpath=//a[contains(text(),'Men')]
${SELECIONAR_CAMISETAS}              css=.p-0:nth-child(2) li:nth-child(1) > .text-uppercase
${SELECIONAR_PRODUTO_MASCULINO}      css=#product_3 .product-component-image

*** Keywords ***
Acessar a loja
    Open Browser        ${SITE}      ${NAVEGADOR}
    Maximize Browser Window

Selecionar categoria feminina
    Click Element       ${MENU_FEMININO} 
    Sleep    3
    #Click Element       css=.flex-xl-grow-1
    Click Element       ${SELECIONAR_SUETER}
    Sleep    3

Selecionar produto feminino
    Click Element       ${SELECIONAR_PRODUTO_FEMININO}
    Sleep    3

Selecionar um tamanho e cor e tamanho
    Click Element       ${SELECIONAR_COR}
    Sleep    3
    Click Element       ${SELECIONAR_TAMANHO} 
    Sleep    3

Adicionar ao carrinho de compras
    Click Element       ${ADICIONAR_COMPRAS_CARRINHO}
    Sleep    3

Ir para pagina de acesso 
    Click Element       ${BOTAO_PAGINA_ACESSO}
    Sleep    3

Cadastro
    Click Element       ${BOTAO_CADASTRO}
    Sleep    3
    Input Text          ${CAMPO_EMAIL}           ${EMAIL}
    Input Text          ${CAMPO_SENHA}           ${SENHA}
    Input Text          ${CAMPO_REPETIR_SENHA}   ${SENHA}
    Sleep    3
    Click Element       ${BOTAO_SALVAR_CONTINUAR_E_LOGIN}
    Sleep    3

Preencher dados de billing address e clicar em Save and Continue
    Input Text          ${CAMPO_NOME}            ${NOME}
    Input Text          ${CAMPO_SOBRENOME}       ${SOBRENOME}
    Input Text          ${CAMPO_ENDERECO}        ${ENDERECO}
    Input Text          ${CAMPO_CIDADE}          ${CIDADE} 
    Input Text          ${CAMPO_CEP}             ${CEP}
    Input Text          ${CAMPO_TELEFONE}        ${TELEFONE}
    Sleep    3
    Click Element       ${BOTAO_SALVAR_CONTINUAR_E_LOGIN}
    Sleep    3

Velocidade de frete
    Click Element       ${BOTAO_SALVAR_CONTINUAR_E_LOGIN}
    Sleep    3
Selecionar tipo de pagamento e clicar em Save and Continue
    Click Element       ${BOTAO_TIPO_PAGAMENTO_CHECK}
    Click Element       ${BOTAO_SALVAR_CONTINUAR_E_LOGIN}
    Sleep    3

Fazer Logout 
    Click Element       ${BOTAO_MEU_USUARIO}
    Sleep    3
    Click Element       ${BOTAO_LOGOUT}
    Sleep    3
    Click Element       ${BOTAO_HOME}
    Sleep    3

Acessar Conta
    Click Element       ${BOTAO_MEU_USUARIO}
    Sleep    3
    Click Element       ${BOTAO_LOGIN}
    Sleep    3
    Input Text          ${CAMPO_EMAIL}           ${EMAIL}
    Input Text          ${CAMPO_SENHA}           ${SENHA}  
    Click Element       ${BOTAO_SALVAR_CONTINUAR_E_LOGIN}
    Sleep    3

Fechar modal e continuar comprando
    Click Element       ${BOTAO_FECHAR_MODAL}
    Sleep    3

Selecionar categoria Masculina
    Click Element       ${MENU_MASCULINO}
    Sleep    3
    Click Element       ${SELECIONAR_CAMISETAS}
    Sleep    3

Selecionar produto masculino
    Click Element       ${SELECIONAR_PRODUTO_MASCULINO}
    Sleep    3

Confimar Endereco Salvo para Compra
    Click Element       ${BOTAO_SALVAR_CONTINUAR_E_LOGIN}
    Sleep    3

Fechar Google
    Close Browser