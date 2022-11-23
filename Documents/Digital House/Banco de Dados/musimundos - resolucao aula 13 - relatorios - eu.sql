/*
1 - Utilizando a tabela Faturas, extraia a quantidade de faturas emitidas por
data. Responda:
a) Em qual data foram emitidas mais faturas? Dia '2010-02-12'
b) Quantas faturas foram emitidas nesta data? 405
*/

SELECT COUNT(id) AS Faturas, data_fatura AS Dia FROM faturas
/*FORMAT DATA('dd/mm/YYYY')*/
GROUP BY data_fatura;

/*
2. Liste o país de cobrança, a quantidade, o total, a média e o maior valor das
faturas emitidas por país, na data encontrada no exercício anterior..

a) Qual o valor total de faturas do Canadá? 303.96
b) Qual a média das faturas do Brasil? 5.43
c) Quantas faturas a Argentina possui? 7
d) Qual o maior valor da fatura dos Estados Unidos? 23,86

*/

SELECT * FROM faturas;

SELECT pais_cobranca AS País, COUNT(id) AS 'Quantidade de Faturas', FORMAT(SUM(valor_total),2) AS Total, FORMAT(AVG(valor_total),2) AS Média, MAX(valor_total) AS "Maior Valor" FROM faturas
GROUP BY pais_cobranca;