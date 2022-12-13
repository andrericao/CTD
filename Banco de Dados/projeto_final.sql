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

CREATE TABLE situacoes(
situacao_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(50)
);

CREATE TABLE filiais(
filial_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(100),
endereco_id INT,
FOREIGN KEY (endereco_id)
	REFERENCES enderecos (endereco_id),
);

CREATE TABLE clientes(
cliente_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(100),
sexo ENUM('M', 'F'),
endereco_id INT,
FOREIGN KEY (endereco_id)
	REFERENCES enderecos (endereco_id)
);

CREATE TABLE imoveis(
imovel_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
endereco VARCHAR(100),
valor DECIMAL,
situacao VARCHAR(30),
tamanho VARCHAR(50),
situacao_id INT,
proprietario_id INT,
corretor_id INT,
filial_id INT,
endereco_id INT,
FOREIGN KEY (endereco_id)
	REFERENCES enderecos (endereco_id),
FOREIGN KEY (filial_id)
	REFERENCES filiais (filial_id),
FOREIGN KEY (corretor_id)
	REFERENCES funcionarios (funcionario_id),
FOREIGN KEY (proprietario_id)
	REFERENCES clientes (cliente_id),
FOREIGN KEY (situacao_id)
	REFERENCES situacoes (situacao_id)
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

INSERT INTO enderecos (nome, cidade_id) /*imoveis*/
VALUES ('Avenida Camaquã', 20), ('Rua Valdelirio Vieira Bittencourt', 20),
('AVENIDA BAHIA', 5), ('EDF PRIMAVERA - CENTRO', 5),
('Bairro: Residencial dos Lagos', 2), ('Rua São José do Rio Pardo', 2),
('Avenida Aminthas de Barros, 647', 14), ('Rua Brasil, 1658 - Vila Brasil', 14),
('Rua Adriático, 236 - Vila Brasil', 13), ('Avenida Rio de Janeiro, 1375 - Centro', 13);
/*
CREATE TABLE funcionarios(
funcionario_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(50),
idade INT,
sexo_id INT,
funcao_id INT,
endereco_id INT,
FOREIGN KEY (sexo_id)
	REFERENCES sexos (sexo_id),
FOREIGN KEY (endereco_id)
	REFERENCES enderecos (endereco_id), 
FOREIGN KEY (funcao_id)
	REFERENCES funcoes (funcao_id)
);
*/
SELECT * FROM enderecos;
/*
INSERT INTO funcionarios (nome, idade, sexo, funcao_id, endereco_filial_id)
VALUES ('Elton', 22, 'M', 1, 1), ('Lucas', 25, 'M', 1, 1), ('Joab', 30, 'M', 2, 1), ('Janete', 15, 'F', 3,1),
('André', 32, 'M', 1, 2), ('Fernando', 24, 'M', 1, 2), ('Adriana', 45, 'F', 2, 2), ('Thomaz', 34, 'M', 3, 2),
('Gariela', 33, 'F', 1, 3), ('Roberto', 21, 'M', 1, 3), ('João', 35, 'M', 2, 3), ('Nathaia', 37, 'F', 3, 3),
('Agnaldo', 26, 'M', 1, 4), ('Henrique', 30, 'M', 1, 4), ('Inácio', 45, 'M', 2, 4), ('Paula', 37, 'F', 3, 4),
('Igor', 32, 'M', 1, 5), ('Wanderson', 50, 'M', 1, 5), ('Brito', 41, 'M', 2, 5), ('George', 65, 'M', 3, 5);*/

/*
CREATE TABLE filiais(
filial_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
endereco_id INT,
FOREIGN KEY (endereco_id)
	REFERENCES enderecos (endereco_id),
);
*/

INSERT INTO filiais (nome, endereco_id)
VALUES ('Workbench Estágio', 5), ('Workbench Júnior',2), ('Workbench Pleno',  14), ('Workbench Sênior', 13), ('Workbench Vendedor de Cursos', 20);

