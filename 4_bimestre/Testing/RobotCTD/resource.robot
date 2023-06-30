*** Settings ***
Resource	andre.robot


*** Keywords *** 
Abrir o site da loja
    Open Browser        https://${SITE}             ${NAVEGADOR}
	Maximize Browser Window

Fazer login
    Input Text 			${CAMPO_USUARIO}	${USUARIO}
    Input Text			${CAMPO_PASSWORD}	${PASSWORD}
    lick Element 		${BOTAO_LOGIN}