/* OBSERVAÇÕES DA PROFESSORA JANETE
Algumas observações: 
Acho que vc inverteu a notação do relacionamento times e jogos. 

ACERTAR --> 
Na entidade Paises vc esqueceu do atributo nome, né? <--

ACERTAR --> 
Cada Jogador participa de um time, mas em um time tem vários jogadores. 
Está correto. Entretanto, vc colocou o id do jogador em times e deveria ser o contrário. <--

ACERTRA -->
Não se esqueça que a chave estrangeira fica do lado de muitos. Entre times e grupos vc relacionou n:n. Será que é mesmo? 
Cada time pertence a um grupo, mas cada grupo tem vários times, né? O relacionamento, então, deveria ser 1:n. 
Vc colocou o relacionamento n:n entre jogos e estádios tb. Mas lembre-se que cada jogo é realizado em um estádio, mas cada estádio comporta vários jogos. <--

Não se esqueça de que, em relacionamento n:n precisa ter uma entidade intermediária, mas no seu caso, 
os relacionamentos são 1:n mesmo. Nas entidades estádios e grupos não tem nem um atributo que caracterize, nem um nome, assim como em país. 

Vc confundiu muito os relacionamento aí. Merece rever essa materia, hein?
*/

DROP DATABASE IF EXISTS Copa_do_mundo;
CREATE DATABASE copa_do_mundo;
USE copa_do_mundo;

CREATE TABLE paises( /*criar tabela nome: LINHA 90*/
pais_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY
);

CREATE TABLE cidades(/*POR NOME: LINHA 93*/
cidade_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
pais_id INT, 
FOREIGN KEY (pais_id) 
REFERENCES paises (pais_id) 
);

CREATE TABLE posicoes_em_campo(/* POR NOME: LINHA 96*/
posicao_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY
);

CREATE TABLE jogadores( /*criar tabela times: LINHA 99 A 104*/
jogador_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(100),
numero INT,
posicao_id INT,
pais_id INT,
FOREIGN KEY (posicao_id)
	REFERENCES posicoes_em_campo (posicao_id),
FOREIGN KEY (pais_id)
	REFERENCES paises (pais_id)
);

CREATE TABLE times(/*COLOCAR GRUPO: LINHA 106 A 111*/
time_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(100),
pais_id INT,
FOREIGN KEY (pais_id)
	REFERENCES paises (pais_id)
);

CREATE TABLE estadios(/*EU COLOQUEI CIDADE PQ A CIDADE JÁ PERTENCE A UM PÁIS*/
estadio_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(100),
cidade_id INT,
FOREIGN KEY (cidade_id)
	REFERENCES cidades (cidade_id)
);


CREATE TABLE jogos(/*EU TROUXE A CHAVE ESTRANGEIRA DO ESTÁDIO*/
jogo_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
hora TIME,
dia DATE,
time_id INT,
estadio_id INT,
FOREIGN KEY (time_id)
	REFERENCES times (time_id),
FOREIGN KEY (estadio_id)
	REFERENCES estadios (estadio_id)
);

CREATE TABLE grupos(
grupo_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome CHAR(1)
);

ALTER TABLE paises
ADD nome VARCHAR(100);

ALTER TABLE cidades 
ADD nome VARCHAR(100);

ALTER TABLE posicoes_em_campo
ADD nome VARCHAR(100);

ALTER TABLE jogadores 
ADD time_id INT;

ALTER TABLE jogadores
ADD FOREIGN KEY (time_id)
REFERENCES times (time_id);

ALTER TABLE times
ADD gropo_id INT;

ALTER TABLE times
ADD FOREIGN KEY (gropo_id)
	REFERENCES grupos (grupo_id);
    
ALTER TABLE times
CHANGE gropo_id grupo_id INT;
    
/*Quis fazer desse jeito, COM O ALTER TABLE, a fim de praticar*/
