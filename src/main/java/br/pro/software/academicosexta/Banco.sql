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