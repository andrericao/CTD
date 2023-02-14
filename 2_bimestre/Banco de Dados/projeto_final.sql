DROP DATABASE IF EXISTS imobiliaria;
CREATE DATABASE imobiliaria;
USE imobiliaria;

CREATE TABLE funcoes(
funcao_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(50)
);

CREATE TABLE estados(
estado_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome CHAR(2)	
);

CREATE TABLE cidades(
cidade_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(100),	
estado_id INT,
FOREIGN KEY (estado_id)
	REFERENCES estados (estado_id)
);

CREATE TABLE enderecos(
endereco_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(150),
cidade_id INT,
FOREIGN KEY (cidade_id)
	REFERENCES cidades (cidade_id)
);

CREATE TABLE funcionarios(
funcionario_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(50),
idade INT,
sexo ENUM('M', 'F'),
funcao_id INT,
endereco_filial_id INT,
FOREIGN KEY (endereco_filial_id)
	REFERENCES enderecos (endereco_id), 
FOREIGN KEY (funcao_id)
	REFERENCES funcoes (funcao_id)
);

CREATE TABLE filiais(
filial_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(100),
endereco_id INT,
FOREIGN KEY (endereco_id)
	REFERENCES enderecos (endereco_id)
);



CREATE TABLE clientes(
cliente_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(100),
sexo ENUM('M', 'F'),
interesse ENUM ('Vender', 'Comprar')
);

CREATE TABLE imoveis(
imovel_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
descricao VARCHAR(500),
valor DECIMAL,
situacao ENUM ('Aluguel', 'Venda'),
proprietario_id INT,
corretor_id INT,
comprador_id INT,
filial_id INT,
endereco_id INT,
FOREIGN KEY (comprador_id)
	REFERENCES clientes (cliente_id),
FOREIGN KEY (endereco_id)
	REFERENCES enderecos (endereco_id),
FOREIGN KEY (filial_id)
	REFERENCES filiais (filial_id),
FOREIGN KEY (corretor_id)
	REFERENCES funcionarios (funcionario_id),
FOREIGN KEY (proprietario_id)
	REFERENCES clientes (cliente_id)
);

CREATE TABLE vendas (
vendas_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
imovel_id INT,
comprador_id INT,
FOREIGN KEY (imovel_id)
	REFERENCES imoveis (imovel_id),
FOREIGN KEY (comprador_id)
	REFERENCES clientes (cliente_id)
);

INSERT INTO estados (nome)
VALUES ('RJ'), ('SP'), ('ES'), ('PE'), ('PB'), ('BA'), ('MG'), ('AL'), ('AM'), ('AP'), ('MA'), ('GO'), ('MT'), ('MS'), ('SC'), ('SE'), ('DF'), ('TO'), ('RR'), ('RO');

INSERT INTO funcoes (nome)
VALUES ('Corretor'), ('Serviço Gerais'), ('Representante');


INSERT INTO cidades (nome, estado_id)
VALUES ('Rio de Janeiro', 1), ('São Paulo', 2),('Vitória', 3), ('Olinda', 4), ('João Pessoa', 5), ('Salvador', 6), ('Belo Horizonte', 7), ('Maceió', 8),
('Manaus', 9), ('Macapá', 10), ('São Luiz', 11), ('Goiânia', 12), ('Cuiabá', 13), ('Campo Grande', 14), ('Florianópolis', 15), ('Aracajú', 16), ('Brasília', 17), ('Palmas', 18), ('Boa Vista', 19), ('Porto Velho', 20);

INSERT INTO enderecos (nome, cidade_id)/*filiais*/
VALUES ('Av. Goiás, 216, Zona 01, Cianorte', 5), ('Avenida João Batista Junqueira, 59',2), ('Av. Brasil, 3113 - Centro', 14), ('Rua Brasil, 1711 - Vila Brasil', 13), ('Rua Felicíssimo Alfonsin, 688 - Centro, Tapes', 20); 

