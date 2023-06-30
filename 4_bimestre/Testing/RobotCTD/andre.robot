*** Settings ***
Library		SeleniumLibrary
Resource    resource.robot

*** Variables ***
${SITE}                 www.saucedemo.com
${NAVEGADOR}		  	chrome
${CAMPO_USUARIO}	  	id=user-name
${USUARIO}			  	standard_user
${PASSWORD}			    secret_sauce
${CAMPO_PASSWORD}	  	id=password
${BOTAO_LOGIN}		  	id=login-button

*** Test Case ***
Open Browser to login Page
    Abrir o site da loja
	Fazer login