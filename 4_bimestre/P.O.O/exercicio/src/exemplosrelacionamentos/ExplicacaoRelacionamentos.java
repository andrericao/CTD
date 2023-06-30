package com.aulasdepoo.aula7e8.exemplosrelacionamentos;

public class ExplicacaoRelacionamentos {

    /*
    -Relações entre as classes dizem como os objetos se comunicam entre si e
    como trocam mensagens.

    -A cardinalidade em java deve ser observada pra ver se implementa no java
    como atributo ou como array ou list

	- Associação ------>  :  TEM ou SABE ---- UNILATERAL. DESCREVE UMA CONEXÃO
	    ENTRE OBJETOS. Ex: classe A conhece classe B, mas classe B não conhece
	    classe A. Exemplo Pessoa e Endereço, uma pessoa SABE seu endereço, mas
	    o endereço não sabe quem mora la.
    - Agregação  -----<>  losango: FAZ PARTE DE ---- QD A CLASSE NÃO APENAS
        POSSUI OU CONHECE OUTRA MAS TAMBEM FAZ PARTE DELA. Ex: Uma bicicleta é
        composta de vários outros elementos (objetos), como rodas, pedais,
        freios e chassi. Por meio de um processo de montagem, juntamos os
        elementos e formamos uma bicicleta.
        O que acontecerá se fizermos o processo reverso, no caso de desmontarmos
         a bicicleta? Os outros elementos ainda existem e servem ao seu
         propósito? A resposta é sim, pois cada elemento pode ser utilizado em
         outra bicicleta, ou até mesmo em outro tipo de transporte como um
         triciclo ou monociclo. Existe uma relação entre os agregados e o todo,
          mas os componentes podem existir mesmo que o todo seja destruído.
	- Composição -----<> so que losango é preenchido: SEM O TODO QD UMA CLASSE É
	    COMPOSTA POR OUTRA CLASSE. EX: pessoa é feita de orgãos. É o caso em que
	     uma classe de objeto A “possui” uma classe de objeto B, e B não tem
	     razão de existir sem A.
	     Composição é um tipo mais forte de agregação, em que todas as partes (classes)
	     podem pertencer apenas a um todo, neste caso, a parte não tem significado
	     sem o todo.

    - PODE FORÇAR A TER NO CONSTRUTOR.

	-Diferença de agregação e composição: na composição uma classe é composta por outra, portanto uma das classes
	 não faz sentido por si mesma e depende da outra, sendo que na agregação um pode exitir sem a outra

*/


}