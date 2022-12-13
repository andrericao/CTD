select c.Contato, UPPER(c.titulo) as Título
from  Clientes c
inner join faturas f on c.clienteID = f.clienteID
where f.dataFatura < "1996-12-31";

/*

SELECT CONCAT(LEFT(Contato, INSTR(Contato, ' ')), substring(RIGHT(Contato, LENGTH(Contato) - INSTR(Contato, ' ')), 1, 1)) as CONTATO,
UPPER(Titulo) as Titulo
FROM faturas f
INNER JOIN clientes c
ON f.ClienteID = c.ClienteID
WHERE f.dataFatura < '1996-12-31';

*/