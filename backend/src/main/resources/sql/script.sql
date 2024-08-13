CREATE TABLE colaboradores (
	ID integer auto_increment NOT NULL PRIMARY KEY,
	NOME varchar(200),
	SENHA varchar(1000),
	SCORE integer null,
	ID_chefe integer null
);

ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utfmb4_0900_ai_ci;