SELECT * FROM enderecos;

SELECT * 
FROM filiais f
INNER JOIN enderecos e
ON e.endereco_id = f.endereco_id;

INSERT INTO enderecos (nome, cidade_id) /*imoveis*/
VALUES ('Avenida Camaquã', 20), ('Rua Valdelirio Vieira Bittencourt', 20),
('AVENIDA BAHIA', 5), ('EDF PRIMAVERA - CENTRO', 5),
('Bairro: Residencial dos Lagos', 2), ('Rua São José do Rio Pardo', 2),
('Avenida Aminthas de Barros, 647', 14), ('Rua Brasil, 1658 - Vila Brasil', 14),
('Rua Adriático, 236 - Vila Brasil', 13), ('Avenida Rio de Janeiro, 1375 - Centro', 13);

SELECT f.nome 'Imobiliária', e.nome 'Localização', c.nome 'Clientes'
FROM enderecos e
INNER JOIN filiais f
ON e.endereco_id = f.filial_id
INNER JOIN clientes c
ON e.endereco_id = c.cliente_id;

INSERT INTO funcionarios (nome, idade, sexo, funcao_id, endereco_filial_id)
VALUES ('Elton', 22, 'M', 1, 1), ('Lucas', 25, 'M', 1, 1), ('Joab', 30, 'M', 2, 1), ('Janete', 15, 'F', 3,1),
('André', 32, 'M', 1, 2), ('Fernando', 24, 'M', 1, 2), ('Adriana', 45, 'F', 2, 2), ('Thomaz', 34, 'M', 3, 2),
('Gariela', 33, 'F', 1, 3), ('Roberto', 21, 'M', 1, 3), ('João', 35, 'M', 2, 3), ('Nathaia', 37, 'F', 3, 3),
('Agnaldo', 26, 'M', 1, 4), ('Henrique', 30, 'M', 1, 4), ('Inácio', 45, 'M', 2, 4), ('Paula', 37, 'F', 3, 4),
('Igor', 32, 'M', 1, 5), ('Wanderson', 50, 'M', 1, 5), ('Brito', 41, 'M', 2, 5), ('George', 65, 'M', 3, 5);

INSERT INTO filiais (nome, endereco_id)
VALUES ('Workbench Estágio', 1), ('Workbench Júnior', 2), ('Workbench Pleno', 3), ('Workbench Sênior', 4), ('Workbench Vendedor de Cursos', 5);

INSERT INTO clientes (nome, sexo)
VALUES ('Valéria', 'F'/*, 'Vender', 6 - 'Comprar', 15 - 'Vender', 11 - 'Vender', 8*/),
 ('Marquinho', 'M'/*, 'Vender', 7 - 'Vender', 14*/),
('Garcia', 'M'/*, 'Comprar', 10*/),
('Robson', 'M'/*, 'Vender', 9*/), ('Russa', 'F'/*, 'Vender', 10 - 'Comprar', 9*/),
('Júlio', 'M'/*, 'Comprar', 12*/), ('Ludmila', 'F'/*, 'Comprar', 11*/),
('Jackson', 'M'/*, 'Vender', 12*/), ('Renatinho', 'M'/*, 'Vender', 13*/),
('Sérgio', 'M'/*, 'Comprar', 8*/), ('Camila', 'F'/*, 'Comprar', 14*/),
('Homero', 'M'/*, 'Vender', 15*/);

-- ===================================  TODOS FILIAS E FUNCIONARIOS EM TODAS AS REGIÕES  =================================
/*CREATE VIEW funcionario_por_filial
AS*/
SELECT f.nome 'Funcionário', fun.nome 'Função', fil.nome 'Filial', e.nome 'Localização', c.nome 'Cidade', es.nome 'Estado'
FROM funcionarios f
LEFT JOIN funcoes fun
ON f.funcao_id = fun.funcao_id
INNER JOIN filiais fil
ON fil.endereco_id = f.endereco_filial_id
INNER JOIN enderecos e
ON e.endereco_id = fil.endereco_id
INNER JOIN cidades c
ON e.cidade_id = c.cidade_id
INNER JOIN estados es
ON es.estado_id = c.estado_id
WHERE fun.nome LIKE 'Corretor';

