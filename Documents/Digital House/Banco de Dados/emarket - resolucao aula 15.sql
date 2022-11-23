select c.Contato, UPPER(c.titulo) as Título
from  Clientes c
inner join faturas f on c.clienteID = f.clienteID
where f.dataFatura < "1996-12-31";