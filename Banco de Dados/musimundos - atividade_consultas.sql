/* 01 */
SELECT c.nome as Musica, g.nome as Genero
FROM cancoes c
INNER JOIN generos g
ON c.id_genero = g.id
ORDER BY g.nome;

/* 02 */

SELECT CONCAT(cl.nome, ' ', cl.sobrenome) as Clientes, cl.pais as Pais
FROM clientes cl
ORDER BY Clientes;  

/* 03 */

SELECT c.nome as Musica, a.titulo as Album
FROM cancoes c
INNER JOIN albuns a
ON c.id_album = a.id;

/* 04 */

SELECT COUNT(c.id) as QtdMusicas, g.nome as Genero
FROM cancoes c
INNER JOIN generos g
ON c.id_genero = g.id
GROUP BY Genero
ORDER BY QtdMusicas DESC;


