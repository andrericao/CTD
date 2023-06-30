*** Settings ***
Library                 SeleniumLibrary

*** Variables ***
${SERVER}               localhost:5000
${SITE}                 https://www.saucedemo.com
${NAVEGADOR}		  	chrome
${CAMPO_USUARIO}	  	id=user-name
${USUARIO}			  	standard_user
${PASSWORD}			    secret_sauce
${CAMPO_PASSWORD}	  	id=password
${BOTAO_LOGIN}		  	id=login-button


*** Keywords *** 
Acessar site
    Open Browser        ${SITE}             ${NAVEGADOR}
	Maximize Browser Window

Fazer login
    Input Text 			${CAMPO_USUARIO}	${USUARIO}
    Input Text			${CAMPO_PASSWORD}	${PASSWORD}
    lick Element 		${BOTAO_LOGIN}