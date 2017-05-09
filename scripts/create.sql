CREATE TABLE SETOR
(
	nome varchar(10),
	disponibilidade boolean
);

CREATE TABLE VAGA
(
	id integer not null,
	disponibilidade boolean,
	tipo integer not null
);