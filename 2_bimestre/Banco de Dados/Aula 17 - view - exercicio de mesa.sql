CREATE VIEW DADOS_CLIENTE AS
SELECT clienteID, contato, fax, telefone 
FROM clientes;

SELECT ClienteID, Fax FROM  clientes
WHERE Fax like '';

SELECT * FROM dados_cliente 
WHERE Fax like '';

CREATE VIEW FORNECEDOR_DADOS AS 
SELECT ProvedorID, Contato, Empresa, concat(Endereco, ' ', Cidade,' ',CodigoPostal,' ',Pais) AS endereco
FROM provedores;

SELECT * FROM provedores
WHERE endereco LIKE 'Av. das Americanas%';

SELECT * FROM fornecedor_dados 
WHERE endereco LIKE 'Av. das Americanas%';

CREATE VIEW Produtos_Estoques AS
SELECT ProdutoID, ProdutoNome, FORMAT (PrecoUnitario, 0) AS precoUnitario, UnidadesEstoque,UnidadesPedidas






