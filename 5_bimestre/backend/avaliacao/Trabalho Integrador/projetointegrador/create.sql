DROP TABLE IF EXISTS Clinica;
CREATE TABLE Clinica(
    id              VARCHAR(36) PRIMARY KEY NOT NULL,
    nome            VARCHAR(100) NOT NULL,
    cnpj            VARCHAR(18) NOT NULL,
    razaoSocial     VARCHAR(500) NOT NULL,
)