create database dbOs2025;
use dbos2025;

create table tbusuarios(
	iduser int primary key, 
    usuario varchar(15) not null,
    fone varchar(15),
    login varchar(15) not null unique,
    senha varchar(250) not null,
    perfil varchar(20) not null
);

select * from tbusuarios;

describe tbusuarios;

insert into tbusuarios (iduser, usuario, fone, login, senha, perfil)
values (1,"cleber feitosa", '66999326633', "cleber feitosa", "123456",
"Admin");

create table tbclientes(
	idcli int primary key auto_increment,
    nomecli varchar(50) not null,
    endcli varchar(100),
    fonecli varchar(15) not null,
    emailcli varchar(50) unique
);

insert into tbclientes (nomecli, endcli,fonecli, emailcli) values
("João da Silva", "Rua XV", "66-9999-9999", "joao.silva@gmail.com");

select * from tbclientes;

create table tbos(
	os int primary key auto_increment,
    data_os timestamp default current_timestamp,
    tipo varchar(15) not null,
    situacao varchar(20) not null,
    equipamento varchar(150) not null,
    defeito varchar(150),
    servico varchar(150),
    tecnico varchar(30),
    valor decimal(10,2),
    idcli int not null,
    foreign key(idcli) references tbclientes(idcli)
);
INSERT INTO tbclientes (nomecli, endcli, fonecli, emailcli) VALUES 
('Ana Carolina Silva', 'Rua das Flores, 100 - Centro', '(11) 98765-4321', 'ana.silva@email.com'),
('Bruno Eduardo Souza', 'Avenida Paulista, 1500 - Bela Vista', '(21) 99887-7654', 'bruno.souza@email.com'),
('Carlos Alberto Santos', 'Travessa da Saudade, 25 - Vila Maria', '(31) 97654-3210', 'carlos.santos@email.com'),
('Daniela Cristina Lima', 'Rua Brasil, 300 - Jardim América', '(41) 96543-2109', 'daniela.lima@email.com'),
('Eduardo Felipe Pereira', 'Avenida do Contorno, 50 - Savassi', '(51) 95432-1098', 'eduardo.pereira@email.com'),
('Fernanda Gabriela Rocha', 'Alameda dos Anjos, 120 - Graças', '(61) 94321-0987', 'fernanda.rocha@email.com'),
('Gustavo Henrique Costa', 'Rua da Paz, 700 - Boa Viagem', '(71) 93210-9876', 'gustavo.costa@email.com'),
('Isabela Julia Almeida', 'Praça da Liberdade, 8 - Centro', '(81) 92109-8765', 'isabela.almeida@email.com'),
('João Luiz Oliveira', 'Rua Sete de Setembro, 45 - Cambuí', '(91) 91098-7654', 'joao.oliveira@email.com'),
('Larissa Mariana Pires', 'Avenida Quinze, 60 - Morumbi', '(12) 90987-6543', 'larissa.pires@email.com');

