create database academico;

use academico;

create table tb_usuario (
	id int primary key auto_increment, 
	nome varchar(200),
	senha varchar(200)
);

insert into tb_usuario (nome, senha) values ('admin', 'admin');
insert into tb_usuario (nome, senha) values ('lili', 'cachorra');
select * from tb_usuario;

create table tb_curso(
	id int primary key auto_increment,
	nome varchar(200) not null,
	tipo varchar(200) not null
);

select * from tb_curso;

insert into tb_curso(nome, tipo) values ('Ciência da Computação', 'Bacharelado');
insert into tb_curso(nome, tipo) values ('Análise e Desenvolvimento de Sistemas', 'Tecnólogo');
insert into tb_curso(nome, tipo) values ('Engenharia de Software', 'Bacharelado');

create table tb_aluno(
	RA int primary key,
	nome varchar(200) not null,
	ano_nascimento int not null
);

INSERT INTO tb_aluno (RA, nome, ano_nascimento) VALUES
       (123456, "João Henrique", 2000),
       (345678, "Ana Maria", 2001),
       (875321, "Paulo Rogerio", 2000),
       (456789, "Maria Regina", 1999)
;
select * from tb_aluno;

create table tb_aluno_curso (
	id_curso int not null,
    RA_aluno int not null,
    ano int not null,
    semestre int not null,
    primary key (id_curso, RA_aluno),
    constraint fk_aluno
		foreign key (RA_aluno)
        references tb_aluno (RA)
        on delete no action
        on update cascade,
	constraint fk_curso
		foreign key (id_curso)
        references tb_curso (id)
        on delete no action
        on update cascade
);
INSERT INTO tb_aluno_curso VALUES (1, 123456, 2020, 1);
select * from tb_aluno_curso;