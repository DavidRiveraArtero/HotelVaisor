Drop table if exists hoteles;
Drop table if exists usuarios;
Drop table if exists reservas;

create table if not exists hoteles(
	id_hotel int auto_increment primary key,
    lugar varchar(255),
    precio_reserva int,
    puntos_hoteles int
);

create table if not exists usuarios(
	id_usuario int auto_increment  primary key,
    nombre varchar(255),
    dni int(8),
    email nvarchar(255),
    contraseña varchar(255)
);

create table if not exists reservas(
	id_reserva int auto_increment primary key,
    precio_reserva int,
    fecha_entrada Date,
    fecha_salida Date,
    id_usuario int,
    id_hotel int,
    foreign key (id_usuario) references usuarios(id_usuario),
    foreign key (id_hotel) references hoteles(id_hotel)
);

insert into hoteles values(1,'Madrid',20,2);

                          
insert into usuarios values(1,'Pepe',49881305,'pepe@gmail.com','pepe86');



insert into reservas values(1,'2022-06-13','2023-07-14',20,1,1);