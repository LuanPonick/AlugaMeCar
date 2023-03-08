USE AlugameCar

CREATE TABLE CLIENTE (
IdCliente int,
Nome varchar (30) not null,
Sobrenome varchar (80) not null,
DtNascimento date not null,
Email varchar (100) not null,
Senha varchar (50),
primary key (IdCliente)
);

insert into CLIENTE 
values

CREATE TABLE EMPRESA (
IdEmpresa int,
IdCarro int,
IdCliente int,
primary key (IdEmpresa),
constraint fk_client_empre foreign key (IdCliente) references CLIENTE (IdCliente),
constraint fk_car_empre foreign key (IdCarro) references CARRO (IdCarro)
);

insert into EMPRESA
values

CREATE TABLE CARRO (
IdCarro int,
Modelo varchar (100),
Cor varchar (20),
Placa varchar (15),
PrecoFIP numeric (8,2),
Marca varchar (50),
primary key (IdCarro)
);

insert into CARRO 
values

CREATE TABLE ENDERECO (
IdCliente int,
IdCarro int,
Cidade varchar (50),
Bairro varchar (50),
NrCasa varchar (10),
Pais varchar (50),
IdEmpresa int,
constraint fk_client_ender foreign key (IdCliente) references CLIENTE (IdCliente),
constraint fk_car_ender foreign key (IdCarro) references CARRO (IdCarro)
);

insert into ENDERECO 
values

CREATE TABLE LOCACAO (
IdLocacao int,
IdCliente int,
IdCarro int,
DtRetirada date,
DtDevolucao date,
LocalRetirada varchar (100),
LocalDevolucao varchar (100),
primary key (IdLocacao),
constraint fk_client_loca foreign key (IdCliente) references CLIENTE (IdCliente),
constraint fk_car_loca foreign key (IdCarro) references CARRO (IdCarro)
);

insert into LOCACAO 
values



