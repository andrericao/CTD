/*
Faça uma consulta que exiba as locações por empregado, no período de
dois meses (01/07/2005 a 31/08/2005). Sua consulta deve trazer as
seguinte informações:
● ID do Inventário
● Id da Loja
● Nome e sobrenome do cliente
● Nome do filme locado
● Nome do funcionário que locou o filme
● Data da locação
● preço da locação
*/

SELECT i.inventario_id, i.loja_id, concat(c.nome, ' ', c.sobrenome) as Cliente, f.titulo as Filme, 
concat(fu.nome, ' ', fu.sobrenome) as Funcionario, l.data_locacao, f.preco_locacao
FROM inventario i 
INNER JOIN locacao l
ON i.inventario_id = l.inventario_id
INNER JOIN cliente c
ON l.cliente_id = c.cliente_id
INNER JOIN funcionario fu
ON l.funcionario_id = fu.funcionario_id
INNER JOIN filme f
ON i.filme_id = f.filme_id

/*
1. Liste todos os filmes e o idioma dos filmes. Exibir todos os idiomas,
mesmo que não exista filme relacionado ao idioma.
*/


/*2. Liste o nome completo do cliente, o id da locação, a data da locação,
a data do pagamento e o valor do pagamento. Nesta consulta devem
aparecer, inclusive, as locações que não foram pagas.
*/


/*
3. Liste todos os filmes, o preço da locação e a quantidade de locação
por filme. Esta consulta deve trazer, inclusive, os filmes que não
foram locados.
*/*


/*
4. Aproveite o consulta anterior e inclua a categoria dos filmes,
trazendo, igualmente, a quantidade de locação por filmes, inclusive os
filmes que não foram locados.
*/
