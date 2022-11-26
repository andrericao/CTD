/* MUSIMUNDOS AULA 13
1 - Utilizando a tabela Faturas, extraia a quantidade de faturas emitidas por
data. Responda:
*/

SELECT COUNT(id) AS Faturas, DATE_FORMAT(data_fatura, '%d / %M / %Y') AS Dia FROM faturas
GROUP BY data_fatura;

/*
a) Em qual data foram emitidas mais faturas? Dia '2010-02-12'
b) Quantas faturas foram emitidas nesta data? 405
*/


/*
2. Liste o país de cobrança, a quantidade, o total, a média e o maior valor das
faturas emitidas por país, na data encontrada no exercício anterior..
*/

SELECT * FROM faturas;

SELECT pais_cobranca País, COUNT(id) 'QTD Faturas', SUM(valor_total) 'Total por País', FORMAT(AVG(valor_total),2) 'Média Valor', MAX(valor_total) 'Maior Fatura' FROM faturas
GROUP BY País;

/*
a) Qual o valor total de faturas do Canadá? 303.96
b) Qual a média das faturas do Brasil? 5.43
c) Quantas faturas a Argentina possui? 7
d) Qual o maior valor da fatura dos Estados Unidos? 23,86
*/


/*
3. Utilizando a tabela Clientes, liste os países que possuem mais de 4 clientes.
Responda:
*/

SELECT pais País, COUNT(id) QTDClientes FROM clientes
GROUP BY País
HAVING QTDClientes > 4;


/*
a) Quantos países foram listados? 4
b) Quantos clientes possuem os Estados Unidos? 13
c) Quais são os países que possuem 5 clientes? Brazil and France
*/


/*
4. Liste os clientes do Brasil que moram no estado de São Paulo.
*/

SELECT CONCAT(nome, '  ', sobrenome) Clientes, estado Estado FROM clientes
WHERE Estado like 'SP';


/*
5. Na tabela cancoes, liste a quantidade de canções, o preço unitário e o valor
total das canções por id do gênero. Responda:
*/

select * from cancoes;

SELECT COUNT(id) QTDCanções, preco_unitario Valor, FORMAT(AVG(preco_unitario),2) 'Média de Preços', SUM(preco_unitario) 'Valor por Gênero', id_genero Gênero FROM cancoes
GROUP BY Gênero;

/*
a) Qual gênero possui mais canções? 1
b) Qual o valor total das canções de gênero 4?  328.68
c) Qual o valor unitário das canções?  0.99 o mesmo por média
d) Qual o valor unitário das canções do gênero 21? 1.99 o mesmo por média
*/