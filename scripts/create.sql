CREATE TABLE SETOR
(
	nome varchar(10),
	disponibilidade boolean
);

CREATE TABLE VAGA
(
	id_vaga integer not null,
	disponibilidade boolean,
	tipo integer not null
);

CREATE TABLE TIPO
(
	id_tipo integer not null,
	tipo varchar(15)
);