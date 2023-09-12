DROP TABLE IF EXISTS Dentista;

CREATE TABLE Dentista
(
    id                 INT PRIMARY KEY AUTO_INCREMENT,
    nome               VARCHAR(255) NOT NULL,
    cro                VARCHAR(80)  NOT NULL,
    data_nascimento    DATE         NOT NULL,
    especialidade      VARCHAR(80)  NOT NULL
);