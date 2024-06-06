

use CPT;

create table tb_usuario (
	id int primary key auto_increment, 
	nome varchar(200),
	senha varchar(200)
);

insert into tb_usuario (nome, senha) values ('admin', 'admin');

select * from tb_usuario;

create table tb_materias(
	id int primary key auto_increment,
	nome varchar(200) not null,
	link_videoaula varchar(255) not null,
    link_exercicio varchar(255) not null
);

select * from tb_materias;

insert into tb_materias(nome, link_videoaula, link_exercicio) values ('Matemática', 'https://www.youtube.com/watch?v=ddZHkCUcYRM&pp=ygUcdmlkZW8gYXVsYSBtYXRlbWF0aWNhIGJhc2ljYQ%3D%3D', 'https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwist-uL3cWGAxXHqpUCHbq9IAoQFnoECAYQAQ&url=https%3A%2F%2Fwww.todamateria.com.br%2Fexercicios-de-matematica-basica%2F&usg=AOvVaw2OYPMy4AnszrkZFb4eSYT3&opi=89978449');