INSERT INTO imoveis (descricao, valor, situacao, proprietario_id, corretor_id, comprador_id, filial_id, endereco_id)
VALUES ('Lorem ipsum dolor sit amet, consectetur adipiscing elit', 1200000.00, 'Venda', 1, 17, NULL, 5, 6), -- 1 6
('Lorem ipsum dolor sit amet, consectetur adipiscing elit', 500000.00, 'Venda', 2, 18, NULL, 5, 7), -- 2 7
('Lorem ipsum dolor sit amet, consectetur adipiscing elit', 100000.00, 'Venda', 1, 1, 10, 1, 8), -- 3 8 Sérgio Alugar
('Lorem ipsum dolor sit amet, consectetur adipiscing elit', 950000.00, 'Venda', 4, 2, 5, 1, 9), -- 4 9 Russa Comprar
('Lorem ipsum dolor sit amet, consectetur adipiscing elit', 650000.00, 'Venda', 5, 5, 3, 2, 10), -- 5 10 Garcia Comprar
('Lorem ipsum dolor sit amet, consectetur adipiscing elit', 800000.00, 'Aluguel', 1, 6, 7, 2, 11), -- 6 11 Ludmilla Alugar
('Lorem ipsum dolor sit amet, consectetur adipiscing elit', 800000.00, 'Venda', 8, 9, NULL, 3, 12), -- 7 12
('Lorem ipsum dolor sit amet, consectetur adipiscing elit', 150000.00, 'Venda', 9, 10, NULL, 3, 13), -- 8 13 
('Lorem ipsum dolor sit amet, consectetur adipiscing elit', 150000.00, 'Aluguel', 2, 13, 11, 4, 14), -- 9 14 Camila Alugar
('Lorem ipsum dolor sit amet, consectetur adipiscing elit', 900000.00, 'Venda', 12, 14, 1, 4, 15); -- 10 15 Valéria Alugar


SELECT i.endereco_id 'Código Endereço',  i.proprietario_id 'Dono', c. nome 'Nome', f.nome 'Representante', f.funcionario_id 'ID', fu.nome 'Função', fil.nome 'Filial'
FROM imoveis i
INNER JOIN filiais fil
ON i.filial_id = fil.filial_id
INNER JOIN funcionarios f 
ON i.filial_id = f.endereco_filial_id
INNER JOIN clientes c
ON i.proprietario_id = c.cliente_id
INNER JOIN funcoes fu
ON fu.funcao_id = f.funcao_id;

SELECT * FROM imoveis;

SELECT * FROM clientes;

SELECT * FROM funcionarios;

SELECT f.funcao_id, COUNT(f.funcao_id), fu.nome 'Função' 
FROM funcionarios f
INNER JOIN funcoes fu
ON fu.funcao_id = f.funcao_id
group by fu.funcao_id;

SELECT * FROM filiais;

SELECT * FROM funcoes;

SELECT * FROM imoveis;

SELECT * FROM funcionarios;

SELECT * FROM clientes;

DELIMITER $$
CREATE PROCEDURE quantidade_de_imovel_por_cliente()
BEGIN
SELECT c.nome 'Proprietrio', COUNT(i.imovel_id) 'QTD de Imóveis', SUM(i.valor) 'Valor em Imóvel'
FROM clientes c
INNER JOIN imoveis i
ON i.proprietario_id = c.cliente_id
INNER JOIN funcionarios f
ON i.corretor_id = f.funcionario_id
GROUP BY c.nome;
END
$$

call quantidade_de_imovel_por_cliente();