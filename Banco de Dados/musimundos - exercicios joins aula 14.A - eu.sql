/* EXERCÍCIOS DO CONTEUDO DO CURSO 14.A - MUSIMUNDOS
1 - Faça uma consulta no banco de dados onde mostre todos os registros que contenham músicas com seus gêneros, 
E que o compositor seja Willie Dixon, E que tenham o gênero Blues. A 2ª música encontrada foi: Pretty Baby
*/

SELECT * FROM cancoes; /*Seleciono a tabela toda para ter uma visão de como resolver*/
 
SELECT * FROM generos; /* mesma coisa, não apaguei para saberem minha linha de raciocínio*/

SELECT c.nome Música, c.compositor Compositor, g.nome Gênero 
FROM cancoes c
INNER JOIN generos g
ON c.id_genero = g.id
/*HAVING Compositor like 'Willie%' AND Gênero like 'Blues'*/;

/*
2 - Faça uma consulta ao nosso banco de dados que nos retorna as únicas músicas que possuem gênero rock. 
Qual é a música que aparece em quarto lugar? Restless and Wild
*/

SELECT * FROM cancoes;

SELECT * FROM generos;

SELECT c.nome Música, g.nome Gênero 
FROM cancoes c
INNER JOIN generos g
ON c.id_genero = g.id
HAVING Gênero like 'Rock';

/* 3 - Faça uma consulta ao nosso banco de dados que nos traga o título do álbum e o autor, 
para saber se o que estamos vendendo está correto.
Qual o título do álbum que aparece na posição número 10? Audioslave
*/

SELECT * FROM artistas inner join albuns; /*aqui testei pra ver se conseguia selecionar tudo das duas tabelas*/

SELECT art.nome Artista, alb.titulo 'Título do Álbum'
FROM albuns alb
INNER JOIN artistas art
ON alb.id_artista = art.id;  

/*
4 - Faça uma consulta que retorne o nome das músicas e o tipo de arquivo "MPEG audio file". 
Qual o nome da músca que aparece na posição número 4? Inject the Venom
*/

SELECT * FROM cancoes INNER JOIN tipos_de_arquivo;

SELECT c.nome Canção, ta.nome Formato
FROM cancoes c 
INNER JOIN tipos_de_arquivo ta
ON c.id_tipo_de_arquivo = ta.id
HAVING Formato like 'MPEG%';

/* 
5 - Faça uma consulta na tabela empregados. O cargo que aparece na 3° posição é: Sales Support Agent
*/

SELECT * FROM empregados
WHERE id = 3; 

/* RANKING
6- Faça uma consulta com o nome de todas as músicas que estão em uma lista de reprodução, 
e o nome da lista de reprodução a que pertencem.

Observação! 
Tenhamos cuidado para não repetir os nomes das músicas.
Para esta consulta, teremos que usar informações das tabelas cancoes, cancoes_playlists e playlists. 
O título da música na 5° posição é: Princess of the Dawn
*/

SELECT * 
FROM cancoes
INNER JOIN cancoes_playlists;

SELECT DISTINCT(c.nome) Música, p.nome 'Lista de Reprodução'
FROM cancoes c 
INNER JOIN cancoes_playlists cp
ON c.id = cp.id_cancao
INNER JOIN playlists p
ON cp.id_playlist = p.id;

/*
 7 - O departamento de desenvolvimento da Musimundos está preparando a parte do aplicativo em que acessamos uma determinada música. 
 Eles nos dizem que um texto específico deve aparecer abaixo da imagem da música:
 "A música" (nome do tema) "foi composta por" (compositor do tema).
 Faça uma consulta ao nosso banco de dados que nos traga o nome e o compositor de cada música, 
 sem repetições, adicionando o texto acima. O primeiro resultado é: 
 'A música  For Those About To Rock (We Salute You)  foi composta por  Angus Young, Malcolm Young, Brian Johnson'
 */
 
 SELECT * FROM cancoes;
 
 SELECT DISTINCT(CONCAT('A música  ',nome,'  foi composta por  ',compositor)) 'Música por Compositor'
FROM cancoes;
 
 /*
 8 - Faturas: 
 Faça uma consulta ao banco de dados que nos traga a primeira coluna não nula que encontrar entre as colunas estado_cobranca,
 pais_cobranca e cep_cobranca. O primeiro resultado obtido é: Germany
 */
 
 SELECT COALESCE(estado_cobranca, pais_cobranca, cep_cobranca) Fatura FROM faturas;
 
 /*
9 - Idade Empregados: 
Faça uma consulta no banco de dados que mostre a diferença entre sua data de nascimento e a data de contratação. 
Digite a terceira diferença que você obteve. RESPOSTA --> 27

DICA: Lembre-se de que DATEDIFF () retorna a diferença entre as datas expressas em DIAS. 
Levando isso em consideração e sabendo que um ano tem 365 dias, como você faria a consulta?
Para ajudá-lo, apresentamos a função FLOOR (), que arredonda qualquer número para casas decimais.
*/

SELECT data_nascimento Nascido, data_contratacao Contratado, FLOOR(DATEDIFF(data_contratacao, data_nascimento) / 365) AS Diferença FROM empregados;

/*
10 - Faça uma consulta ao banco de dados que traga todas as 
faturas do cliente número 2 solicitadas por sua data e extraia o mês. 
Qual foi o mês da sua última fatura? 2
*/

SELECT id_cliente 'Cliente 2', EXTRACT(month FROM(data_fatura)) Mês FROM faturas;







